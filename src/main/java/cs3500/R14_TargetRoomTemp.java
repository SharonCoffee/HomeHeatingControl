package cs3500;

public class R14_TargetRoomTemp {

    int vTargetRoomTemperature = 18;

    int cMaxRoomTemp = 26;

    int cMinRoomTemp = 18;
    public int settargetRoomtemp(int iTargetRoomTemperature) {

        vTargetRoomTemperature = iTargetRoomTemperature;

        return vTargetRoomTemperature;
    }

    public int gettargetRoomtemp() {

        return vTargetRoomTemperature;
    }

    public int increasetargetRoomtemp() {

        if (vTargetRoomTemperature < cMaxRoomTemp) {
            vTargetRoomTemperature += 1;
        }
        return vTargetRoomTemperature;
    }

    public int decreasetargetRoomtemp() {
        vTargetRoomTemperature -= 1;

        return vTargetRoomTemperature;
    }
}
