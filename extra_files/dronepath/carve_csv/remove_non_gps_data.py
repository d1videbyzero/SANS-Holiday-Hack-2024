import pandas as pd

# Input and output file paths
input_csv = "ELF-HAWK-dump.csv"  # Replace with your input CSV file name
output_csv = "filtered_output.csv"  # Replace with your desired output file name

# Read the entire CSV file into a DataFrame
try:
    df = pd.read_csv(input_csv)

    # Check if the column 'OSD.isGPSUsed' exists
    if "OSD.isGPSUsed" not in df.columns:
        raise ValueError("The column 'OSD.isGPSUsed' does not exist in the input CSV.")

    # Filter rows where 'OSD.isGPSUsed' is 'TRUE' (case-insensitive)
    filtered_df = df[df["OSD.isGPSUsed"] == True]

    # Save the filtered DataFrame to a new CSV file
    filtered_df.to_csv(output_csv, index=False)

    print(f"Filtered data has been saved to {output_csv}.")
except FileNotFoundError:
    print(f"Error: The file {input_csv} was not found.")
except Exception as e:
    print(f"An error occurred: {e}")

