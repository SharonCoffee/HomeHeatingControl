package cs3500.instruct;


public class R3_AutoTimeSchedule {

    private static String[] weekDay;
    private static int[] startHours;
    private static int[] startMinutes;
    private static int[] endHours;
    private static int[] endMinutes;


    public R3_AutoTimeSchedule() {

        this.weekDay = new String[] {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        this.startHours = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23};
        this.startMinutes = new int[] {0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55};
        this.endHours = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23};
        this.endMinutes = new int[] {0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55};
    }

    public static String[] getWeekDays() {
        return weekDay;
    }

    public void setWeekDays(String[] weekDay) {
        this.weekDay = weekDay;
    }


    public static int[] getStartHours() {
        return startHours;
    }

    public void setStartHours(int[] startHours) {
        this.startHours = startHours;
    }

    public static int[] getStartMinutes() {
        return startMinutes;
    }

    public void setStartMinutes(int[] startMinutes) {
        this.startMinutes = startMinutes;
    }

    public static int[] getEndHours() {
        return endHours;
    }

    public void setEndHours(int[] endHours) {
        this.endHours = endHours;
    }


    public static int[] getEndMinutes() {
        return endMinutes;
    }

    public void setEndMinutes(int[] endMinutes) {
        this.endMinutes = endMinutes;
    }

    public int getLengthOfWeekDays() {
        return weekDay.length;
    }

    public int getLengthOfStartHours() {
        return startHours.length;
    }

    public int getLengthOfStartMinutes() {
        return startMinutes.length;
    }
    public int getLengthOfEndHours() {
        return endHours.length;
    }

    public int getLengthOfEndMinutes() {
        return endMinutes.length;
    }

    public boolean containsWeekDays(String selectedValue) {
        for (int i = 0; i < weekDay.length; i++) {
            if (selectedValue == weekDay[i]) {
                return true;
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean containsStartHours(int selectedValue) {
        for (int i = 0; i < startHours.length; i++) {
            if (selectedValue == startHours[i]) {
                return true;
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean containsStartMinutes(int selectedValue) {
        for (int i = 0; i < startMinutes.length; i++) {
            if (selectedValue == startMinutes[i]) {
                return true;
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean containsEndHours(int selectedValue) {
        for (int i = 0; i < endHours.length; i++) {
            if (selectedValue == endHours[i]) {
                return true;
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean containsEndMinutes(int selectedValue) {
        for (int i = 0; i < endMinutes.length; i++) {
            if (selectedValue == endMinutes[i]) {
                return true;
            } else {
                continue;
            }
        }
        return false;
    }


}
