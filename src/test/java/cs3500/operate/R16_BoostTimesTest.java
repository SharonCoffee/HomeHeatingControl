package cs3500.operate;

import cs3500.operate.R16_BoostTimes;
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
    @DisplayName("Test if selected 60 minute time frame matches an item in the list of time frames")
    void testSelectSixtyMinutesTimeFrame() {
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
    @DisplayName("Test if selected 120 minute time frame matches an item in the list of time frames")
    void testSelectOneTwentyMinutesTimeFrame() {
        //arrange
        int[] boostTimeFrames = {60, 120, 180};
        int expected = 120;
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
    @DisplayName("Test if selected 180 minute time frame matches an item in the list of time frames")
    void testSelectOneEightyMinutesTimeFrame() {
        //arrange
        int[] boostTimeFrames = {60, 120, 180};
        int expected = 120;
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
        int[] boostTimeFrames = {60, 120, 180};
        int selectedTimeframe = 30;
        assertFalse(Arrays.asList(boostTimeFrames).contains(selectedTimeframe));
    }

    @Test
    @DisplayName("Test if boost state turns on if boost time is selected by user.")
    void whenUserSelects60MinsFromBoostArray_thenBoostStateIsTurnedOn() {
        // given
        int[] boostArray = { 60, 120, 180 };
        int userSelection = 60;

        // when
        boostTimePeriod.selectTime(userSelection);

        // then
        assertTrue(boostTimePeriod.isBoostStateOn());
        assertEquals(60, boostTimePeriod.getUserSelection());
    }

    @Test
    @DisplayName("Test if boost state turns off when boost time period has ended.")
    void when60MinsIsEnded_thenBoostStateIsTurnedOff() {
        // given
        int[] boostArray = { 60, 120, 180 };
        int userSelection = 60;
        boostTimePeriod.selectTime(userSelection);

        // when
        boostTimePeriod.endBoost();

        // then
        assertTrue(boostTimePeriod.isBoostStateOff());
        assertEquals(0, boostTimePeriod.getRemainingTime());
    }

}