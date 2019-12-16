/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.MotorSpeeds;
import frc.robot.Robot;
import frc.robot.oi.DriveSelector;
import frc.robot.oi.GameController;
import frc.robot.oi.TankDrive;

/**
 * An example command.  You can replace me with your own command.
 */
public class DefaultDriveCommand extends Command {

    private TankDrive tankDrive = new TankDrive();

    public DefaultDriveCommand() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.driveSubsystem);
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {

        double leftYAxis  = Robot.oi.getDriveLeftYAxis();
        double rightYAxis = driverController.getAxis(GameController.RIGHT_STICK, GameController.Y_AXIS);
        double rightXAxis = driverController.getAxis(GameController.RIGHT_STICK, GameController.X_AXIS);

        MotorSpeeds motorSpeeds = new MotorSpeeds();

        if (Robot.oi.getSelectedDrive().equals(DriveSelector.TANK_DRIVE)) {
            motorSpeeds = tankDrive.calcMotorSpeed(leftYAxis, rightYAxis);
        }
        else {
            motorSpeeds = arcadeDrive.calcMotorSpeed(leftYAxis, rightXAxis);
        }

        Robot.driveSubsystem.setSpeed(leftSpeed, rightSpeed);
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    }
}
