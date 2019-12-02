package frc.robot.oi;

import frc.robot.MotorSpeeds;

public class TankDrive {

    public MotorSpeeds calcMotorSpeed(double leftYAxis, double rightYAxis) {

        MotorSpeeds motorSpeeds = new MotorSpeeds();

        motorSpeeds.left  = leftYAxis;
        motorSpeeds.right = rightYAxis;

        return motorSpeeds;
    }
}
