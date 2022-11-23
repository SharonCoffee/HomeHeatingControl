package cs3500;

public class WB3_OnState {

    String programState;
    int currentRoomTemp;

    int targetRoomTemp;

    int currentWaterTemp;

    int targetWaterTemp;

    public String setProgramState(String programState) {
        this.programState = programState;
        return programState;
    }

    public int getCurrentRoomTemperature(int currentRoomTemp) {
        this.currentRoomTemp = currentRoomTemp;
        return currentRoomTemp;
    }

    public int getTargetRoomTemperature(int targetRoomTemp) {
        this.targetRoomTemp = targetRoomTemp;
        return targetRoomTemp;
    }

    public boolean isBoilerOn() {
        return true;
    }

    public boolean isBoilerOff() {
        return true;
    }

    public int getCurrentWaterTemperature(int currentWaterTemp) {
        this.currentWaterTemp = currentWaterTemp;
        return currentWaterTemp;
    }

    public int getTargetWaterTemperature(int targetWaterTemp) {
        this.targetWaterTemp = targetWaterTemp;
        return targetWaterTemp;
    }
}
