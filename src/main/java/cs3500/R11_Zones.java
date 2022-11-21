package cs3500;
;
public class R11_Zones {

    R13_ZoneState zoneState = new R13_ZoneState();

    R15_TargetWaterTemp targetWaterTemp = new R15_TargetWaterTemp();

    R14_TargetRoomTemp targetRoomTemp = new R14_TargetRoomTemp();

    Object[] aArrayOfZoneAttributes = {"Unknown", "OFF", targetRoomTemp.getTargetRoomTemp(), 18, targetWaterTemp.getTargetWaterTemp(), 55};

    public Object[] getZoneAllAttributes() {
        return aArrayOfZoneAttributes;
    }

    public Object getZoneAttribute(int i) {
        return aArrayOfZoneAttributes[i];
    }
}
