package cs3500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class R15_TargetWaterTempTest {

    int cMIN_WATER_TEMP = 55;
    int cMAX_WATER_TEMP = 80;

    R15_TargetWaterTemp targetWaterTemp;
    @BeforeEach
    void setUp() {
        targetWaterTemp = new R15_TargetWaterTemp();
    }

    @Test
    @DisplayName("Water temperature is set by user")
    void waterTemperatureSet() {
        int SET_TARGET_WATER_TEMP = 60;
        targetWaterTemp.setTargetWaterTempValue(SET_TARGET_WATER_TEMP);
        assertEquals(SET_TARGET_WATER_TEMP, targetWaterTemp.getTargetWaterTempValue());
    }

    @Test
    @DisplayName("Check water temperature set within bounds")
    void waterTemperatureSetWithinBounds() {
        int SET_TARGET_WATER_TEMP = 60;
        assertTrue(targetWaterTemp.setTargetWaterTempValueWithinBounds(SET_TARGET_WATER_TEMP, cMIN_WATER_TEMP, cMAX_WATER_TEMP));
    }

    @Test
    @DisplayName("Check water temperature set by user is not lower than the minimum water temperature")
    void waterTemperatureSetLowerThanMinimum() {
        int SET_TARGET_WATER_TEMP = 54;
        assertFalse(SET_TARGET_WATER_TEMP >= cMIN_WATER_TEMP);
    }

    @Test
    @DisplayName("Check water temperature set by user is not higher than the maximum water temperature")
    void waterTemperatureSetHigherThanMaximum() {
        int SET_TARGET_WATER_TEMP = 81;
        assertFalse(SET_TARGET_WATER_TEMP <= cMAX_WATER_TEMP);
    }
}
