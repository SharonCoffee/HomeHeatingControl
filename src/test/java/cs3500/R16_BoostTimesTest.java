package cs3500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class R16_BoostTimesTest {

    R16_BoostTimes boostTimePeriod;
    @BeforeEach
    void setUp() {
        boostTimePeriod = new R16_BoostTimes();
    }

    @Test
    @DisplayName("Test if selected time frame matches an item in the list of time frames")
    void testSelectTimeFrame() {
        //arrange
        int[] boostTimeFrames = {60, 120, 180};
        int expected = 60;
        int actual = 0;

        //act
        for (int item : boostTimeFrames) {
            if (item == expected) {
                actual = item;
            }
        }

        //assert
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test if selected time frame is outside an item in the list of time frames")
    void testUserSelectsInvalidTimeFrame() {
        String[] validTimeFrames = new String[] {"60min", "120min", "180min"};
        String selectedTimeframe = "30min";
        assertFalse(Arrays.asList(validTimeFrames).contains(selectedTimeframe));
    }
}