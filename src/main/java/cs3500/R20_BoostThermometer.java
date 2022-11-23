package cs3500;

public class R20_BoostThermometer {

    int boostTimeRemaining;
    int currentRoomTemperature;
    int targetRoomTemperature;
    int boostDuration;

    public boolean isOn() {
        return true;
    }

    public void setBoostTimeRemaining(int boostTimeRemaining) {
        this.boostTimeRemaining = boostTimeRemaining;
    }


    public boolean isOff() {
        return true;
    }
}
