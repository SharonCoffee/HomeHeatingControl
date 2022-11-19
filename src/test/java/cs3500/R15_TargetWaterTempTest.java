package cs3500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class R15_TargetWaterTempTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("Should set targetwatertemp to 70")

    void setTargetWaterTempTo70(){
        R15_TargetWaterTemp targetWaterTemp = new R15_TargetWaterTemp();

        assertEquals(70,targetWaterTemp.settargetwatertemp(70));
    }
}