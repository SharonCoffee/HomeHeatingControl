package cs3500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

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

    @Test
    @DisplayName("When Schedule has been set, get correct date, start time and end time from the schedule")
    void whenScheduleSetGetCorrectDateAndTime() {
        int year = 2022;
        int month = 11;
        int day = 19;
        int startHour = 6;
        int startMinutes = 30;
        int endHour = 8;
        int endMinutes = 30;
        autoTimeSchedule.setDate(LocalDate.of(year, month, day));
        autoTimeSchedule.setStartTime(LocalTime.of(startHour, startMinutes));
        autoTimeSchedule.setEndTime(LocalTime.of(endHour, endMinutes));

        assertEquals(LocalDate.of(year, month, day), autoTimeSchedule.getDate());
        assertEquals(LocalTime.of(startHour, startMinutes), autoTimeSchedule.getStartTime());
        assertEquals(LocalTime.of(endHour, endMinutes), autoTimeSchedule.getEndTime());

    }



}