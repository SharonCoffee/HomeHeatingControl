package cs3500;

public class R15_TargetWaterTemp {

    int vTargetWaterTemp = 55;

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
}
