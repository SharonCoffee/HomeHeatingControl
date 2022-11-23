package cs3500;

public class R16_BoostTimes {
    private int userSelection;
    int remainingTime;


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
