package cs3500.operate;

public class R13_ZoneState {
    static R13_ZoneStateEnum on = R13_ZoneStateEnum.ON;
    static R13_ZoneStateEnum off = R13_ZoneStateEnum.OFF;
    static R13_ZoneStateEnum auto = R13_ZoneStateEnum.AUTO;
    static R13_ZoneStateEnum boost = R13_ZoneStateEnum.BOOST;
    public void R13_ZoneState() {
        this.on = on;
        this.off = off;
        this.auto = auto;
        this.boost = boost;
    }

    public void setOn(R13_ZoneStateEnum on) {
        this.on = on;
    }

    public void setOff(R13_ZoneStateEnum off) {
        this.off = off;
    }

    public void setAuto(R13_ZoneStateEnum auto) {
        this.auto = auto;
    }

    public void setBoost(R13_ZoneStateEnum boost) {
        this.boost = boost;
    }

    public static R13_ZoneStateEnum getZoneStateOn() {
        return on;
    }

    public static R13_ZoneStateEnum getZoneStateOff() {
        return off;
    }

    public static R13_ZoneStateEnum getZoneStateAuto() {
        return auto;
    }

    public static R13_ZoneStateEnum getZoneStateBoost() {
        return boost;
    }



}
