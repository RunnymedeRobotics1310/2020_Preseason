package frc.robot.oi;

import frc.robot.MotorSpeeds;

public class ArcadeDrive {

    public MotorSpeeds calcMotorSpeed(double leftYAxis, double rightXAxis) {

        MotorSpeeds motorSpeeds = new MotorSpeeds();
        
        // stop moving
        if (leftYAxis == 0 && rightXAxis == 0) { 
        	motorSpeeds.left = 0;
        	motorSpeeds.right = 0;
        	return motorSpeeds;
        }
        // move forward or back
        if (leftYAxis != 0 && rightXAxis == 0) {
        	motorSpeeds.left = leftYAxis;
        	motorSpeeds.right = leftYAxis;
        	return motorSpeeds;
        }
        // spin on spot
        if(rightXAxis !=0 && leftYAxis == 0) {
        	motorSpeeds.left = rightXAxis;
        	motorSpeeds.right = rightXAxis *-1;
        	return motorSpeeds;
        }
        // move forward and turn to the right
        if (leftYAxis >0 && rightXAxis > 0){
        	motorSpeeds.left = leftYAxis;
        	motorSpeeds.right = leftYAxis - rightXAxis;
        	return motorSpeeds;
        }
        
        // move forward and to the left
        if (leftYAxis > 0 && rightXAxis <0) {
        	motorSpeeds.left = leftYAxis + rightXAxis;
        	motorSpeeds.right = leftYAxis;
        	return motorSpeeds;
        }
        // move backward and to the left
        if (leftYAxis < 0 && rightXAxis >0) {
        	motorSpeeds.left = leftYAxis;
        	motorSpeeds.right = leftYAxis - rightXAxis;
        	return motorSpeeds;
        }
        //move backward and to the right
        if (leftYAxis <0 && rightXAxis <0) {
        	motorSpeeds.left = leftYAxis + rightXAxis;
        	motorSpeeds.right = leftYAxis;
        	return motorSpeeds;
        }
        

        // TODO: Calculate the correct motor speeds

        return motorSpeeds;
    }
}
