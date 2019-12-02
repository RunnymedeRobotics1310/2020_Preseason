package frc.robot.oi;

import edu.wpi.first.wpilibj.Joystick;

public class GameController {

    public static final int A_BUTTON   = 1;

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
        }

        if (Math.abs(stickValue) < 0.05) {
            return 0;
        }

        return stickValue;
    }


}
