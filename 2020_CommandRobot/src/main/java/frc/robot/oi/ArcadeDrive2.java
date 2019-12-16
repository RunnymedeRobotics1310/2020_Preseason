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

        // Forward
        if (speed > 0) {

            // move forward and turn to the right
            if (turn > 0) {

                motorSpeeds.left  = speed;
                motorSpeeds.right = speed - turn;

            }
            else {

                // move forward and to the left
                motorSpeeds.left  = speed + turn;
                motorSpeeds.right = speed;

            }

        }
        else { // Backward

            if (turn > 0) {

                // move backward and to the left
                motorSpeeds.left  = speed;
                // FIXME: Subtracting a positive (turn is positive) from a negative (speed is negative)
                // makes the number more negative and could go past -1.0 which is not possible
                // Think about slowing the left wheel instead of speeding up the right.
                motorSpeeds.right = speed - turn;

            }
            else { // turn < 0

                // move backward and to the right
                // FIXME: Same comment as above
                motorSpeeds.left  = speed + turn;
                motorSpeeds.right = speed;
            }
        }

        return motorSpeeds;
    }
}
