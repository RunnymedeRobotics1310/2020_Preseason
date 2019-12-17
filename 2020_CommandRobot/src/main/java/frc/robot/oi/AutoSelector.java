package frc.robot.oi;


import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class AutoSelector {

    public static SendableChooser<String> autoSelector;

    public static final String NONE      = "None";
    public static final String FORWARD_1 = "Forward 1m";
    public static final String FORWARD_2 = "Forward 2m";

    static {
        // Auto Options
        autoSelector = new SendableChooser<String>();
        autoSelector.addOption(FORWARD_1, FORWARD_1);
        autoSelector.addOption(FORWARD_2, FORWARD_2);
        autoSelector.setDefaultOption(NONE, NONE);

        SmartDashboard.putData("Auto Selector", autoSelector);
    }

    public String getSelectedAuto() {

        String selectedAuto = autoSelector.getSelected();

        // If there is nothing selected, then assume arcade
        if (selectedAuto == null) {
            return NONE;
        }
        return selectedAuto;
    }
}
