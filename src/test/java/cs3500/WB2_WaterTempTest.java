package cs3500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WB2_WaterTempTest {

    WB2_WaterTemp waterTempController;
    WB2_WaterTemp waterTempUserInterface;

    @BeforeEach
    void setUp() {
        waterTempController = new WB2_WaterTemp();
        waterTempUserInterface = new WB2_WaterTemp();
    }

    @Test
    @DisplayName("Test if water temperature set by user is valid")
    void testSetTemp() {
        int targetWaterTemp = 20;

        //targetWaterTemp is between 18 and 26 degrees
        assertTrue(targetWaterTemp >= 18 && targetWaterTemp <= 26);

        //the controller replies to user interface that target room temperature is OK
        //the user interface replies to user that target room temperature has been set
        assertTrue(waterTempController.setValidTemp(targetWaterTemp));
        assertTrue(waterTempUserInterface.setValidTemp(targetWaterTemp));
    }

    @Test
    @DisplayName("Test if water temperature set by user is invalid")
    void testSetTempInvalid() {
        int targetWaterTemp = 30;

        //targetWaterTemp is not between 18 and 26 degrees
        assertFalse(targetWaterTemp >= 18 && targetWaterTemp <= 26);

        //the controller replies to user interface that target room temperature is invalid
        //the user interface replies to user that target room temperature has not been set
        assertFalse(waterTempController.setInvalidTemp(targetWaterTemp));
        assertFalse(waterTempUserInterface.setInvalidTemp(targetWaterTemp));
    }
}
