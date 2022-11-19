package cs3500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class R8_AlertsTest {

    R8_Alerts alerts;

    @BeforeEach
    void setUp() {
        alerts = new R8_Alerts();
    }

    @Test
    @DisplayName("Test if Alert is turned on")
    void testStateIsOn() {
        String actualValue = "ON";
        assertEquals(R8_AlertStates.ON, R8_AlertStates.valueOf(actualValue));
    }

    @Test
    @DisplayName("Test if Alert is turned off")
    void testStateIsOff() {
        String actualValue = "OFF";
        assertEquals(R8_AlertStates.OFF, R8_AlertStates.valueOf(actualValue));
    }
}