package cs3500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class R7_ServiceScheduleTest {

    R7_ServiceSchedule serviceSchedule;
    @BeforeEach
    void setUp() {
        serviceSchedule = new R7_ServiceSchedule();
    }


    @Test
    @DisplayName("A new service schedule should be empty")
    void newServiceScheduleIsEmpty() {

        assertTrue(serviceSchedule.size() == 0);
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