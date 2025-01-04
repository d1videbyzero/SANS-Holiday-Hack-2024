import pandas as pd
import matplotlib.pyplot as plt
import cartopy.crs as ccrs
import cartopy.feature as cfeature

# Load the CSV file into a DataFrame
csv_file = "ELF-HAWK-dump.csv"
df = pd.read_csv(csv_file)

# Create a Cartopy map
fig, ax = plt.subplots(figsize=(10, 6), subplot_kw={'projection': ccrs.PlateCarree()})

# Add coastlines and gridlines
ax.coastlines()
ax.gridlines()

# Plot the coordinates
ax.scatter(df["OSD.longitude"], df["OSD.latitude"], color='red', marker='o', s=5, transform=ccrs.PlateCarree())

# Show the plot
plt.title("Coordinates on Map with Cartopy")
plt.show()

