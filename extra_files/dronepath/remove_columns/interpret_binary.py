import pandas as pd

# Input file path
input_csv = "ELF-HAWK-dump-CORRECTED.csv"  # Replace with your input CSV file

# List of columns to process as binary
binary_columns = ["OSD.isGPSUsed", "OSD.isSwaveWork", "OSD.waveError", "OSD.isOnGround", "OSD.isMotorOn", "OSD.isMotorBlocked", "OSD.isImuPreheated", "OSD.isAcceletorOverRange", "OSD.isBarometerDeadInAir", "OSD.isCompassError", "OSD.isGoHomeHeightModified", "OSD.canIOCWork", "OSD.isNotEnoughForce", "OSD.isOutOfLimit", "OSD.isPropellerCatapult", "OSD.isVibrating", "OSD.isVisionUsed", "GIMBAL.isPitchAtLimit", "GIMBAL.isRollAtLimit", "GIMBAL.isYawAtLimit", "GIMBAL.isStuck", "CAMERA.isPhoto", "CAMERA.isVideo", "CAMERA.sdCardIsInserted", "RC.goHomeDepressed", "RC.recordDepressed", "RC.shutterDepressed", "RC.playbackDepressed", "RC.wheelDepressed", "RC.custom1Depressed", "RC.custom2Depressed", "RC.custom3Depressed", "RC.custom4Depressed", "BATTERY.isCellVoltageEstimated", "BATTERY.isCellVoltageDeviationHigh", "BATTERY.isVoltageLow", "BATTERY.lowWarningGoHome", "BATTERY.seriousLowWarningLanding", "MC.isObstacleAvoidanceEnabled", "MC.isCollisionAvoidanceEnabled", "MC.isRthObstacleAvoidanceEnabled", "MC.isBraking", "MC.isAvoidingObstacle", "MC.isAvoidingActiveObstacle", "MC.isAscentLimitedByObstacle", "MC.isLandingConfirmationNeeded", "MC.atLowAltitudeLimit", "MC.atDistanceLimit", "MC.atAirportAltitudeLimit", "MC.atAirportBoundary", "HOME.isHomeRecord", "HOME.isDynamicHomePointEnabled", "HOME.isReachedLimitDistance", "HOME.isReachedLimitHeight", "HOME.isCompassCalibrating", "HOME.isMultipleFlightModeEnabled", "HOME.isBeginnerMode", "HOME.isIOCEnabled"]  # Replace with your column names

try:
    # Load the CSV file
    df = pd.read_csv(input_csv, dtype=str)
    
    # Check if all binary columns exist in the file
    missing_columns = [col for col in binary_columns if col not in df.columns]
    if missing_columns:
        raise ValueError(f"The following columns are missing from the input file: {missing_columns}")
    
    # Extract the specified columns
    #binary_data = df[binary_columns].iloc[1:]  # Exclude the header row
    binary_data = df[binary_columns]  # Exclude the header row
    
    # Process each row as binary
    results = []
    for _, row in binary_data.iterrows():
        binary_string = ''.join('1' if val.upper() == 'TRUE' else '0' for val in row.astype(str))
        results.append((binary_string))
        print(binary_string)
    
except FileNotFoundError:
    print(f"Error: The file {input_csv} was not found.")
except ValueError as ve:
    print(f"Error: {ve}")
except Exception as e:
    print(f"An unexpected error occurred: {e}")

