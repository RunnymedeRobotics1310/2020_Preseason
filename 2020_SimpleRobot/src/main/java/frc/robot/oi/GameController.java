package frc.robot.oi;

import edu.wpi.first.wpilibj.Joystick;

public class GameController {

	public static final int A_BUTTON        = 1;
	public static final int B_BUTTON        = 2;
	public static final int X_BUTTON        = 3;
	public static final int Y_BUTTON        = 4;
	public static final int LEFT_BUMPER     = 5;
	public static final int RIGHT_BUMPER    = 6;
	public static final int VIEW_BUTTON     = 7;
	public static final int MENU_BUTTON     = 8;

    public static final int LEFT_STICK_BUTTON = 9;
    public static final int RIGHT_STICK_BUTTON = 10;

	public static final int X_AXIS          = 15;
	public static final int Y_AXIS          = 16;
	
	public static final double LEFT_TRIGGER = 17;
	public static final double RIGHT_TRIGGER = 18;

	public static final int LEFT_STICK      = 20;
	public static final int RIGHT_STICK     = 21;



	private Joystick joystick;

	public GameController (int driverStationPort) {
		joystick = new Joystick(driverStationPort);
	}

	public double getAxis(int stick, int axis) {

		double stickValue = 0;

		if (stick == LEFT_STICK) {

			if (axis == Y_AXIS) {
				stickValue = -joystick.getRawAxis(1);
			}

			if (axis == X_AXIS) {
				stickValue = joystick.getRawAxis(0);
			}
		}

		if (stick == RIGHT_STICK) {

			if (axis == Y_AXIS) {
				stickValue = -joystick.getRawAxis(5);
			}

			if (axis == X_AXIS) {
				stickValue = joystick.getRawAxis(4);
			}
		}

		if (Math.abs(stickValue) < 0.05) {
			return 0;
		}

		return Math.round(stickValue * 100) / 100.0d;
	}

	public boolean getButton(int button) {

		boolean buttonValue = false;

		if (button == A_BUTTON) {
			buttonValue = joystick.getRawButtonPressed(1);
		}

		if (button == B_BUTTON) {
			buttonValue = joystick.getRawButtonPressed(2);
		}

		if (button == X_BUTTON) {
			buttonValue = joystick.getRawButtonPressed(3);
		}

		if (button == Y_BUTTON) {
			buttonValue = joystick.getRawButtonPressed(4);
		}

		if (button == LEFT_BUMPER) {
			buttonValue = joystick.getRawButtonPressed(5);
		}


		if (button == RIGHT_BUMPER) {
            buttonValue = joystick.getRawButtonPressed(6);
        }
        
        if (button == VIEW_BUTTON) {
            buttonValue = joystick.getRawButtonPressed(7);
        }

        if (button == RIGHT_BUMPER) {
			buttonValue = joystick.getRawButtonPressed(6);
		}

		if (button == VIEW_BUTTON) {
			buttonValue = joystick.getRawButtonPressed(7);
		}

		
		if (button == MENU_BUTTON) {
			buttonValue = joystick.getRawButtonPressed(8);
		}

		if (button == LEFT_STICK_BUTTON) {
			buttonValue = joystick.getRawButtonPressed(9);
		}

		if (button == RIGHT_STICK_BUTTON) {
			buttonValue = joystick.getRawButtonPressed(10);
		}


		return buttonValue;
    }
    
    // Trigger buttons
    public double getTrigger(double trigger) {
    	
      double triggerValue = 0;
      
      if (trigger == LEFT_TRIGGER) {
      		triggerValue = joystick.getRawAxis(2); 
      }	
      
      if (trigger == RIGHT_TRIGGER) {
     		triggerValue = joystick.getRawAxis(3); 
      }
      
      return triggerValue;
   	
    }
    
	


	@Override
	public String toString() {

		String out = "";

        double leftX = getAxis(LEFT_STICK, X_AXIS);
        double leftY = getAxis(LEFT_STICK, Y_AXIS);
        double rightX = getAxis(RIGHT_STICK, X_AXIS);
        double rightY = getAxis(RIGHT_STICK, Y_AXIS);
        double rightTrigger = getTrigger(LEFT_TRIGGER);
        double leftTrigger = getTrigger(RIGHT_TRIGGER);
        

        out += "(" + leftX + ", " + leftY + ") (" + rightX + "," + rightY + ")";
        out += "Left Trigger (" + leftTrigger + ") Right Trigger (" + rightTrigger + ")";
        
        
        if (getButton(A_BUTTON)) {
        	out += " A";
        }
        if (getButton(B_BUTTON)) {
        	out += " B";
        }
        if (getButton(X_BUTTON)) {
        	out += " X";
        }
        if (getButton(Y_BUTTON)) {
        	out += " Y";
        }
        if (getButton(LEFT_BUMPER)) {
        	out += " Left Bumper";
        }
        if (getButton(RIGHT_BUMPER)) {
        	out += " Right Bumper";
        }
        if (getButton(VIEW_BUTTON)) {
        	out += " View Button";
        }
        if (getButton(MENU_BUTTON)) {
        	out += " Menu Button";
        }
        if (getButton(LEFT_STICK_BUTTON)) {
        	out += " Left Stick Button";
        }
        if (getButton(RIGHT_STICK_BUTTON)) {
        	out += " Right Stick Button";
        }
        
        
        
		

		return out;
	}
}
