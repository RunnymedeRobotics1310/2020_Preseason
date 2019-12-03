package frc.robot.oi;

import frc.robot.MotorSpeeds;

public class ArcadeDrive {

    public MotorSpeeds calcMotorSpeed(double leftYAxis, double rightXAxis) {

        MotorSpeeds motorSpeeds = new MotorSpeeds();
        
        if (Math.abs(leftYAxis) > 0 && rightXAxis == 0) {
        	motorSpeeds.left = leftYAxis;
        	motorSpeeds.right = leftYAxis * -1;
        }
        else if(Math.abs(rightXAxis)>0 && leftYAxis == 0) {
        	motorSpeeds.left = rightXAxis;
        	motorSpeeds.right = rightXAxis;
        }
        else {
        	motorSpeeds.left = leftYAxis;
        	motorSpeeds.right = leftYAxis*-1 / rightXAxis;
        }

        // TODO: Calculate the correct motor speeds

        return motorSpeeds;
    }
}
