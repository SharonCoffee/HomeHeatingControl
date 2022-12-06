package cs3500.instruct;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class R7_ServiceScheduleTest {

    R7_ServiceSchedule serviceSchedule;
    @BeforeEach
    void setUp() {
        serviceSchedule = new R7_ServiceSchedule();
    }

    @Test
    @DisplayName("Day array has a length of 31.")
    void dayArrayHasLengthOfThirtyOne() {
        assertTrue(serviceSchedule.getLengthOfDays() == 31);
    }

    @Test
    @DisplayName("Months array has a length of 12.")
    void monthArrayHasLengthOfTwelve() {
        assertTrue(serviceSchedule.getLengthOfMonth() == 12);
    }

    @Test
    @DisplayName("Year array has a length of 29.")
    void yearArrayHasLengthOfTwentyNine() {
        assertTrue(serviceSchedule.getLengthOfYear() == 29);
    }

    @Test
    @DisplayName("Test get request for Day array returns correct result")
    void getDay() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31}, serviceSchedule.getDay());    }

    @Test
    @DisplayName("Test set request for Day array returns correct result")
    void setDay() {
        serviceSchedule.setDay(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31});
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31}, serviceSchedule.getDay());
    }

    @Test
    @DisplayName("Test get request for Month array returns correct result")
    void getMonth() {
        assertArrayEquals(new String[]{"January","February","March","April","May","June","July", "August", "September", "October", "November", "December"}, serviceSchedule.getMonth());
    }

    @Test
    @DisplayName("Test set request for Month array returns correct result")
    void setMonth() {
        serviceSchedule.setMonth(new String[] {"January","February","March","April","May","June","July", "August", "September", "October", "November", "December"});
        assertArrayEquals(new String[]{"January","February","March","April","May","June","July", "August", "September", "October", "November", "December"}, serviceSchedule.getMonth());
    }

    @Test
    @DisplayName("Test get request for Year array returns correct result")
    void getYear() {
        assertArrayEquals(new int[] {2022, 2023, 2024, 2025, 2026, 2027, 2028, 2029, 2030, 2031, 2032, 2033, 2034, 2035, 2036, 2037, 2038, 2039, 2040, 2041, 2042, 2043, 2044, 2045, 2046, 2047, 2048, 2049, 2050}, serviceSchedule.getYear());
    }

    @Test
    @DisplayName("Test set request for Year array returns correct result")
    void setYear() {
        serviceSchedule.setYear(new int[]{2022, 2023, 2024, 2025, 2026, 2027, 2028, 2029, 2030, 2031, 2032, 2033, 2034, 2035, 2036, 2037, 2038, 2039, 2040, 2041, 2042, 2043, 2044, 2045, 2046, 2047, 2048, 2049, 2050});
        assertArrayEquals(new int[] {2022, 2023, 2024, 2025, 2026, 2027, 2028, 2029, 2030, 2031, 2032, 2033, 2034, 2035, 2036, 2037, 2038, 2039, 2040, 2041, 2042, 2043, 2044, 2045, 2046, 2047, 2048, 2049, 2050}, serviceSchedule.getYear());
    }


    @Test
    @DisplayName("When Schedule has been set, get correct date, start time and end time from the schedule")
    void whenScheduleSetGetCorrectDateAndTime() {
        int year = 2023;
        int month = 11;
        int day = 16;
        serviceSchedule.setDate(LocalDate.of(year, month, day));
        assertEquals(LocalDate.of(year, month, day), serviceSchedule.getDate());

    }

    @Test
    @DisplayName("Send message that service is due today")
    void sendMessageServiceIsDue() {
        LocalDate currentDate = LocalDate.of(2023, 11, 16);
        String message = serviceSchedule.getServiceMessage();
        String actualMessage = "Boiler and Radiator service is now due.";
        assertEquals(message, actualMessage);
    }

    @Test
    @DisplayName("Send message to user that service is due in 30 days")
    void sendMessageServiceDueInThirtyDays() {
        LocalDate currentDate = LocalDate.of(2022, 10, 16);
        LocalDate setDate = LocalDate.of(2023, 11, 16);

        int daysToSubtract = 30;

        if(currentDate.isEqual(setDate.minusDays(daysToSubtract))) {
            String messageReminder = serviceSchedule.getServiceMessageReminder();
            System.out.println(messageReminder);
            assertEquals(messageReminder, serviceSchedule.getServiceMessageReminder());
        }

    }


}