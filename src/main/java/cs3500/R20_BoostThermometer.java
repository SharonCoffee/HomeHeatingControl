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

    public int setBoostState(int currentRoomTemperature, int targetRoomTemperature, int boostDuration) {
        this.currentRoomTemperature = currentRoomTemperature;
        this.targetRoomTemperature = targetRoomTemperature;
        this.boostDuration = boostDuration;
        return currentRoomTemperature +  targetRoomTemperature;
    }
}
