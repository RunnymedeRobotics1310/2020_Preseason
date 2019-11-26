/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends TimedRobot {

	// User Interface
	private final Joystick driverJoystick = new Joystick(0);

	private final TalonSRX leftTalon = new TalonSRX(11);
	private final TalonSRX rightTalon = new TalonSRX(13);

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
		System.out.println(driverJoystick.getRawAxis(1));
		System.out.println(driverJoystick.getRawAxis(5));
		SmartDashboard.putNumber("leftDrive",Math.round(driverJoystick.getRawAxis(1)*100)/100.0);
		SmartDashboard.putNumber("rightDrive",Math.round(driverJoystick.getRawAxis(5)*100)/100.0);
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


		if (driverJoystick.getRawAxis(1) < 0.05 && driverJoystick.getRawAxis(1) > -0.05) {
			leftTalon.set(ControlMode.PercentOutput, 0);
		}
		else
			leftTalon.set(ControlMode.PercentOutput, driverJoystick.getRawAxis(1));


		if (driverJoystick.getRawAxis(5) < 0.05 && driverJoystick.getRawAxis(5) > -0.05) {
			rightTalon.set(ControlMode.PercentOutput, 0);
		}
		else
			rightTalon.set(ControlMode.PercentOutput, driverJoystick.getRawAxis(5));




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
	}
}
