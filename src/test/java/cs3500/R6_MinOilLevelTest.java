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
    @DisplayName("Add minimum oil levels to ArrayList")
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

}