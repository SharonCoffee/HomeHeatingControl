package cs3500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class R6_MinOilLevelTest {

    R6_MinOilLevel minOilLevel;
    @BeforeEach
    void setUp() {
        minOilLevel = new R6_MinOilLevel();
    }

    @Test
    @DisplayName("Minimum oil level array is empty")
    void minimumOilLevelArrayIsEmpty() {
        assertTrue(minOilLevel.size() == 0);
    }

    @Test
    @DisplayName("Set minimum oil level")
    void setMinimumOilLevel() {
        minOilLevel.push(200);
        assertEquals(1, minOilLevel.size());
    }

    @Test
    @DisplayName("Send message that minimum oil level has been reached")
    void messageReachedMinimumOilLevel() {
        final String EXPECTED_MESSAGE = "Minimum oil level has been reached.";
        String actualMessage = minOilLevel.message("Minimum oil level has been reached.");
        assertEquals(EXPECTED_MESSAGE, actualMessage);

    }

    @Test
    @DisplayName("Add minimum oil levels to ArrayList within bounds")
    //Assumption:  Oil tank capacity is 1000L
    //Minimum oil levels can be set between 100L and 500L
    void addMinimumOilLevels() {
        int EXPECTED_MIN = 100;
        int EXPECTED_MAX = 500;
        minOilLevel.addOilLevels(EXPECTED_MIN, EXPECTED_MAX);
        int actualMinimum = 100;
        int actualMaximum = 500;
        assertEquals(EXPECTED_MIN, actualMinimum);
        assertEquals(EXPECTED_MAX, actualMaximum);

    }

    @Test
    @DisplayName("Minimum oil levels added to ArrayList is not within bounds")
    void addMinimumOilLevelsOutsideBounds() {
        int EXPECTED_MIN = 100;
        int EXPECTED_MAX = 500;
        minOilLevel.addOilLevels(EXPECTED_MIN, EXPECTED_MAX);
        int actualMinimum = 0;
        int actualMaximum = 600;
        assertNotEquals(EXPECTED_MIN, actualMinimum);
        assertNotEquals(EXPECTED_MAX, actualMaximum);

    }


    @Test
    @DisplayName("User selects value from the Minimum Oil Level Array and it returns true")
    void testSelectFromArrayList() {
        int EXPECTED_MINIMUM_OIL_VALUE = 100;
        while (minOilLevel.size() < 5) {
            minOilLevel.push(EXPECTED_MINIMUM_OIL_VALUE);
            EXPECTED_MINIMUM_OIL_VALUE += 100;
        }
        int vMinOilLevel = 200;
        assertTrue(minOilLevel.contains(vMinOilLevel));
    }

    @Test
    @DisplayName("User selects value below first value in the Minimum Oil Level Array and it returns false")
    void testInvalidLowerValueSelectFromArrayList() {
        int EXPECTED_MINIMUM_OIL_VALUE = 100;
        while (minOilLevel.size() < 5) {
            minOilLevel.push(EXPECTED_MINIMUM_OIL_VALUE);
            EXPECTED_MINIMUM_OIL_VALUE += 100;
        }
        int vMinOilLevel = 50;
        assertFalse(minOilLevel.contains(vMinOilLevel));
    }


    @Test
    @DisplayName("User selects value above last value in the Minimum Oil Level Array and it returns false")
    void testInvalidHigherValueSelectFromArrayList() {
        int EXPECTED_MINIMUM_OIL_VALUE = 100;
        while (minOilLevel.size() < 5) {
            minOilLevel.push(EXPECTED_MINIMUM_OIL_VALUE);
            EXPECTED_MINIMUM_OIL_VALUE += 100;
        }
        int vMinOilLevel = 550;
        assertFalse(minOilLevel.contains(vMinOilLevel));
    }

}