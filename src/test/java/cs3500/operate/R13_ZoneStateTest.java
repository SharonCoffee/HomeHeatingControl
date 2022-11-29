package cs3500.operate;

import cs3500.operate.R13_ZoneState;
import cs3500.operate.R13_ZoneStateEnum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class R13_ZoneStateTest {

    R13_ZoneState zoneState;

    @BeforeEach
    void setUp() {
        zoneState = new R13_ZoneState();
    }

    @Test
    @DisplayName("Test if zone is on")
    void zoneStateIsOn() {
        String actualValue = "ON";
        assertEquals(R13_ZoneStateEnum.ON, R13_ZoneState.getZoneStateOn());
    }

    @Test
    @DisplayName("Test if zone is off")
    void zoneStateIsOff() {
        String actualValue = "OFF";
        assertEquals(R13_ZoneStateEnum.OFF, R13_ZoneState.getZoneStateOff());
    }

    @Test
    @DisplayName("Test if zone on auto mode")
    void zoneStateIsAuto() {
        String actualValue = "AUTO";
        assertEquals(R13_ZoneStateEnum.AUTO, R13_ZoneState.getZoneStateAuto());
    }

    @Test
    @DisplayName("Test if zone on boost mode")
    void zoneStateIsBoost() {
        String actualValue = "BOOST";
        assertEquals(R13_ZoneStateEnum.BOOST, R13_ZoneState.getZoneStateBoost());
    }
/*
    @Test
    @DisplayName("Test if zone getting states")
    void zoneStateIsGetting() {
        String actualValue = "OFF";
        zoneState.setOff(R13_ZoneStateEnum.valueOf(actualValue));
        assertEquals(R13_ZoneStateEnum.valueOf(zoneState.getZoneStateOff()), R13_ZoneStateEnum.valueOf(actualValue));


    }

    @Test
    @DisplayName("Test if zone setting states")
    void zoneStateIsSetting() {
        //R13_ZoneStateEnum actualValue = "ON";
        zoneState.setOn(R13_ZoneStateEnum.valueOf("ON"));
        assertEquals(R13_ZoneStateEnum.valueOf(zoneState.setOn("ON")), R13_ZoneStateEnum.valueOf("ON"));


    }
*/

}