package cs3500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class R5_BoostTargetTempTest {
    R5_BoostTargetTemp boostTargetTemp;

    @BeforeEach
    void setUp() {
        boostTargetTemp = new R5_BoostTargetTemp();
    }



    @Test
    @DisplayName("Boost temp array is empty!")
    void boostTargetTempArrayIsEmpty() {
        assertTrue(boostTargetTemp.size() == 0);
    }

    @Test
    @DisplayName("A single push results in a stack size of one.")
        void singlePush (){
        R5_BoostTargetTemp testBoostTargetTemp = new R5_BoostTargetTemp();
        testBoostTargetTemp.push(4);
        assertEquals(1, testBoostTargetTemp.size(),"Item pushed onto stack" );
    }




    // Test push values onto arraylist
    //[20, 22, 24, 26]

// Next test would be user selects one of those values from the arraylist and it must return that value/find value in arraylist.

    //user selects a vlaue outside the array (19 or 27) and that would throw exception.
}