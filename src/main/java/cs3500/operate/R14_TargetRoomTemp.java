package cs3500.operate;

public class R14_TargetRoomTemp {

    int vTargetRoomTemperature = 18;

    final static int cMaxRoomTemp = 26;

    final static int cMinRoomTemp = 18;

    public static int getcMaxRoomTemp() {
        return cMaxRoomTemp;
    }

    public static int getcMinRoomTemp() {
        return cMinRoomTemp;
    }

    public int setTargetRoomTemp(int iTargetRoomTemperature) {
        vTargetRoomTemperature = iTargetRoomTemperature;
        return vTargetRoomTemperature;
    }

    public int getTargetRoomTemp() {
        return vTargetRoomTemperature;
    }

    public int increaseTargetRoomTemp() {
        if (vTargetRoomTemperature < cMaxRoomTemp) {
            vTargetRoomTemperature += 1;
        }
        return vTargetRoomTemperature;
    }

    public int decreaseTargetRoomTemp() {
        if (vTargetRoomTemperature > cMinRoomTemp) {
        vTargetRoomTemperature -= 1;
        }
        return vTargetRoomTemperature;
    }
}
