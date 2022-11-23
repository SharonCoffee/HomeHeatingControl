package cs3500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WB1_RoomTempTest {
    WB1_RoomTemp roomTempController;
    WB1_RoomTemp roomTempUserInterface;

    @BeforeEach
    void setUp() {
        roomTempController = new WB1_RoomTemp();
        roomTempUserInterface = new WB1_RoomTemp();
    }

    @Test
    @DisplayName("Test if room temperature set by user is valid")
    void testSetTemp() {
        int targetRoomTemp = 20;

        //targetRoomTemp is between 18 and 26 degrees
        assertTrue(targetRoomTemp >= 18 && targetRoomTemp <= 26);

        //the controller replies to user interface that target room temperature is OK
        //the user interface replies to user that target room temperature has been set
        assertTrue(roomTempController.setValidTemp(targetRoomTemp));
        assertTrue(roomTempUserInterface.setValidTemp(targetRoomTemp));
    }

    @Test
    @DisplayName("Test if room temperature set by user is invalid")
    void testSetTempInvalid() {
        int targetRoomTemp = 30;

        //targetRoomTemp is not between 18 and 26 degrees
        assertFalse(targetRoomTemp >= 18 && targetRoomTemp <= 26);

        //the controller replies to user interface that target room temperature is invalid
        //the user interface replies to user that target room temperature has not been set
        assertFalse(roomTempController.setInvalidTemp(targetRoomTemp));
        assertFalse(roomTempUserInterface.setInvalidTemp(targetRoomTemp));
    }
}
