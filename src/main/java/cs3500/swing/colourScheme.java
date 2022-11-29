package cs3500.swing;

import cs3500.operate.R13_ZoneState;
import cs3500.operate.R13_ZoneStateEnum;

import java.awt.Color;
import java.util.Map;
import java.util.TreeMap;

public class colourScheme {

    private static Map<R13_ZoneStateEnum, colourScheme> colourMap = new TreeMap<R13_ZoneStateEnum, colourScheme>();

    public final Color BOTTOM;
    public final Color TOP;
    public final Color SETPOINT;

    public final Color SETPOINT_CHANGING;
    public final Color ERROR;
    
    public final Color OFF;
    public final Color GREEN;
    public final Color NOTICE_DEFAULT;
    public final Color NOTICE_ACTIVE;
    public final Color BACKGROUND;


    public colourScheme(Color bottom, Color top, Color setpoint, Color setpoint_changing, Color error, Color off, Color green, Color notice_default, Color notice_active, Color background) {
        this.BOTTOM = bottom;
        this.TOP = top;
        this.SETPOINT = setpoint;
        this.SETPOINT_CHANGING = setpoint_changing;
        this.ERROR = error;
        this.OFF = off;
        this.GREEN = green;
        this.NOTICE_DEFAULT = notice_default;
        this.NOTICE_ACTIVE = notice_active;
        this.BACKGROUND = background;
    }

    public static colourScheme getScheme(R13_ZoneStateEnum zoneState) {
        if (colourMap.isEmpty()) {
            colourMap.put(R13_ZoneState.getZoneStateOn(), onState);
            colourMap.put(R13_ZoneState.getZoneStateOff(), offState);
            colourMap.put(R13_ZoneState.getZoneStateAuto(), autoState);
            colourMap.put(R13_ZoneState.getZoneStateBoost(), boostState);
        }
        if (zoneState == null) {
            zoneState = R13_ZoneState.getZoneStateOn();
        }
        return colourMap.get(zoneState);
    }

    public static colourScheme onState = new colourScheme(
            new Color(240, 70, 10),  // F0460A ORANGE-RED
            new Color(10, 70, 240),  // 0A46F0 BLUE
            new Color(255, 160, 48), // FFA030
            Color.YELLOW,
            Color.RED.darker().darker(),
            Color.GRAY,
            Color.GREEN,
            new Color(0x55, 0x55, 0x55), // DARK GRAY
            Color.YELLOW,
            Color.BLACK);

    public static colourScheme offState = new colourScheme(
            Color.GRAY,
            Color.BLACK,
            Color.WHITE,
            Color.YELLOW,
            Color.RED.darker().darker(),
            Color.GRAY,
            Color.GREEN,
            new Color(0x55, 0x55, 0x55), // DARK GRAY
            Color.YELLOW,
            Color.BLACK);

    public static colourScheme autoState = new colourScheme(
            new Color(200, 70, 160),  // F0460A ORANGE-RED
            new Color(50, 70, 240),  // 0A46F0 BLUE
            new Color(48, 160, 255), // 30A0FF
            Color.YELLOW,
            Color.RED.darker().darker(),
            Color.GRAY,
            Color.GREEN,
            new Color(0x55, 0x55, 0x55), // DARK GRAY
            Color.YELLOW,
            Color.BLACK);

    public static colourScheme boostState = new colourScheme(
            new Color(240, 70, 240),
            new Color(50, 130, 120),
            new Color(48, 160, 255),
            Color.YELLOW,
            Color.RED.darker().darker(),
            Color.GRAY,
            Color.GREEN,
            new Color(0x55, 0x55, 0x55), // DARK GRAY
            Color.YELLOW,
            Color.BLACK);


}
