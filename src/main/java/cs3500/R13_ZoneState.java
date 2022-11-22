package cs3500;

public class R13_ZoneState {

    String sInstruct = "OFF";

    public String getZoneState() {
        return sInstruct;
    }

    public String setZoneState(String iNewState) {

        sInstruct = iNewState;

        return sInstruct;
    }
}
