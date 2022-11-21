package cs3500;
;
public class R11_Zones {

    R13_ZoneState zoneState = new R13_ZoneState();

    R15_TargetWaterTemp targetWaterTemp = new R15_TargetWaterTemp();

    R14_TargetRoomTemp targetRoomTemp = new R14_TargetRoomTemp();

    Object[] aArrayOfZoneAttributes = new Object[6];

    public Object[] getZoneAttributes() {
        return aArrayOfZoneAttributes;
    }
}
