/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import frc.robot.oi.DriveSelector;
import frc.robot.oi.GameController;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	private final GameController driverController = new GameController(RobotMap.DRIVER_CONTROLLER);

	public double getDriveLeftYAxis() {
		return driverController.getAxis(GameController.LEFT_STICK,  GameController.Y_AXIS);
	}

	public double getDriveRightYAxis() {
		return driverController.getAxis(GameController.RIGHT_STICK, GameController.Y_AXIS);
	}

	public double getDriveRightXAxis() {
		return driverController.getAxis(GameController.RIGHT_STICK, GameController.X_AXIS);
	}

	public String getSelectedDrive() {
		MotorSpeeds motorSpeeds = new MotorSpeeds();


		if (driveSelector.getDrive().equals(DriveSelector.TANK_DRIVE)) {
			motorSpeeds = tankDrive.calcMotorSpeed(leftYAxis, rightYAxis);
		}
		else {
			motorSpeeds = arcadeDrive.calcMotorSpeed(leftYAxis, rightXAxis);
		}
		if (!forwardLimit.get()) {
			if (motorSpeeds.left >= 0 || motorSpeeds.right >= 0){
				motorSpeeds.left = 0;
				motorSpeeds.right = 0;
			}
		}


	}


}