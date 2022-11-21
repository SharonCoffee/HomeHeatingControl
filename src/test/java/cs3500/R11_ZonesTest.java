package cs3500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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



        /* Should use this to get both current temperature, but I have empty thermometer classes
        currentRoomTemp = new R18_RoomThermometer();

        currentWaterTemp = new R19_WaterThermometer();
        */
    }

    @Test
    @DisplayName("Test to see can get aArrayOfZoneAttributes")
    void zoneAttributesArrayAreGet() {
        Object[] testArray = {"Unknown", "OFF", targetRoomTemp.getTargetRoomTemp(), 18, targetWaterTemp.getTargetWaterTemp(), 55};

        assertArrayEquals(testArray, zones.getZoneAllAttributes());
    }

    @Test
    @DisplayName("Test to see can get values in aArrayOfZoneAttributes")
    void zoneAttributesAreGet() {
        Object[] testArray = {"Unknown", "OFF", targetRoomTemp.getTargetRoomTemp(), 18, targetWaterTemp.getTargetWaterTemp(), 55};

        assertEquals(testArray[2], zones.getZoneAttribute(2));

        assertEquals(testArray[0], zones.getZoneAttribute(0));
    }

    @Test
    @DisplayName("Test to see can get values in aArrayOfZoneAttributes")
    void zoneAttributesAreSet() {
        Object[] testArray = {"Downstairs", "OFF", targetRoomTemp.getTargetRoomTemp(), 18, targetWaterTemp.getTargetWaterTemp(), 55};

        zones.setZoneAtrribute(0, "Downstairs");

        assertEquals(testArray[0], zones.getZoneAttribute(0));
    }
}