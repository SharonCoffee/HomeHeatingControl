package cs3500;

public class R11_Zones {

    R13_ZoneState zoneState = new R13_ZoneState();

    R15_TargetWaterTemp targetWaterTemp = new R15_TargetWaterTemp();

    R14_TargetRoomTemp targetRoomTemp = new R14_TargetRoomTemp();

    Object[] aArrayOfZoneAttributes = {"Unknown", zoneState.getZoneState(), targetRoomTemp.getTargetRoomTemp(), 18, targetWaterTemp.getTargetWaterTemp(), 55};

    public Object[] getZoneAllAttributes() {
        return aArrayOfZoneAttributes;
    }

    public Object getZoneAttribute(int index) {
        return aArrayOfZoneAttributes[index];
    }


    public void setZoneAttribute(int index, Object newAttribute) {
        if ((index == 0 || index == 1) && newAttribute instanceof String) {
            aArrayOfZoneAttributes[index] = zoneState.setZoneState((String) newAttribute);
        }
        else if ((index == 2) && newAttribute instanceof Integer) {
            aArrayOfZoneAttributes[index] = targetRoomTemp.setTargetRoomTemp((Integer) newAttribute);
        }
        else if ((index == 4 || index == 5 ) && newAttribute instanceof Integer){
            aArrayOfZoneAttributes[index] = targetWaterTemp.setTargetWaterTemp((Integer) newAttribute);
        }
    }
}
