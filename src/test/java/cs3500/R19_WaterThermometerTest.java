package cs3500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class R19_WaterThermometerTest {

    R19_WaterThermometer waterThermostat;

    int WATER_TEMP_DEVIATION = 1;


    @BeforeEach
    void setUp() {

        waterThermostat = new R19_WaterThermometer();
     }



    @Test
    @DisplayName("Test change in current water temperature when current water temperature is below target water temperature")
    void testChangeCurrentWaterTemperatureBelowTarget() {
        int CURRENT_WATER_TEMPERATURE_VALUE = 35;
        int TARGET_WATER_TEMPERATURE_VALUE = 60;
        for (int waterTemperature = CURRENT_WATER_TEMPERATURE_VALUE; waterTemperature < TARGET_WATER_TEMPERATURE_VALUE; waterTemperature++) {
            waterThermostat.setCurrentWaterTemperature(waterTemperature);
            assertTrue(waterThermostat.isHeating());
        }

    }

    @Test
    @DisplayName("Test change in current water temperature when current water temperature is above target water temperature")
    void testChangeCurrentWaterTemperatureAboveTarget() {
        int CURRENT_WATER_TEMPERATURE_VALUE = 70;
        int TARGET_WATER_TEMPERATURE_VALUE = 60;
        for (int waterTemperature = CURRENT_WATER_TEMPERATURE_VALUE; waterTemperature > TARGET_WATER_TEMPERATURE_VALUE; waterTemperature--) {
            waterThermostat.setCurrentWaterTemperature(waterTemperature);
            assertTrue(waterThermostat.isNotHeating());
        }

    }

    @Test
    @DisplayName("Test change in current water temperature when current water temperature is below target water temperature")
    void testChangeTargetWaterTemperatureAboveCurrent() {
        int CURRENT_WATER_TEMPERATURE_VALUE = 45;
        int TARGET_WATER_TEMPERATURE_VALUE = 60;
        for (int waterTemperature = CURRENT_WATER_TEMPERATURE_VALUE; waterTemperature < TARGET_WATER_TEMPERATURE_VALUE; waterTemperature++) {
            waterThermostat.setCurrentWaterTemperature(waterTemperature);
            assertTrue(waterThermostat.isHeating());
        }


    }

    @Test
    @DisplayName("Test change in current water temperature when current water temperature is above target water temperature")
    void testChangeTargetWaterTemperatureBelowCurrent() {
        int CURRENT_WATER_TEMPERATURE_VALUE = 75;
        int TARGET_WATER_TEMPERATURE_VALUE = 60;
        for (int waterTemperature = CURRENT_WATER_TEMPERATURE_VALUE; waterTemperature > TARGET_WATER_TEMPERATURE_VALUE; waterTemperature--) {
            waterThermostat.setCurrentWaterTemperature(waterTemperature);
            assertTrue(waterThermostat.isNotHeating());
        }

    }

    @Test
    @DisplayName("Test Heating Control is On if current water temperature is lower than target water temperature")
    void testHeatingControlIsOn() {
        int CURRENT_WATER_TEMPERATURE_VALUE = 35;
        int TARGET_WATER_TEMPERATURE_VALUE = 80;
        waterThermostat.setCurrentWaterTemperature(CURRENT_WATER_TEMPERATURE_VALUE);
        waterThermostat.setTargetWaterTemperature(TARGET_WATER_TEMPERATURE_VALUE);
        assertTrue(waterThermostat.isHeating());
    }

    @Test
    @DisplayName("Test Heating Control is Off if current water temperature is higher than target water temperature")
    void testHeatingControlIsOff() {
        int CURRENT_WATER_TEMPERATURE_VALUE = 80;
        int TARGET_WATER_TEMPERATURE_VALUE = 70;
        waterThermostat.setCurrentWaterTemperature(CURRENT_WATER_TEMPERATURE_VALUE);
        waterThermostat.setTargetWaterTemperature(TARGET_WATER_TEMPERATURE_VALUE);
        assertTrue(waterThermostat.isNotHeating());
    }

    // test for temperature deviation

}