package cs3500.instruct;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class R3_AutoTimeScheduleTest {

    R3_AutoTimeSchedule autoTimeSchedule;

    @BeforeEach
    void setUp() {

        autoTimeSchedule = new R3_AutoTimeSchedule();
    }

    @Test
    @DisplayName("Weekday array has a length of 7.")
    void weekDayArrayHasLengthOfSeven() {
        assertTrue(autoTimeSchedule.getLengthOfWeekDays() == 7);
    }

    @Test
    @DisplayName("Start Hours array has a length of 24.")
    void startHoursArrayHasLengthOfTwentyFour() {
        assertTrue(autoTimeSchedule.getLengthOfStartHours() == 24);
    }

    @Test
    @DisplayName("Start Minutes array has a length of 12.")
    void startMinutesArrayHasLengthOfTwelve() {
        assertTrue(autoTimeSchedule.getLengthOfStartMinutes() == 12);
    }


    @Test
    @DisplayName("End Hours array has a length of 24.")
    void endHoursArrayHasLengthOfTwentyFour() {
        assertTrue(autoTimeSchedule.getLengthOfEndHours() == 24);
    }

    @Test
    @DisplayName("End Minutes array has a length of 12.")
    void endMinutesArrayHasLengthOfTwelve() {
        assertTrue(autoTimeSchedule.getLengthOfEndMinutes() == 12);
    }

    @Test
    @DisplayName("User selects value from the list of weekdays and it returns true")
    void testSelectFromWeekDaysList() {
        String weekDayValue = "Tuesday";
        assertTrue(autoTimeSchedule.containsWeekDays(weekDayValue));
    }

    @Test
    @DisplayName("User selects value from the list of start hours and it returns true")
    void testSelectFromStartHoursList() {
        int startHoursValue = 10;
        assertTrue(autoTimeSchedule.containsStartHours(startHoursValue));
    }


    @Test
    @DisplayName("User selects value from the list of start minutes and it returns true")
    void testSelectFromStartMinutesList() {
        int startMinutesValue = 15;
        assertTrue(autoTimeSchedule.containsStartMinutes(startMinutesValue));
    }


    @Test
    @DisplayName("User selects value from the list of end hours and it returns true")
    void testSelectFromEndHoursList() {
        int endHoursValue = 12;
        assertTrue(autoTimeSchedule.containsEndHours(endHoursValue));
    }


    @Test
    @DisplayName("User selects value from the list of end minutes and it returns true")
    void testSelectFromEndMinutesList() {
        int endMinutesValue = 30;
        assertTrue(autoTimeSchedule.containsEndMinutes(endMinutesValue));
    }

    @Test
    @DisplayName("User selects value outside the start or end hours and it returns false")
    void testInvalidStartAndEndHoursSelected() {
        int SELECTED_START_HOURS_VALUE = 24;
        int SELECTED_END_HOURS_VALUE = 25;
        assertFalse(autoTimeSchedule.containsStartHours(SELECTED_START_HOURS_VALUE));
        assertFalse(autoTimeSchedule.containsEndHours(SELECTED_END_HOURS_VALUE));
    }

    @Test
    @DisplayName("User selects value outside the start or end minutes and it returns false")
    void testInvalidHigherValueFromArrayList() {
        int SELECTED_START_MINUTES_VALUE = 1;
        int SELECTED_END_MINUTES_VALUE = 59;
        assertFalse(autoTimeSchedule.containsStartMinutes(SELECTED_START_MINUTES_VALUE));
        assertFalse(autoTimeSchedule.containsEndMinutes(SELECTED_END_MINUTES_VALUE));
    }

    @Test
    @DisplayName("Test get weekdays list returns weekday list")
    void testGetWeekDays() {
        assertArrayEquals(new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}, autoTimeSchedule.getWeekDays());
    }

    @Test
    @DisplayName("Test set weekdays list returns weekday list")
    void testSetWeekDays() {
        autoTimeSchedule.setWeekDays(new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"});
        assertArrayEquals(new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}, autoTimeSchedule.getWeekDays());
    }

    @Test
    @DisplayName("Test get start hours list returns start hours list")
    void testGetStartHours() {
        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23}, autoTimeSchedule.getStartHours());
    }

    @Test
    @DisplayName("Test set start hours list returns start hours list")
    void testSetStartHours() {
        autoTimeSchedule.setStartHours(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23});
        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23}, autoTimeSchedule.getStartHours());
    }

    @Test
    @DisplayName("Test get start minutes list returns start minutes list")
    void testGetStartMinutes() {
        assertArrayEquals(new int[] {0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55}, autoTimeSchedule.getStartMinutes());
    }

    @Test
    @DisplayName("Test set start minutes list returns start minutes list")
    void testSetStartMinutes() {
        autoTimeSchedule.setStartMinutes(new int[] {0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55});
        assertArrayEquals(new int[] {0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55}, autoTimeSchedule.getStartMinutes());
    }


    @Test
    @DisplayName("Test get end hours list returns end hours list")
    void testGetEndHours() {
        assertArrayEquals(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23}, autoTimeSchedule.getEndHours());
    }

    @Test
    @DisplayName("Test set end hours list returns end hours list")
    void testSetEndHours() {
        autoTimeSchedule.setEndHours(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23});
        assertArrayEquals(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23}, autoTimeSchedule.getEndHours());
    }

    @Test
    @DisplayName("Test get end minutes list returns end minutes list")
    void testGetEndMinutes() {
        assertArrayEquals(new int[] {0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55}, autoTimeSchedule.getEndMinutes());
    }

    @Test
    @DisplayName("Test set end minutes list returns end minutes list")
    void testSetEndMinutes() {
        autoTimeSchedule.setEndMinutes(new int[] {0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55});
        assertArrayEquals(new int[] {0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55}, autoTimeSchedule.getEndMinutes());
    }
}