package cs3500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class R9_R17_ZoneSelectTest {

    R9_R17_ZoneSelect zoneSelect;
    @BeforeEach
    void setUp() {
        zoneSelect = new R9_R17_ZoneSelect();
    }

    @Test
    @DisplayName("Test if Zone 1 has been selected")
    void testZoneOneSelected() {
        String actualValue = "ZONE1";
        assertEquals(R9_R17_ZoneSelectOptions.ZONE1, R9_R17_ZoneSelectOptions.valueOf(actualValue));
    }

    @Test
    @DisplayName("Test if Zone 2 has been selected")
    void testZoneTwoSelected() {
        String actualValue = "ZONE2";
        assertEquals(R9_R17_ZoneSelectOptions.ZONE2, R9_R17_ZoneSelectOptions.valueOf(actualValue));
    }

    @Test
    @DisplayName("Test if Zone 3 has been selected")
    void testZoneThreeSelected() {
        String actualValue = "ZONE3";
        assertEquals(R9_R17_ZoneSelectOptions.ZONE3, R9_R17_ZoneSelectOptions.valueOf(actualValue));
    }

    @Test
    @DisplayName("Test if Zone 4 has been selected")
    void testZoneFourSelected() {
        String actualValue = "ZONE4";
        assertEquals(R9_R17_ZoneSelectOptions.ZONE4, R9_R17_ZoneSelectOptions.valueOf(actualValue));
    }


    @Test
    @DisplayName("Test if user has not selected a zone")
    void testZoneSelection() {
        assertThrows(IllegalArgumentException.class, () -> {
            zoneSelect = null;
            if (zoneSelect == null) {
                throw new IllegalArgumentException("You must select a zone!");
            }
        });
    }
}