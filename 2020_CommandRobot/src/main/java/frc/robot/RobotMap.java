/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	/*
	 * Define all of the drive motors
	 */
	public static final int LEFT_DRIVE_CAN_ADDRESS     = 11;
	public static final int LEFT_FOLLOWER_CAN_ADDRESS  = 12;
	public static final int RIGHT_DRIVE_CAN_ADDRESS    = 13;
	public static final int RIGHT_FOLLOWER_CAN_ADDRESS = 14;

	// Define Sensors
	public static final int FORWARD_LIMIT_DIO_PORT = 1;

	/*
	 * Driver and Operator controller locations (default)
	 */
	public static final int DRIVER_CONTROLLER = 0;
	public static final int OPERATOR_CONTROLLER = 1;
}
