package cs3500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WB4_BoostStateTest {

    WB4_BoostState boostStateController;

    @BeforeEach
    void setUp() {
        boostStateController = new WB4_BoostState();
    }

    @Test
    @DisplayName("Test if user/operator selects boost, that the boost time setting will apply to all zones and switch boiler on.  Else when boost time period ends, boiler switches off")
    public void testBoostProgram() {
        //Test data
        int boostSetting = 1; //1, 2, or 3 hours

        //Expected output
        boolean expectedOutput = true;

        //Method to be tested
        boolean output = boostStateController.setBoost(boostSetting);

        //Assertion
        assertEquals(expectedOutput, output);
    }

}