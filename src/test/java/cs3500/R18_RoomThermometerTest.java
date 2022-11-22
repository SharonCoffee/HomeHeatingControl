package cs3500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class R18_RoomThermometerTest {

    R18_RoomThermometer roomThermostat;
    int ROOM_TEMP_DEVIATION = 1;

    @BeforeEach
    void setUp() {
        roomThermostat = new R18_RoomThermometer();
    }

    @Test
    @DisplayName("Test change in current room temperature when current room temperature is below target room temperature")
    void testChangeCurrentRoomTemperatureBelowTarget() {
        int CURRENT_ROOM_TEMPERATURE_VALUE = 15;
        int TARGET_ROOM_TEMPERATURE_VALUE = 21;
        for (int roomTemperature = CURRENT_ROOM_TEMPERATURE_VALUE; roomTemperature < TARGET_ROOM_TEMPERATURE_VALUE; roomTemperature++) {
            roomThermostat.setCurrentRoomTemperature(roomTemperature);
            assertTrue(roomThermostat.isHeating());
        }

    }

    @Test
    @DisplayName("Test change in current room temperature when current room temperature is above target room temperature")
    void testChangeCurrentRoomTemperatureAboveTarget() {
        int CURRENT_ROOM_TEMPERATURE_VALUE = 23;
        int TARGET_ROOM_TEMPERATURE_VALUE = 21;
        for (int roomTemperature = CURRENT_ROOM_TEMPERATURE_VALUE; roomTemperature > TARGET_ROOM_TEMPERATURE_VALUE; roomTemperature--) {
            roomThermostat.setCurrentRoomTemperature(roomTemperature);
            assertTrue(roomThermostat.isNotHeating());
        }

    }

    @Test
    @DisplayName("Test change in current room temperature when current room temperature is below target room temperature")
    void testChangeTargetRoomTemperatureAboveCurrent() {
        int CURRENT_ROOM_TEMPERATURE_VALUE = 15;
        int TARGET_ROOM_TEMPERATURE_VALUE = 20;
        for (int roomTemperature = CURRENT_ROOM_TEMPERATURE_VALUE; roomTemperature < TARGET_ROOM_TEMPERATURE_VALUE; roomTemperature++) {
            roomThermostat.setCurrentRoomTemperature(roomTemperature);
            assertTrue(roomThermostat.isHeating());
        }

    }

    @Test
    @DisplayName("Test change in current room temperature when current room temperature is above target room temperature")
    void testChangeTargetRoomTemperatureBelowCurrent() {
        int CURRENT_ROOM_TEMPERATURE_VALUE = 23;
        int TARGET_ROOM_TEMPERATURE_VALUE = 20;
        for (int roomTemperature = CURRENT_ROOM_TEMPERATURE_VALUE; roomTemperature > TARGET_ROOM_TEMPERATURE_VALUE; roomTemperature--) {
            roomThermostat.setCurrentRoomTemperature(roomTemperature);
            assertTrue(roomThermostat.isNotHeating());
        }

    }

    @Test
    @DisplayName("Test Heating Control is On if current room temperature is lower than target room temperature")
    void testHeatingControlIsOn() {
        int CURRENT_ROOM_TEMPERATURE_VALUE = 15;
        int TARGET_ROOM_TEMPERATURE_VALUE = 20;
        roomThermostat.setCurrentRoomTemperature(CURRENT_ROOM_TEMPERATURE_VALUE);
        roomThermostat.setTargetRoomTemperature(TARGET_ROOM_TEMPERATURE_VALUE);
        assertTrue(roomThermostat.isHeating());
    }

    @Test
    @DisplayName("Test Heating Control is Off if current room temperature is higher than target room temperature")
    void testHeatingControlIsOff() {
        int CURRENT_ROOM_TEMPERATURE_VALUE = 23;
        int TARGET_ROOM_TEMPERATURE_VALUE = 20;
        roomThermostat.setCurrentRoomTemperature(CURRENT_ROOM_TEMPERATURE_VALUE);
        roomThermostat.setTargetRoomTemperature(TARGET_ROOM_TEMPERATURE_VALUE);
        assertTrue(roomThermostat.isNotHeating());
    }

    // test for temperature deviation

}