import pandas as pd

# Input and output file paths
input_csv = "input.csv"  # Replace with your input CSV file
output_csv = "output.csv"  # Replace with your desired output file

# List of columns to keep
columns_to_keep = ["OSD.isGPSUsed", "OSD.isSwaveWork", "OSD.waveError", "OSD.isOnGround", "OSD.isMotorOn", "OSD.isMotorBlocked", "OSD.isImuPreheated", "OSD.isAcceletorOverRange", "OSD.isBarometerDeadInAir", "OSD.isCompassError", "OSD.isGoHomeHeightModified", "OSD.canIOCWork", "OSD.isNotEnoughForce", "OSD.isOutOfLimit", "OSD.isPropellerCatapult", "OSD.isVibrating", "OSD.isVisionUsed", "GIMBAL.isPitchAtLimit", "GIMBAL.isRollAtLimit", "GIMBAL.isYawAtLimit", "GIMBAL.isStuck", "CAMERA.isPhoto", "CAMERA.isVideo", "CAMERA.sdCardIsInserted", "RC.goHomeDepressed", "RC.recordDepressed", "RC.shutterDepressed", "RC.playbackDepressed", "RC.wheelDepressed", "RC.custom1Depressed", "RC.custom2Depressed", "RC.custom3Depressed", "RC.custom4Depressed", "BATTERY.isCellVoltageEstimated", "BATTERY.isCellVoltageDeviationHigh", "BATTERY.isVoltageLow", "BATTERY.lowWarningGoHome", "BATTERY.seriousLowWarningLanding", "MC.isObstacleAvoidanceEnabled", "MC.isCollisionAvoidanceEnabled", "MC.isRthObstacleAvoidanceEnabled", "MC.isBraking", "MC.isAvoidingObstacle", "MC.isAvoidingActiveObstacle", "MC.isAscentLimitedByObstacle", "MC.isLandingConfirmationNeeded", "MC.atLowAltitudeLimit", "MC.atDistanceLimit", "MC.atAirportAltitudeLimit", "MC.atAirportBoundary", "HOME.isHomeRecord", "HOME.isDynamicHomePointEnabled", "HOME.isReachedLimitDistance", "HOME.isReachedLimitHeight", "HOME.isCompassCalibrating", "HOME.isMultipleFlightModeEnabled", "HOME.isBeginnerMode", "HOME.isIOCEnabled"]  # Replace with your column names

try:
    # Load the CSV file
    df = pd.read_csv(input_csv)
    
    # Check if all columns to keep exist in the file
    missing_columns = [col for col in columns_to_keep if col not in df.columns]
    if missing_columns:
        raise ValueError(f"The following columns are missing from the input file: {missing_columns}")
    
    # Keep only the specified columns
    filtered_df = df[columns_to_keep]
    
    # Save the filtered DataFrame to a new CSV file
    filtered_df.to_csv(output_csv, index=False)
    
    print(f"The filtered CSV file has been saved to {output_csv}.")
except FileNotFoundError:
    print(f"Error: The file {input_csv} was not found.")
except ValueError as ve:
    print(f"Error: {ve}")
except Exception as e:
    print(f"An unexpected error occurred: {e}")

