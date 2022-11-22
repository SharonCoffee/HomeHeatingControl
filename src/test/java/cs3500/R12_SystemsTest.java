package cs3500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class R12_SystemsTest {

    R12_Systems systems;

    R11_Zones zones;

    R13_ZoneState zoneState;

    R15_TargetWaterTemp targetWaterTemp;

    R14_TargetRoomTemp targetRoomTemp;



    @BeforeEach
    void setUp() {

        systems = new R12_Systems();

        zones = new R11_Zones();

        zoneState = new R13_ZoneState();

        targetWaterTemp = new R15_TargetWaterTemp();

        targetRoomTemp = new R14_TargetRoomTemp();

    }
    @Test
    @DisplayName("Test if can get home name")
    void getSystemName() {
        String testName = "Unknown";

        assertEquals(testName, systems.getName());
    }

    @Test
    @DisplayName("Test if can set home name")
    void setSystemName() {
        String testName = "Holiday home";

        systems.setName("Holiday home");

        assertEquals(testName, systems.getName());
    }
    @Test
    @DisplayName("Test if can get system's zones")
    void getSystemZones() {
        Object[] testArray = {"Unknown", zoneState.getZoneState(), targetRoomTemp.getTargetRoomTemp(), 18, targetWaterTemp.getTargetWaterTemp(), 55};

        assertArrayEquals(testArray, systems.getZone(0).getZoneAllAttributes());

    }
}