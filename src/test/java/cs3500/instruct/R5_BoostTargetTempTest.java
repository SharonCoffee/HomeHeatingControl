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
    @DisplayName("Boost Target Temperature array has a length of 4.")
    void boostTargetTempArrayHasLengthOfFour() {

        assertTrue(boostTargetTemp.getLengthOfArray() == 4);
    }
/*
    @Test
    @DisplayName("Push four values onto arraylist and return an array size of 4")
    void pushExpectedValuesGivesArraySizeOfFour(){
        assertEquals(4, boostTargetTemp.getLengthOfArray());

    }
*/
    @Test
    @DisplayName("User selects value from the arrayList of Boost Target Temperatures and it returns true")
    void testSelectFromArrayList() {
        int iBOOST_TARGET_TEMP = 22;
        assertTrue(boostTargetTemp.contains(iBOOST_TARGET_TEMP));
    }

    @Test
    @DisplayName("User selects value below first value in the arrayList of Boost Target Temperatures and it returns false")
    void testInvalidLowerValueFromArrayList() {
        int SELECTED_VALUE = 19;
        assertFalse(boostTargetTemp.contains(SELECTED_VALUE));
    }

    @Test
    @DisplayName("User selects value above last value the arrayList of Boost Target Temperatures and it returns false")
    void testInvalidHigherValueFromArrayList() {
        int SELECTED_VALUE = 27;
        assertFalse(boostTargetTemp.contains(SELECTED_VALUE));
    }


    @Test
    void getBoostTargetTempArray() {
        assertArrayEquals(new int[] {20, 22, 24, 26}, boostTargetTemp.getBoostTargetTempArray());
    }

    @Test
    void setBoostTargetTempArray() {
        boostTargetTemp.setBoostTargetTempArray(new int[] {10, 12, 14, 16});
        assertArrayEquals(new int[] {10, 12, 14, 16}, boostTargetTemp.getBoostTargetTempArray());
    }


}