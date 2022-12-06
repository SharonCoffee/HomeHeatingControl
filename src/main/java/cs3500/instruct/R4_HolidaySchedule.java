package cs3500.instruct;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class R4_HolidaySchedule {

    private static int[] startDay;
    private static String[] startMonth;
    private static int[] startYear;

    private static int[] endDay;
    private static String[] endMonth;
    private static int[] endYear;



    public R4_HolidaySchedule() {
        this.startDay = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
        this.startMonth = new String[] {"January","February","March","April","May","June","July", "August", "September", "October", "November", "December"};
        this.startYear = new int[] {2022, 2023, 2024, 2025, 2026, 2027, 2028, 2029, 2030, 2031, 2032, 2033, 2034, 2035, 2036, 2037, 2038, 2039, 2040, 2041, 2042, 2043, 2044, 2045, 2046, 2047, 2048, 2049, 2050};
        this.endDay = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
        this.endMonth = new String[] {"January","February","March","April","May","June","July", "August", "September", "October", "November", "December"};
        this.endYear = new int[] {2022, 2023, 2024, 2025, 2026, 2027, 2028, 2029, 2030, 2031, 2032, 2033, 2034, 2035, 2036, 2037, 2038, 2039, 2040, 2041, 2042, 2043, 2044, 2045, 2046, 2047, 2048, 2049, 2050};
    }


    public static int[] getStartDay() {
        return startDay;
    }

    public void setStartDay(int[] startDay) {
        this.startDay = startDay;
    }

    public static String[] getStartMonth() {
        return startMonth;
    }

    public void setStartMonth(String[] startMonth) {
        this.startMonth = startMonth;
    }

    public static int[] getStartYear() {
        return startYear;
    }

    public void setStartYear(int[] startYear) {
        this.startYear = startYear;
    }

    public static int[] getEndDay() {
        return endDay;
    }

    public void setEndDay(int[] endDay) {
        this.endDay = endDay;
    }

    public static String[] getEndMonth() {
        return endMonth;
    }

    public void setEndMonth(String[] endMonth) {
        this.endMonth = endMonth;
    }

    public static int[] getEndYear() {
        return endYear;
    }

    public void setEndYear(int[] endYear) {
        this.endYear = endYear;
    }

    public int getLengthOfStartDays() {
        return startDay.length;
    }

    public int getLengthOfStartMonth() {
        return startMonth.length;
    }

    public int getLengthOfStartYear() {
        return startYear.length;
    }

    public int getLengthOfEndDays() {
        return endDay.length;
    }

    public int getLengthOfEndMonth() {
        return endMonth.length;
    }

    public int getLengthOfEndYear() {
        return endYear.length;
    }
}
