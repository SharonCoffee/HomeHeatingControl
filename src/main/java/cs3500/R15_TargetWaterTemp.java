package cs3500;

public class R15_TargetWaterTemp {

    int vTargetWaterTemp = 55;

    int cMinWaterTemp = 55;

    int cMaxWaterTemp = 80;

    public int settargetwatertemp(int iTargetWaterTemp) {

        vTargetWaterTemp = iTargetWaterTemp;

        return vTargetWaterTemp;
    }

    public int gettargetwatertemp() {
        return vTargetWaterTemp;
    }

    public int increasetemp() {
        vTargetWaterTemp += 1;

        return vTargetWaterTemp;
    }

    public int decreasetemp() {
        if (vTargetWaterTemp > cMinWaterTemp) {
            vTargetWaterTemp -= 1;
        }
        return vTargetWaterTemp;
    }
}
