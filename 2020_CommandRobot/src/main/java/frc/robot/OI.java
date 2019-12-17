/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.oi.DriveSelector;
import frc.robot.oi.GameController;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

    private final GameController driverController = new GameController(RobotMap.DRIVER_CONTROLLER);
    private DriveSelector driveSelector = new DriveSelector();

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

        return driveSelector.getDrive();



    }

    public void periodic() {
        SmartDashboard.putString("Driver Controller", driverController.toString());
        SmartDashboard.putNumber("Left Stick", GameController.LEFT_STICK);
        SmartDashboard.putNumber("Right Stick", GameController.RIGHT_STICK);
    }


}