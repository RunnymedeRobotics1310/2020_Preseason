/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.DefaultDriveCommand;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveSubsystem extends Subsystem {

    private final TalonSRX leftTalon = new TalonSRX(RobotMap.LEFT_DRIVE_CAN_ADDRESS);
    private final TalonSRX rightTalon = new TalonSRX(13);
    private DigitalInput forwardLimit = new DigitalInput(RobotMap.FORWARD_LIMIT_DIO_PORT);

    @Override
    public void initDefaultCommand() {
        setDefaultCommand(new DefaultDriveCommand());
    }

    public void setSpeed(double leftSpeed, double rightSpeed) {

        if (!forwardLimit.get()) {
            if (motorSpeeds.left >= 0 || motorSpeeds.right >= 0){
                motorSpeeds.left = 0;
                motorSpeeds.right = 0;
            }
        }

    }
}
