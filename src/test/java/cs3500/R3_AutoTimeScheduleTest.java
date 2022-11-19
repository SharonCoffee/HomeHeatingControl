package cs3500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class R3_AutoTimeScheduleTest {

    R3_AutoTimeSchedule autoTimeSchedule;

    @BeforeEach
    void setUp() {

        autoTimeSchedule = new R3_AutoTimeSchedule();
    }


    @Test
    @DisplayName("A new schedule should be empty")
    void newScheduleIsEmpty() {

        assertTrue(autoTimeSchedule.size() == 0);
    }



    @Test
    @DisplayName("Test schedule start results in a stack size of one")
    void testStart() {

        final String EXPECTED_VALUE = "Start";
        autoTimeSchedule.push(EXPECTED_VALUE);
        assertEquals(1, autoTimeSchedule.size());
    }


    @Test
    @DisplayName("When start is pushed off the schedule, the schedule stops and returns the value that was pushed off")
    void testStop() {

        final String EXPECTED_VALUE = "Start";
        autoTimeSchedule.push(EXPECTED_VALUE);
        String actualValue = autoTimeSchedule.pop();
        assertEquals(EXPECTED_VALUE, actualValue);
    }

    @Test
    @DisplayName("When start is pushed off the schedule, the schedule should be empty")
    void testScheduleSizeAfterPop() {
        testStop();
        assertTrue(autoTimeSchedule.size() == 0);
    }





}