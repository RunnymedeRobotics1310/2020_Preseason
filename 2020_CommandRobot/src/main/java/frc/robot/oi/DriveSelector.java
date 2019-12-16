package frc.robot.oi;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DriveSelector {

	public static SendableChooser<String> driveSelector;

	public static final String TANK_DRIVE   = "Tank Drive";
	public static final String ARCADE_DRIVE = "Arcade Drive";

	static {

		// Robot Position Options
		driveSelector = new SendableChooser<String>();
		driveSelector.addOption(TANK_DRIVE,   TANK_DRIVE);
		driveSelector.setDefaultOption(ARCADE_DRIVE, ARCADE_DRIVE);

		SmartDashboard.putData("Drive Selector", driveSelector);

	}

	public String getDrive() {

		String selectedDrive = driveSelector.getSelected();

		// If there is nothing selected, then assume arcade
		if (selectedDrive == null) {
			return ARCADE_DRIVE;
		}
		return selectedDrive;
	}
}
