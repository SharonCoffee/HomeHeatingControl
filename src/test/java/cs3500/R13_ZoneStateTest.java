package cs3500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class R13_ZoneStateTest {

    R13_ZoneState zoneState;
    @BeforeEach
    void setUp() { zoneState = new R13_ZoneState();}
        @Test
        @DisplayName("Test if zone is on")
        void zoneStateIsOn() {
            String actualValue = "ON";
            assertEquals(R13_ZoneStateEnum.ON, R13_ZoneStateEnum.valueOf(actualValue));
        }

    @Test
    @DisplayName("Test if zone is off")
    void zoneStateIsOff() {
        String actualValue = "OFF";
        assertEquals(R13_ZoneStateEnum.OFF, R13_ZoneStateEnum.valueOf(actualValue));
    }

    @Test
    @DisplayName("Test if zone on auto mode")
    void zoneStateIsAuto() {
        String actualValue = "AUTO";
        assertEquals(R13_ZoneStateEnum.AUTO, R13_ZoneStateEnum.valueOf(actualValue));
    }

    @Test
    @DisplayName("Test if zone on boost mode")
    void zoneStateIsBoost() {
        String actualValue = "BOOST";
        assertEquals(R13_ZoneStateEnum.BOOST, R13_ZoneStateEnum.valueOf(actualValue));
    }



}