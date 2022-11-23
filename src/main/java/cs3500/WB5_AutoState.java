package cs3500;

import java.time.LocalTime;

public class WB5_AutoState {
    private String auto;

    public LocalTime localTime;

    public String status = "";

    public LocalTime startTime;

    public LocalTime endTime;

    public void setMode(String auto) {
        this.auto = auto;
    }

    public String getMode() {
        return auto;
    }

    public LocalTime getCurrentTime() {
        return localTime;
    }

    public LocalTime getAutoBeginTime(int startTime) {
        return LocalTime.ofSecondOfDay(startTime);
    }

    public int[] readTemperatures(int currentRoomTemp, int targetRoomTemp) {
        return new int[0];
    }

    public void switchBoiler(String status) {
        this.status = status;
    }

    public String getBoilerStatus() {
        return status;
    }

    public LocalTime getAutoEndTime(int endTime) {
        return LocalTime.ofSecondOfDay(endTime);
    }
}
