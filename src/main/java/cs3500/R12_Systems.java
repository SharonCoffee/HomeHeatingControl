package cs3500;

public class R12_Systems {

    String systemName = "Unknown";

    R11_Zones zone0 = new R11_Zones();

    R11_Zones zone1 = new R11_Zones();

    R11_Zones zone2 = new R11_Zones();

    R11_Zones zone3 = new R11_Zones();

    R11_Zones [] systemZones = {zone0, zone1, zone2, zone3};

    public String getName() {
        return systemName;
    }

    public void setName(String newName) {
        systemName = newName;
    }

    public R11_Zones getZone(int index) {
        return systemZones[index];
    }


    public String getZoneName(int index) {
        return (String) systemZones[index].getZoneAttribute(0);
    }
}
