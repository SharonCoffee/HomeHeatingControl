package cs3500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class R2_FrostProtectionTest {

    R2_FrostProtection frostProtection;

    @BeforeEach
    void setUp() {

        frostProtection = new R2_FrostProtection();
        
    }

    @Test
    @DisplayName("Test if Frost Protection is turned on")
    void testStateIsOn() {
        String actualValue = "ON";
        assertEquals(R2_FrostProtectionStates.ON, R2_FrostProtectionStates.valueOf(actualValue));
    }

    @Test
    @DisplayName("Test if Frost Protection is turned off")
    void testStateIsOff() {
        String actualValue = "OFF";
        assertEquals(R2_FrostProtectionStates.OFF, R2_FrostProtectionStates.valueOf(actualValue));
    }

    @Test
    @DisplayName("Test if user has not made a selection")
    void testZoneSelection() {
        assertThrows(IllegalArgumentException.class, () -> {
            frostProtection = null;
            if (frostProtection == null) {
                throw new IllegalArgumentException("You must select a zone!");
            }
        });
    }

}