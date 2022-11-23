package cs3500;

public class R14_TargetRoomTemp {

    int vTargetRoomTemperature = 18;

    int cMaxRoomTemp = 26;

    int cMinRoomTemp = 18;
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
