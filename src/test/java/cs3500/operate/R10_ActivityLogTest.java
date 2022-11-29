package cs3500.operate;

import cs3500.operate.R10_ActivityLog;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class R10_ActivityLogTest {

    R10_ActivityLog activityLog;

    @BeforeEach
    void setUp() {
        activityLog = new R10_ActivityLog();
    }

    @Test
    @DisplayName("Target temperature change activity is logged")
    void testTargetTemperatureChangeActivity() {
        int NEW_TARGET_ROOM_TEMP = 21;
        assertTrue(activityLog.TargetRoomTempChangeIsSuccessfullyLogged(NEW_TARGET_ROOM_TEMP));
    }

    @Test
    @DisplayName("Boost state selected")
    void testBoostStateSelected() {
        String BOOST_ON_STATE = "ON";
        assertTrue(activityLog.BoostStateSelectedIsSuccessfullyLogged(BOOST_ON_STATE));
    }

    @Test
    @DisplayName("Boost state cancelled")
    void testBoostStateCancelled() {
        // Boost state will change to off once boost time frame has ended
        // Assumption - boost time frame as ended
        String BOOST_OFF_STATE = "OFF";
        assertTrue(activityLog.BoostStateCancelledIsSuccessfullyLogged(BOOST_OFF_STATE));

    }

    @Test
    @DisplayName("Auto state has been activated")
    void testAutoStateActivated() {
        String AUTO_ON_STATE = "ON";
        assertTrue(activityLog.AutoStateActivatedIsSuccessfullyLogged(AUTO_ON_STATE));

    }

    @Test
    @DisplayName("Auto state has been deactivated")
    void testAutoStateDeactivated() {
        String AUTO_OFF_STATE = "OFF";
        assertTrue(activityLog.AutoStateDeactivatedIsSuccessfullyLogged(AUTO_OFF_STATE));

    }

    @Test
    @DisplayName("On state has been activated")
    void testOnStateActivated() {
        String ON_STATE = "ON";
        assertTrue(activityLog.OnStateActivatedIsSuccessfullyLogged(ON_STATE));
    }

    @Test
    @DisplayName("Off state has been activated")
    void testOffStateActivated() {
        String OFF_STATE = "OFF";
        assertTrue(activityLog.OffStateActivatedIsSuccessfullyLogged(OFF_STATE));
    }

    @Test
    @DisplayName("Auto Time interval schedule has been changed.")
    void testAutoTimeIntervalScheduleHasChanged() {
        int YEAR = 2022;
        int MONTH = 11;
        int DAY = 20;
        int START_HOUR = 19;
        int START_MINUTES = 30;
        int END_HOUR = 21;
        int END_MINUTES = 00;
        assertTrue(activityLog.AutoTimeIntervalScheduleChangeIsSuccessfullyLogged(YEAR, MONTH, DAY, START_HOUR, START_MINUTES, END_HOUR, END_MINUTES));

    }

    @Test
    @DisplayName("Holiday Time interval schedule has been changed.")
    void testHolidayTimeIntervalScheduleHasChanged() {
        int START_YEAR = 2022;
        int START_MONTH = 11;
        int START_DAY = 20;
        int START_HOUR = 19;
        int START_MINUTES = 30;
        int END_YEAR = 2022;
        int END_MONTH = 12;
        int END_DAY = 20;
        int END_HOUR = 21;
        int END_MINUTES = 00;
        assertTrue(activityLog.HolidayTimeIntervalScheduleChangeIsSuccessfullyLogged(START_YEAR, START_MONTH, START_DAY, START_HOUR, START_MINUTES, END_YEAR, END_MONTH, END_DAY, END_HOUR, END_MINUTES));

    }

    @Test
    @DisplayName("Frost Protection has been turned on")
    void testFrostProtectionTurnedOn() {
        String FROST_PROTECTION_ON = "ON";
        assertTrue(activityLog.frostProtectionTurnedOnIsSuccessfullyLogged(FROST_PROTECTION_ON));
    }

    @Test
    @DisplayName("Frost Protection has been turned off")
    void testFrostProtectionTurnedOff() {
        String FROST_PROTECTION_OFF = "OFF";
        assertTrue(activityLog.frostProtectionTurnedOffIsSuccessfullyLogged(FROST_PROTECTION_OFF));
    }



}