package frc.robot.oi;

import edu.wpi.first.wpilibj.Joystick;

public class GameController {

    public static final int A_BUTTON      = 1;
    public static final int B_BUTTON      = 2;
    public static final int X_BUTTON      = 3;
    public static final int Y_BUTTON      = 4;
    public static final int RIGHT_BUMPER  = 5;
    public static final int LEFT_BUMPER   = 6;
    public static final int RIGHT_STICKBUTTON = 7;
    public static final int LEFT_STICKBUTTON  = 8;
    public static final int RIGHT_TRIGGER     = 9;
    public static final int LEFT_TRIGGER      = 10;
    
    
    public static final int X_AXIS     = 10;
    public static final int Y_AXIS     = 11;

    public static final int LEFT_STICK  = 20;
    public static final int RIGHT_STICK = 21;
    

    private Joystick joystick;

    public GameController (int driverStationPort) {
        joystick = new Joystick(driverStationPort);
    }

    public double getAxis(int stick, int axis) {

        double stickValue = 0;

        if (stick == LEFT_STICK) {

            if (axis == Y_AXIS) {
                stickValue = joystick.getRawAxis(1);
            }
            if (axis == X_AXIS)
            {
            	stickValue = joystick.getRawAxis(2);
            }
        }
        

        if (Math.abs(stickValue) < 0.05) {
            return 0;
        }

        return Math.round(stickValue * 100) / 100.0d;
    }


}
