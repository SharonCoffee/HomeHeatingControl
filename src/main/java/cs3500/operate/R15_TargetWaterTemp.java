package cs3500.operate;

public class R15_TargetWaterTemp {

    int vTargetWaterTemp = 55;

    int cMinWaterTemp = 55;

    int cMaxWaterTemp = 80;

    public int setTargetWaterTemp(int iTargetWaterTemp) {

        vTargetWaterTemp = iTargetWaterTemp;

        return vTargetWaterTemp;
    }

    public int getTargetWaterTemp() {
        return vTargetWaterTemp;
    }

    public int increaseTargetWaterTemp() {
        if (vTargetWaterTemp < cMaxWaterTemp) {
            vTargetWaterTemp += 1;
        }

        return vTargetWaterTemp;
    }

    public int decreaseTargetWaterTemp() {
        if (vTargetWaterTemp > cMinWaterTemp) {
            vTargetWaterTemp -= 1;
        }
        return vTargetWaterTemp;
    }
}
