package cs3500.instruct;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class R7_ServiceSchedule {

    private static int[] Day;
    private static String[] Month;
    private static int[] Year;
    private LocalDate date;

    public R7_ServiceSchedule() {
        this.Day = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
        this.Month = new String[] {"January","February","March","April","May","June","July", "August", "September", "October", "November", "December"};
        this.Year = new int[] {2022, 2023, 2024, 2025, 2026, 2027, 2028, 2029, 2030, 2031, 2032, 2033, 2034, 2035, 2036, 2037, 2038, 2039, 2040, 2041, 2042, 2043, 2044, 2045, 2046, 2047, 2048, 2049, 2050};
    }

    public static int[] getDay() {
        return Day;
    }

    public void setDay(int[] Day) {
        this.Day = Day;
    }

    public static String[] getMonth() {
        return Month;
    }

    public void setMonth(String[] Month) {
        this.Month = Month;
    }

    public static int[] getYear() {
        return Year;
    }

    public void setYear(int[] Year) {
        this.Year = Year;
    }

    public int getLengthOfDays() {
        return Day.length;
    }

    public int getLengthOfMonth() {
        return Month.length;
    }

    public int getLengthOfYear() {
        return Year.length;
    }

    public String getServiceMessage() {
        System.out.println("Boiler and Radiator service is now due.");
        return "Boiler and Radiator service is now due.";
    }

    public String getServiceMessageReminder() {
        return "Boiler and Radiator service is due in 30 days.";
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }
}
