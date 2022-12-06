package cs3500.instruct;

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
    @DisplayName("Start day array has a length of 31.")
    void startDayArrayHasLengthOfThirtyOne() {
        assertTrue(holidaySchedule.getLengthOfStartDays() == 31);
    }

    @Test
    @DisplayName("Start Months array has a length of 12.")
    void startMonthArrayHasLengthOfTwelve() {
        assertTrue(holidaySchedule.getLengthOfStartMonth() == 12);
    }

    @Test
    @DisplayName("Start Year array has a length of 29.")
    void startYearArrayHasLengthOfTwentyNine() {
        assertTrue(holidaySchedule.getLengthOfStartYear() == 29);
    }

    @Test
    @DisplayName("End day array has a length of 31.")
    void endDayArrayHasLengthOfThirtyOne() {
        assertTrue(holidaySchedule.getLengthOfEndDays() == 31);
    }

    @Test
    @DisplayName("End Months array has a length of 12.")
    void endMonthArrayHasLengthOfTwelve() {
        assertTrue(holidaySchedule.getLengthOfEndMonth() == 12);
    }

    @Test
    @DisplayName("End Year array has a length of 29.")
    void endYearArrayHasLengthOfThirty() {
        assertTrue(holidaySchedule.getLengthOfEndYear() == 29);
    }

    @Test
    @DisplayName("Test get request for Start day array returns correct result")
    void getStartDay() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31}, holidaySchedule.getStartDay());
    }

    @Test
    @DisplayName("Test set request for Start month array returns correct result")
    void setStartDay() {
        holidaySchedule.setStartDay(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31});
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31}, holidaySchedule.getStartDay());
    }

    @Test
    @DisplayName("Test get request for Start month array returns correct result")
    void getStartMonth() {
        assertArrayEquals(new String[]{"January","February","March","April","May","June","July", "August", "September", "October", "November", "December"}, holidaySchedule.getStartMonth());
    }

    @Test
    @DisplayName("Test set request for Start year array returns correct result")
    void setStartMonth() {
        holidaySchedule.setStartMonth(new String[] {"January","February","March","April","May","June","July", "August", "September", "October", "November", "December"});
        assertArrayEquals(new String[]{"January","February","March","April","May","June","July", "August", "September", "October", "November", "December"}, holidaySchedule.getStartMonth());
    }

    @Test
    @DisplayName("Test get request for Start year array returns correct result")
    void getStartYear() {
        assertArrayEquals(new int[] {2022, 2023, 2024, 2025, 2026, 2027, 2028, 2029, 2030, 2031, 2032, 2033, 2034, 2035, 2036, 2037, 2038, 2039, 2040, 2041, 2042, 2043, 2044, 2045, 2046, 2047, 2048, 2049, 2050}, holidaySchedule.getStartYear());
    }

    @Test
    @DisplayName("Test set request for Start year array returns correct result")
    void setStartYear() {
        holidaySchedule.setStartYear(new int[]{2022, 2023, 2024, 2025, 2026, 2027, 2028, 2029, 2030, 2031, 2032, 2033, 2034, 2035, 2036, 2037, 2038, 2039, 2040, 2041, 2042, 2043, 2044, 2045, 2046, 2047, 2048, 2049, 2050});
        assertArrayEquals(new int[] {2022, 2023, 2024, 2025, 2026, 2027, 2028, 2029, 2030, 2031, 2032, 2033, 2034, 2035, 2036, 2037, 2038, 2039, 2040, 2041, 2042, 2043, 2044, 2045, 2046, 2047, 2048, 2049, 2050}, holidaySchedule.getStartYear());
    }

    @Test
    @DisplayName("Test get request for End day array returns correct result")
    void getEndDay() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31}, holidaySchedule.getEndDay());
    }

    @Test
    @DisplayName("Test set request for End day array returns correct result")
    void setEndDay() {
        holidaySchedule.setEndDay(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31});
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31}, holidaySchedule.getEndDay());
    }

    @Test
    @DisplayName("Test get request for End month array returns correct result")
    void getEndMonth() {
        assertArrayEquals(new String[]{"January","February","March","April","May","June","July", "August", "September", "October", "November", "December"}, holidaySchedule.getEndMonth());
    }

    @Test
    @DisplayName("Test set request for End month array returns correct result")
    void setEndMonth() {
        holidaySchedule.setEndMonth(new String[] {"January","February","March","April","May","June","July", "August", "September", "October", "November", "December"});
        assertArrayEquals(new String[]{"January","February","March","April","May","June","July", "August", "September", "October", "November", "December"}, holidaySchedule.getEndMonth());
    }

    @Test
    @DisplayName("Test get request for End Year array returns correct result")
    void getEndYear() {
        assertArrayEquals(new int[] {2022, 2023, 2024, 2025, 2026, 2027, 2028, 2029, 2030, 2031, 2032, 2033, 2034, 2035, 2036, 2037, 2038, 2039, 2040, 2041, 2042, 2043, 2044, 2045, 2046, 2047, 2048, 2049, 2050}, holidaySchedule.getEndYear());
    }

    @Test
    @DisplayName("Test set request for End year array returns correct result")
    void setEndYear() {
        holidaySchedule.setEndYear(new int[]{2022, 2023, 2024, 2025, 2026, 2027, 2028, 2029, 2030, 2031, 2032, 2033, 2034, 2035, 2036, 2037, 2038, 2039, 2040, 2041, 2042, 2043, 2044, 2045, 2046, 2047, 2048, 2049, 2050});
        assertArrayEquals(new int[] {2022, 2023, 2024, 2025, 2026, 2027, 2028, 2029, 2030, 2031, 2032, 2033, 2034, 2035, 2036, 2037, 2038, 2039, 2040, 2041, 2042, 2043, 2044, 2045, 2046, 2047, 2048, 2049, 2050}, holidaySchedule.getEndYear());
    }


}