package cs3500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class R11_ZonesTest {

    R11_Zones zones;

    R13_ZoneState zoneState;

    R15_TargetWaterTemp targetWaterTemp;

    R14_TargetRoomTemp targetRoomTemp;

    R18_RoomThermometer currentRoomTemp;

    R19_WaterThermometer currentWaterTemp;

    @BeforeEach
    void setUp()  {
       zones = new R11_Zones();

       zoneState = new R13_ZoneState();

       targetWaterTemp = new R15_TargetWaterTemp();

       targetRoomTemp = new R14_TargetRoomTemp();

       currentRoomTemp = new R18_RoomThermometer();

       currentWaterTemp = new R19_WaterThermometer();

    }


    @Test
    @DisplayName("Test to see can get an ArrayOfZoneAttributes")
    void zoneAttributesArrayAreGet() {
        Object[] testArray = {"Unknown", zoneState.getZoneState(), targetRoomTemp.getTargetRoomTemp(), 18, targetWaterTemp.getTargetWaterTemp(), 55};

        assertArrayEquals(testArray, zones.getZoneAllAttributes());
    }

    @Test
    @DisplayName("Test to see can get values in an ArrayOfZoneAttributes")
    void zoneAttributesAreGet() {
        Object[] testArray = {"Unknown", zoneState.getZoneState(), targetRoomTemp.getTargetRoomTemp(), 18, targetWaterTemp.getTargetWaterTemp(), 55};

        assertEquals(testArray[2], zones.getZoneAttribute(2));

        assertEquals(testArray[0], zones.getZoneAttribute(0));
    }

    @Test
    @DisplayName("Test to see can set values in an ArrayOfZoneAttributes")
    void zoneAttributesAreSet() {
        Object[] testArray = {"Downstairs", zoneState.getZoneState(), targetRoomTemp.getTargetRoomTemp(), 18, targetWaterTemp.getTargetWaterTemp(), 55};

        zones.setZoneAttribute(0, "Downstairs");

        assertEquals(testArray[0], zones.getZoneAttribute(0));
    }

    @Test
    @DisplayName("Test to see set values must correct types in an ArrayOfZoneAttributes")
    void zoneAttributesAreSetCorrectly() {
        Object[] testArray = {"Unknown", zoneState.getZoneState(), targetRoomTemp.getTargetRoomTemp(), 18, targetWaterTemp.getTargetWaterTemp(), 55};

        zones.setZoneAttribute(0, 21);

        zones.setZoneAttribute(3, "ON");

        assertEquals(testArray[0], zones.getZoneAttribute(0));

        assertEquals(testArray[3], zones.getZoneAttribute(3));
    }

    @Test
    @DisplayName("Test to stop targetRoomTemp and targetWaterTemp set outside max and min values")
    void zoneTempsAreSetWithinMinAndMax() {
        Object[] testArray = {"Unknown", zoneState.getZoneState(), targetRoomTemp.getTargetRoomTemp(), 18, targetWaterTemp.getTargetWaterTemp(), 55};

        zones.setZoneAttribute(2, 30);

        zones.setZoneAttribute(4, 100);

        assertEquals(testArray[0], zones.getZoneAttribute(0));

        assertEquals(testArray[3], zones.getZoneAttribute(3));
    }
}