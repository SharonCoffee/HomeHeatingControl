package cs3500.operate;

public class R10_ActivityLog {
    String activity;
    int vTargetRoomTemp;
    String boostOnState;
    String boostOffState;
    String autoOnState;
    String autoOffState;
    String onState;
    String offState;
    int year;
    int month;
    int day;
    int startYear;
    int startMonth;
    int startDay;
    int startHour;
    int startMinutes;
    int endYear;
    int endMonth;
    int endDay;
    int endHour;
    int endMinutes;
    String frostProtectionOn;
    String frostProtectionOff;

    public boolean TargetRoomTempChangeIsSuccessfullyLogged(int vTargetRoomTemp) {
        this.vTargetRoomTemp = vTargetRoomTemp;
        System.out.println("Target Room Temperature has been changed to: " + vTargetRoomTemp);
        return true;
    }

    public boolean BoostStateSelectedIsSuccessfullyLogged(String boostOnState) {
        this.boostOnState = boostOnState;
        System.out.println("Boost is turned: " + boostOnState);
        return true;
    }

    public boolean BoostStateCancelledIsSuccessfullyLogged(String boostOffState) {
        this.boostOffState = boostOffState;
        System.out.println("Boost time period has ended and is now turned: " + boostOffState);
        return true;
    }

    public boolean AutoStateActivatedIsSuccessfullyLogged(String autoOnState) {
        this.autoOnState = autoOnState;
        System.out.println("Auto state is: " + autoOnState);
        return true;
    }

    public boolean AutoStateDeactivatedIsSuccessfullyLogged(String autoOffState) {
        this.autoOffState = autoOffState;
        System.out.println("Auto state is: " + autoOffState);
        return true;
    }

    public boolean OnStateActivatedIsSuccessfullyLogged(String onState) {
        this.onState = onState;
        System.out.println("The system is turned: " + onState);
        return true;
    }

    public boolean OffStateActivatedIsSuccessfullyLogged(String offState) {
        this.offState = offState;
        System.out.println("The system is turned: " + offState);
        return true;
    }

    public boolean AutoTimeIntervalScheduleChangeIsSuccessfullyLogged(int year, int month, int day, int startHour, int startMinutes, int endHour, int endMinutes) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.startHour = startHour;
        this.startMinutes = startMinutes;
        this.endHour = endHour;
        this.endMinutes = endMinutes;
        System.out.println("Auto Time Interval Schedule has been changed to: Date - " + year + "-" + month + "-" + day +
                ", with Starting Time - " + startHour + ":" + startMinutes + " and Ending Time - " + endHour + ":" + endMinutes);
        return true;
    }

    public boolean HolidayTimeIntervalScheduleChangeIsSuccessfullyLogged(int startYear, int startMonth, int startDay, int startHour, int startMinutes, int endYear, int endMonth, int endDay, int endHour, int endMinutes) {
        this.startYear = startYear;
        this.startMonth = startMonth;
        this.startDay = startDay;
        this.startHour = startHour;
        this.startMinutes = startMinutes;
        this.endYear = endYear;
        this.endMonth = endMonth;
        this.endDay = endDay;
        this.endHour = endHour;
        this.endMinutes = endMinutes;
        System.out.println("Auto Time Interval Schedule has been changed to: Date - " + startYear + "-" + startMonth + "-" + startDay +
                startHour + ":" + startMinutes + " and will end on - " + endYear + endMonth + endDay + endHour + ":" + endMinutes);
        return true;
    }

    public boolean frostProtectionTurnedOnIsSuccessfullyLogged(String frostProtectionOn) {
        this.frostProtectionOn = frostProtectionOn;
        System.out.println("Frost Protection is: " + frostProtectionOn);
        return true;
    }

    public boolean frostProtectionTurnedOffIsSuccessfullyLogged(String frostProtectionOff) {
        this.frostProtectionOff = frostProtectionOff;
        System.out.println("Frost Protection is: " + frostProtectionOff);
        return true;
    }
}
