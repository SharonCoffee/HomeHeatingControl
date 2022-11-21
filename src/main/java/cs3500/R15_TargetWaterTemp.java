package cs3500;

public class R15_TargetWaterTemp {

    int targetWaterTemp;
    int targetWaterTempInBounds;

    int cMIN_WATER_TEMP = 55;
    int cMAX_WATER_TEMP = 80;
    int WATER_TEMP_DEVIATION = 1;


    public void setTargetWaterTempValue(int targetWaterTemp) {
        this.targetWaterTemp = targetWaterTemp;

    }

    public int getTargetWaterTempValue() {
        return targetWaterTemp;
    }

    public boolean setTargetWaterTempValueWithinBounds(int targetWaterTempInBounds, int cMIN_WATER_TEMP, int cMAX_WATER_TEMP) {
        return targetWaterTempInBounds >= cMIN_WATER_TEMP && targetWaterTempInBounds <= cMAX_WATER_TEMP;
    }

    public int getTargetWaterTempValueWithinBounds() {
        return targetWaterTempInBounds;
    }

}
