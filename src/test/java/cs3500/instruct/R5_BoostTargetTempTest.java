package cs3500.instruct;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class R5_BoostTargetTempTest {
    R5_BoostTargetTemp boostTargetTemp;

    @BeforeEach
    void setUp() {
        boostTargetTemp = new R5_BoostTargetTemp();
    }



    @Test
    @DisplayName("Boost Target Temperature array is empty when created.")
    void boostTargetTempArrayIsEmpty() {

        assertTrue(boostTargetTemp.size() == 0);
    }

    @Test
    @DisplayName("Push four values onto arraylist and return an array size of 4")
    void pushExpectedValuesGivesArraySizeOfFour(){
        int EXPECTED_TARGET_TEMP_VALUE = 20;
        while (boostTargetTemp.size() < 4) {
            boostTargetTemp.push(EXPECTED_TARGET_TEMP_VALUE);
            EXPECTED_TARGET_TEMP_VALUE += 2;
        }
        assertEquals(4, boostTargetTemp.size());

    }

    @Test
    @DisplayName("User selects value from the arrayList of Boost Target Temperatures and it returns true")
    void testSelectFromArrayList() {
        int EXPECTED_TARGET_TEMP_VALUE = 20;
        while (boostTargetTemp.size() < 4) {
            boostTargetTemp.push(EXPECTED_TARGET_TEMP_VALUE);
            EXPECTED_TARGET_TEMP_VALUE += 2;
        }
        int iBOOST_TARGET_TEMP = 22;
        assertTrue(boostTargetTemp.contains(iBOOST_TARGET_TEMP));
    }

    @Test
    @DisplayName("User selects value below first value in the arrayList of Boost Target Temperatures and it returns false")
    void testInvalidLowerValueFromArrayList() {
        int EXPECTED_TARGET_TEMP_VALUE = 20;
        while (boostTargetTemp.size() < 4) {
            boostTargetTemp.push(EXPECTED_TARGET_TEMP_VALUE);
            EXPECTED_TARGET_TEMP_VALUE += 2;
        }
        int SELECTED_VALUE = 19;
        assertFalse(boostTargetTemp.contains(SELECTED_VALUE));
    }

    @Test
    @DisplayName("User selects value above last value the arrayList of Boost Target Temperatures and it returns false")
    void testInvalidHigherValueFromArrayList() {
        int EXPECTED_TARGET_TEMP_VALUE = 20;
        while (boostTargetTemp.size() < 4) {
            boostTargetTemp.push(EXPECTED_TARGET_TEMP_VALUE);
            EXPECTED_TARGET_TEMP_VALUE += 2;
        }
        int SELECTED_VALUE = 27;
        assertFalse(boostTargetTemp.contains(SELECTED_VALUE));
    }

}