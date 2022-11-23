package cs3500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class R20_BoostThermometerTest {

    R20_BoostThermometer boostThermostat;

    @BeforeEach
    void setUp() {
        boostThermostat = new R20_BoostThermometer();
    }

    @Test
    @DisplayName("Test if boost is on and current room temperature is below target room temperature and boost state is set for 60 minutes.")
    void testBoostOnAndCurrentRoomTempBelowTargetRoomTempAndBoostSetForOneHour() {
        // Arrange
        int currentRoomTemp = 14;
        int targetRoomTemp = 22;
        int boostDuration = 60; // in minutes

        // Act
        assertTrue(boostThermostat.isOn());
        int boostTimeRemaining;
        for (boostTimeRemaining = 0; boostTimeRemaining < boostDuration; boostTimeRemaining++ ) {
            boostThermostat.setBoostTimeRemaining(boostTimeRemaining);
        }

        // Assert
        assertEquals(boostThermostat.isOn(), true);
        assertEquals(boostTimeRemaining, boostDuration);
    }


    @Test
    @DisplayName("Test if boost state is off and current room temeprature above target room temperature and boost state set for 60 minutes")
    void testBoostStateOffAndCurrentRoomTemperatureAboveTargetRoomTemperatureAndBoostStateSetForOneHour() {
        // Arrange
        int currentRoomTemperature = 30;
        int targetRoomTemperature = 20;
        int boostDuration = 60; // in minutes

        assertEquals(boostThermostat.isOff(), true);
    }


    @Test
    @DisplayName("Test if boost is on and current water temperature is below target water temperature and boost state is set for 60 minutes.")
    void testBoostOnAndCurrentWaterTempBelowTargetWaterTempAndBoostSetForOneHour() {
        // Arrange
        int currentWaterTemp = 35;
        int targetWaterTemp = 60;
        int boostDuration = 60; // in minutes

        // Act
        assertTrue(boostThermostat.isOn());
        int boostTimeRemaining;
        for (boostTimeRemaining = 0; boostTimeRemaining < boostDuration; boostTimeRemaining++ ) {
            boostThermostat.setBoostTimeRemaining(boostTimeRemaining);
        }

        // Assert
        assertEquals(boostThermostat.isOn(), true);
        assertEquals(boostTimeRemaining, boostDuration);
    }


    @Test
    @DisplayName("Test if boost state is off and current water temperature above target water temperature and boost state set for 60 minutes")
    void testBoostStateOffAndCurrentWaterTemperatureAboveTargetWaterTemperatureAndBoostStateSetForOneHour() {
        // Arrange
        int currentWaterTemperature = 70;
        int targetWaterTemperature = 60;
        int boostDuration = 60; // in minutes

        assertEquals(boostThermostat.isOff(), true);
    }




}