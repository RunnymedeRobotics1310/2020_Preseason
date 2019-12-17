package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class DriveDistanceCommand extends Command {

    double distanceInches;

    public DriveDistanceCommand(double distanceInches) {
        this.distanceInches = distanceInches;
        requires(Robot.driveSubsystem);
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    	Robot.driveSubsystem.setSpeed(0.3, 0.3); 
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
    	
    	if (Robot.driveSubsystem.getDistanceInches() >= distanceInches) {
    		return true;
    	}
    	return false;
    }

    @Override
    protected void end() {
    	Robot.driveSubsystem.setSpeed(0.0, 0.0);

    }


}
