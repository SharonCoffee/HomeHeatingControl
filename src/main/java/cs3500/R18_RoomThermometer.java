package cs3500;

public class R18_RoomThermometer {
    private int currentRoomTemperatureValue;
    private int targetRoomTemperatureValue;

    public void setCurrentRoomTemperature(int currentRoomTemperatureValue) {
        this.currentRoomTemperatureValue = currentRoomTemperatureValue;

    }

    public boolean isHeating() {
        return true;
    }


    public void setTargetRoomTemperature(int targetRoomTemperatureValue) {
        this.targetRoomTemperatureValue = targetRoomTemperatureValue;
    }

    public boolean isNotHeating() {
        return true;
    }
}
