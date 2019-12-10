package frc.robot.oi;

import frc.robot.MotorSpeeds;

public class ArcadeDrive2 {

    public MotorSpeeds calcMotorSpeed(double speed, double turn) {

        MotorSpeeds motorSpeeds = new MotorSpeeds();

        // stop moving
        if (speed == 0 && turn == 0) {
            motorSpeeds.left  = 0;
            motorSpeeds.right = 0;
            return motorSpeeds;
        }

        // move forward or back
        if (speed != 0 && turn == 0) {
            motorSpeeds.left  = speed;
            motorSpeeds.right = speed;
            return motorSpeeds;
        }

        // spin on spot
        if(speed == 0 && turn != 0) {
            motorSpeeds.left  =  turn;
            motorSpeeds.right = -turn;
            return motorSpeeds;
        }

        // move forward and turn to the right
        if (speed > 0 && turn > 0) {
            motorSpeeds.left  = speed;
            motorSpeeds.right = speed - turn;
            return motorSpeeds;
        }

        // move forward and to the left
        if (speed > 0 && turn < 0) {
            motorSpeeds.left  = speed + turn;
            motorSpeeds.right = speed;
            return motorSpeeds;
        }

        // move backward and to the left
        if (speed < 0 && turn > 0) {
            motorSpeeds.left  = speed;
            motorSpeeds.right = speed - turn;
            return motorSpeeds;
        }

        //move backward and to the right
        if (speed < 0 && turn < 0) {
            motorSpeeds.left  = speed + turn;
            motorSpeeds.right = speed;
            return motorSpeeds;
        }

        // Note: this case does not exist
        return motorSpeeds;
    }
}
