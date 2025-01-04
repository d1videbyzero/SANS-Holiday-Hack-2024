import pandas as pd
import simplekml

# Load the CSV file
csv_file = "ELF-HAWK-dump-CORRECTED.csv"
df = pd.read_csv(csv_file)

# Create a KML object
kml = simplekml.Kml()

# Loop through the DataFrame and add points to the KML without name
for _, row in df.iterrows():
    kml.newpoint(coords=[(row["OSD.longitude"], row["OSD.latitude"])])

# Save the KML file
kml.save("corrected_output.kml")
print("KML file created: output_without_name.kml")

