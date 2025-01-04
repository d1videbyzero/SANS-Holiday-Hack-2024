import pandas as pd
import folium

# Load the CSV file into a DataFrame
csv_file = "ELF-HAWK-dump-CORRECTED.csv"
df = pd.read_csv(csv_file)

# Create a base map (zoomed to a specific location, you can adjust the center as needed)
# Initial location: Center of the USA
m = folium.Map(location=[37.0902, -95.7129], zoom_start=4)

# Loop through the DataFrame and add points to the map
for _, row in df.iterrows():
    # Add a marker with popup
    folium.Marker(
        location=[row["OSD.latitude"], row["OSD.longitude"]],
        icon=folium.DivIcon(html=f"""<div style="color:black">o</div>""")
    ).add_to(m)

    #folium.Circle(location=[row["OSD.latitude"], row["OSD.longitude"]], radius=4000, fill_color="orange", fill_opacity=0.4, color="black", weight=1)

# Save the map to an HTML file
m.save("corrected_map.html")
print("Map saved as corrected_map.html")

