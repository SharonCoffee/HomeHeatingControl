package cs3500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class WB5_AutoStateTest {
    
    WB5_AutoState autoStateController;

    @BeforeEach
    void setUp() {
        autoStateController = new WB5_AutoState();
    }
    /**
     * 1. Select Auto mode in the UI
     * 2. Check if the UI communicates to the controller that Auto mode has been set
     * 3. Check if the controller reads the current time from the zone thermometers
     * 4. If the current time is equal to the Auto begin time interval schedule, check if the controller will switch the boiler on
     * 5. If the current time is equal to the Auto end time interval schedule, check if the controller will switch the boiler off
     */
    
    @Test
    @DisplayName("")
    void testAutoMode() {

        //Set Auto mode in UI
        autoStateController.setMode("Auto");

        //Check if controller received Auto mode selection
        assertTrue(autoStateController.getMode().equals("Auto"));

        //Get current time from controller
        LocalTime currentTime = autoStateController.getCurrentTime();

        //Check if current time is equal to Auto begin time interval schedule

        if(currentTime == autoStateController.getAutoBeginTime(18)) {
            //Read current temperature for all the zones from zone thermometers
            int[] temperatures = autoStateController.readTemperatures(19, 22);

            //Switch boiler on
            autoStateController.switchBoiler("on");

            //Check if boiler is switched on
            assertTrue(autoStateController.getBoilerStatus().equals("on"));
        }

            //Check if current time is equal to Auto end time interval schedule
        else if(currentTime == autoStateController.getAutoEndTime(20)) {

            //Switch boiler off
            autoStateController.switchBoiler("off");

            //Check if boiler is switched off
            assertTrue(autoStateController.getBoilerStatus().equals("off"));
        }
    }

}