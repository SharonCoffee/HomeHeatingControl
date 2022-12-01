package cs3500.instruct;

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
    @DisplayName("Minimum oil level array has a length of 5/")
    void minimumOilLevelArrayIsEmpty() {
        assertTrue(minOilLevel.getLengthOfArray() == 5);
    }

    @Test
    @DisplayName("User selects value from Minimum Oil Level Array and it returns true")
    void testSelectFromArrayList() {
        int vMinOilLevel = 200;
        assertTrue(minOilLevel.contains(vMinOilLevel));
    }

    @Test
    @DisplayName("User selects value below first value from Minimum Oil Level Array and it returns false")
    void testInvalidLowerValueFromArrayList() {
        int SELECTED_VALUE = 50;
        assertFalse(minOilLevel.contains(SELECTED_VALUE));
    }

    @Test
    @DisplayName("User selects value above last value from Minimum Oil Level Array and it returns false")
    void testInvalidHigherValueFromArrayList() {
        int SELECTED_VALUE = 27;
        assertFalse(minOilLevel.contains(SELECTED_VALUE));
    }


    @Test
    void getMinOilLevelArray() {
        assertArrayEquals(new int[] {100, 200, 300, 400, 500}, minOilLevel.getMinOilLevelArray());
    }

    @Test
    void setBoostTargetTempArray() {
        minOilLevel.setMinOilLevelArray(new int[] {100, 200, 300, 400, 500});
        assertArrayEquals(new int[] {100, 200, 300, 400, 500}, minOilLevel.getMinOilLevelArray());
    }


}