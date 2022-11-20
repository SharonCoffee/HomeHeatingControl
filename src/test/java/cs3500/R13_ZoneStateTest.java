package cs3500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class R13_ZoneStateTest {

    R13_ZoneState zonestate;
    @BeforeEach
    void setUp() { zonestate = new R13_ZoneState();}
        @Test
        @DisplayName("Test if zone is on")
        void zonestateIsOn() {
            String actualValue = "ON";
            assertEquals(R13_ZoneStateEnum.ON, R13_ZoneStateEnum.valueOf(actualValue));
        }

    @Test
    @DisplayName("Test if zone is off")
    void zonestateIsOff() {
        String actualValue = "OFF";
        assertEquals(R13_ZoneStateEnum.OFF, R13_ZoneStateEnum.valueOf(actualValue));
    }

    @Test
    @DisplayName("Test if zone is off")
    void zonestateIsAuto() {
        String actualValue = "AUTO";
        assertEquals(R13_ZoneStateEnum.AUTO, R13_ZoneStateEnum.valueOf(actualValue));
    }



}