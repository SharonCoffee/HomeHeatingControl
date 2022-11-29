package cs3500.controller;

public class R19_WaterThermometer {

    private int currentWaterTemperatureValue;
    private int targetWaterTemperatureValue;

    public void setCurrentWaterTemperature(int currentWaterTemperatureValue) {
        this.currentWaterTemperatureValue = currentWaterTemperatureValue;
    }

    public boolean isHeating() {
        return true;
    }

    public void setTargetWaterTemperature(int targetWaterTemperatureValue) {
        this.targetWaterTemperatureValue = targetWaterTemperatureValue;
    }

    public boolean isNotHeating() {
        return true;
    }
}
