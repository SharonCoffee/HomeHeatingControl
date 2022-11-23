package cs3500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WB6_OffStateTest {

    WB6_OffState offStateController;

    @BeforeEach
    void setUp() {
        offStateController = new WB6_OffState();
    }

    @Test
    @DisplayName("Test if boiler is in off state")
    void testOffStateSwitchesBoilerOff() {
        assertFalse(offStateController.isOn());
    }
}