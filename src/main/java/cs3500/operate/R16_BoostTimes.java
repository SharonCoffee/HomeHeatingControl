package cs3500.operate;

public class R16_BoostTimes {

    private static int[] boostTimeSchedule;
    private int userSelection;
    int remainingTime;

    public R16_BoostTimes() {
        this.boostTimeSchedule = new int[] {60, 120, 180};
    }

    public static int[] getBoostTimeSchedule() {
        return boostTimeSchedule;
    }

    public void setBoostTimeSchedule(int[] boostTimeSchedule) {
        this.boostTimeSchedule = boostTimeSchedule;
    }


    public int getLengthOfArray() {
        return boostTimeSchedule.length;
    }

    public void selectTime(int userSelection) {
        this.userSelection = userSelection;
    }

    public boolean isBoostStateOn() {
        return true;
    }

    public int getRemainingTime() {
        while (userSelection > 0) {
            userSelection -= 1;
            remainingTime = userSelection;
        }
        return remainingTime;
    }

    public int getUserSelection() {
        return userSelection;
    }

    public void endBoost() {

    }

    public boolean isBoostStateOff() {
        return true;
    }
}
