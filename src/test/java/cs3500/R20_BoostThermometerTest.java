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


/*
    write junit5 tests in Java where boost state is on and current temperature is below target temperature and boost state is set for one hour.
    Assertions.assertTrue(currentTemperature.isBelowTargetTemperature());
    Assertions.assertTrue(boostState.getDurationInHours() == 1);
*/

    @Test
    void testBoostOnAndCurrentTempBelowTargetTempAndBoostSetForOneHour() {
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
    void testBoostStateOnAndCurrentTemperatureAboveTargetTemperatureAndBoostStateSetForOneHour() {
        // Arrange
        int currentRoomTemperature = 30;
        int targetRoomTemperature = 20;
        int boostDuration = 60; // in minutes

        // Act
        int newTemperature = boostThermostat.setBoostState(currentRoomTemperature, targetRoomTemperature, boostDuration);

        // Assert
        assertEquals(newTemperature, targetRoomTemperature + 1);
    }
/*
    @Test
    void testBoostStateOnAndCurrentTemperatureAboveTargetTemperatureAndBoostStateSetForOneHour() {
        // Arrange
        double currentTemperature = 30.0;
        double targetTemperature = 20.0;
        int boostDuration = 1;

        // Act
        double newTemperature = thermostat.setBoostState(currentTemperature, targetTemperature, boostDuration);

        // Assert
        assertEquals(newTemperature, targetTemperature + 1);
    }

    write junit5 tests in Java where boost state is on and current temperature is above target temperature and boost state is set for one hour after one hour boost state turns off.

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

    public class BoostStateTest {

        @Test
        public void testBoostStateOn() {
            // arrange
            double currentTemperature = 25;
            double targetTemperature = 20;
            int boostTime = 1; // in hours

            // act
            boolean boostState = BoostState.isBoostStateOn(currentTemperature, targetTemperature, boostTime);

            // assert
            assertEquals(true, boostState);
        }

        @Test
        public void testBoostStateOff() {
            // arrange
            double currentTemperature = 25;
            double targetTemperature = 20;
            int boostTime = 2; // in hours

            // act
            boolean boostState = BoostState.isBoostStateOn(currentTemperature, targetTemperature, boostTime);

            // assert
            assertEquals(false, boostState);
        }

    }

 */



}