package cs3500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class R4_HolidayScheduleTest {
    R4_HolidaySchedule holidaySchedule;

    @BeforeEach
    void setUp() {
        holidaySchedule = new R4_HolidaySchedule();
    }
    @Test
    @DisplayName("A new holiday schedule should be empty")
    void newHolidayScheduleIsEmpty() {

        assertTrue(holidaySchedule.size() == 0);
    }
    @Test
    @DisplayName("When start command is pushed onto the stack, the holiday time schedule results in a stack size of one")
    void testStart() {

        final String EXPECTED_VALUE = "Start";
        holidaySchedule.push(EXPECTED_VALUE);
        assertEquals(1, holidaySchedule.size());
    }

    private int holidaySchedulesize() {
        return 0;
    }

    @Test
    @DisplayName("When start command is pushed off the holiday schedule, the holiday schedule stops and returns the value that was pushed off")
    void testStop() {

        final String EXPECTED_VALUE = "Start";
        holidaySchedule.push(EXPECTED_VALUE);
        String actualValue = holidaySchedule.pop();
        assertEquals(EXPECTED_VALUE, actualValue);
    }
    @Test
    @DisplayName("When start command is pushed off the  holiday schedule, the schedule size should be empty")
    void testHolidayScheduleSizeAfterPop() {
        testStop();
        assertTrue(holidaySchedule.size() == 0);
    }

    @Test
    @DisplayName("When holiday Schedule has been set, get correct date, start time and end time from the schedule")
    void whenHolidayScheduleSetGetCorrectDateAndTime() {
        int startYear = 2022;
        int startMonth = 11;
        int startDay = 19;
        int startHour = 6;
        int startMinutes = 30;
        int endYear = 2022;
        int endMonth = 11;
        int endDay = 19;
        int endHour = 8;
        int endMinutes = 30;
        holidaySchedule.setDate(LocalDate.of(startYear, startMonth, startDay));
        holidaySchedule.setStartTime(LocalTime.of(startHour, startMinutes));
        holidaySchedule.setEndTime(LocalTime.of(endHour, endMinutes));

        assertEquals(LocalDate.of(startYear, startMonth, startDay), holidaySchedule.getDate());
        assertEquals(LocalTime.of(startHour, startMinutes), holidaySchedule.getStartTime());
        assertEquals(LocalTime.of(endHour, endMinutes), holidaySchedule.getEndTime());

    }

    // continue on from here





}