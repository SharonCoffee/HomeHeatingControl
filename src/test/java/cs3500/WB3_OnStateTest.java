package cs3500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WB3_OnStateTest {

    WB3_OnState onStateController;

    @BeforeEach
    void setUp() {
        onStateController = new WB3_OnState();
    }

    /**
     * 1. Select the On program state in the UI
     * 2. Communicate to the controller that On program state is set
     * 3. The controller reads the current room/water temperature of the zones from the zone thermometer
     * 4. If the current room/water temperature is less than the target room/water temperature, boiler is switched on
     * 5. Else boiler is turned off
     */

    @Test
    @DisplayName("Test if user/operator selects on state and system turns on if current room temperature is less than target room temperature")
    void testOnProgramStateSelectionForRoomTemp() {
        // select On program state in UI
        onStateController.setProgramState("ON");

        // check that controller reads current room temperature of the zones
        int CURRENT_ROOM_TEMP = 19;
        assertEquals(onStateController.getCurrentRoomTemperature(CURRENT_ROOM_TEMP), 19);

        // if current room/water temperature is less than target room temperature, boiler is switched on
        int TARGET_ROOM_TEMP = 23;
        if (onStateController.getCurrentRoomTemperature(CURRENT_ROOM_TEMP) < onStateController.getTargetRoomTemperature(TARGET_ROOM_TEMP)) {
            assertTrue(onStateController.isBoilerOn());
        }
        // else boiler is turned off
        else {
            assertTrue(onStateController.isBoilerOff());
        }
    }

    @Test
    @DisplayName("Test if user/operator selects on state and system turns on if current water temperature is less than target water temperature")
    void testOnProgramStateSelectionForWaterTemp() {
        // select On program state in UI
        onStateController.setProgramState("ON");

        // check that controller reads current water temperature of the zones
        int CURRENT_WATER_TEMP = 40;
        assertEquals(onStateController.getCurrentWaterTemperature(CURRENT_WATER_TEMP), 40);

        // if current room/water temperature is less than target water temperature, boiler is switched on
        int TARGET_WATER_TEMP = 60;
        if (onStateController.getCurrentWaterTemperature(CURRENT_WATER_TEMP) < onStateController.getTargetWaterTemperature(TARGET_WATER_TEMP)) {
            assertTrue(onStateController.isBoilerOn());
        }
        // else boiler is turned off
        else {
            assertTrue(onStateController.isBoilerOff());
        }
    }

}