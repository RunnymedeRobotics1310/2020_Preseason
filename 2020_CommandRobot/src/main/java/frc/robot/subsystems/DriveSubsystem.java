/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.MotorSpeeds;
import frc.robot.RobotMap;
import frc.robot.commands.DefaultDriveCommand;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveSubsystem extends Subsystem {

	private final TalonSRX leftTalon = new TalonSRX(RobotMap.LEFT_DRIVE_CAN_ADDRESS);
	private final TalonSRX rightTalon = new TalonSRX(13);
	private final DigitalInput forwardLimit = new DigitalInput(RobotMap.FORWARD_LIMIT_DIO_PORT);

	public DriveSubsystem() {
		leftTalon .configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0,  0);
		leftTalon .setSelectedSensorPosition(0);
		rightTalon.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0,  0);
		rightTalon.setSelectedSensorPosition(0);
	}

	@Override
	public void initDefaultCommand() {
		setDefaultCommand(new DefaultDriveCommand());
	}

	public void setSpeed(MotorSpeeds motorSpeeds) {
		setSpeed(motorSpeeds.left, motorSpeeds.right);
	}

	public void setSpeed(double leftSpeed, double rightSpeed) {

		if (!forwardLimit.get()) {
			if (leftSpeed >= 0 || rightSpeed >= 0){
				leftSpeed = 0;
				rightSpeed = 0;
			}
		}

		leftTalon.set(ControlMode.PercentOutput, -leftSpeed);
		rightTalon.set(ControlMode.PercentOutput, rightSpeed);
	}

	public double getDistance() {
		return leftTalon.getSelectedSensorPosition(0);
	}

	@Override
	public void periodic() {
		SmartDashboard.putBoolean("Forward Limit", !forwardLimit.get());
		SmartDashboard.putNumber("Left Motor", leftTalon.getMotorOutputPercent());
		SmartDashboard.putNumber("Right Motor", rightTalon.getMotorOutputPercent());
		SmartDashboard.putNumber("Distance (inches)", getDistance() * 53);
		SmartDashboard.putNumber("Distance (encoder)", getDistance());
	}


}
