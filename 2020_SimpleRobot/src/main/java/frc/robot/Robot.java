/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.oi.ArcadeDrive;
import frc.robot.oi.DriveSelector;
import frc.robot.oi.GameController;
import frc.robot.oi.TankDrive;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends TimedRobot {

	// User Interface
	private final GameController driverController = new GameController(RobotMap.DRIVER_CONTROLLER);

	private final TalonSRX leftTalon = new TalonSRX(RobotMap.LEFT_DRIVE_CAN_ADDRESS);
	private final TalonSRX rightTalon = new TalonSRX(13);

	private TankDrive tankDrive = new TankDrive();
	private ArcadeDrive arcadeDrive = new ArcadeDrive();

	private DriveSelector driveSelector = new DriveSelector();
	private DigitalInput forwardLimit = new DigitalInput(RobotMap.FORWARD_LIMIT_DIO_PORT);



	/**
	 * This function is run when the robot is first started up and should be used
	 * for any initialization code.
	 */
	@Override
	public void robotInit() {
	}

	/**
	 * This function is run once each time the robot enters autonomous mode.
	 */
	@Override
	public void disabledInit() {
	}

	/**
	 * This function is called periodically during disabled mode.
	 */
	@Override
	public void disabledPeriodic() {
		updateSmartDashboard();
	}

	/**
	 * This function is run once each time the robot enters autonomous mode.
	 */
	@Override
	public void autonomousInit() {
	}

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() {
		updateSmartDashboard();
	}

	/**
	 * This function is called once each time the robot enters teleoperated mode.
	 */
	@Override
	public void teleopInit() {
	}

	/**
	 * This function is called periodically during teleoperated mode.
	 */
	@Override
	public void teleopPeriodic() {

		double leftYAxis  = driverController.getAxis(GameController.LEFT_STICK,  GameController.Y_AXIS);
		double rightYAxis = driverController.getAxis(GameController.RIGHT_STICK, GameController.Y_AXIS);
		double rightXAxis = driverController.getAxis(GameController.RIGHT_STICK, GameController.X_AXIS);

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

		leftTalon .set(ControlMode.PercentOutput, -motorSpeeds.left);
		rightTalon.set(ControlMode.PercentOutput, motorSpeeds.right);


		updateSmartDashboard();
	}

	/**
	 * This function is called once each time the robot enters test mode.
	 */
	@Override
	public void testInit() {
	}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {
		updateSmartDashboard();
	}

	private void updateSmartDashboard() {
		SmartDashboard.putString("Driver Controller", driverController.toString());
		SmartDashboard.putNumber("Left Y Axis",Math.round(driverController.getAxis(GameController.LEFT_STICK, GameController.Y_AXIS)*100)/100.0);
		SmartDashboard.putNumber("Right Y Axis",Math.round(driverController.getAxis(GameController.RIGHT_STICK, GameController.Y_AXIS)*100)/100.0);
		SmartDashboard.putNumber("Right X Axis",Math.round(driverController.getAxis(GameController.RIGHT_STICK, GameController.X_AXIS)*100)/100.0);
		SmartDashboard.putBoolean("Forward Limit", !forwardLimit.get());
	}
}
