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

    @BeforeEach
    void setUp()  {
       zones = new R11_Zones();

       zoneState = new R13_ZoneState();

       targetWaterTemp = new R15_TargetWaterTemp();

       targetRoomTemp = new R14_TargetRoomTemp();
    }

    @Test
    @DisplayName("Test to see can get aArrayOfZoneAttributes")
    void zoneAttributesAreGet() {
        Object[] testArray = new Object[6];

        assertArrayEquals(testArray, zones.getZoneAttributes());
    }
}