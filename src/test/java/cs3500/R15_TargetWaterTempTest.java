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

    @Test
    @DisplayName("Should get targetwatertemp which is set to 65")

    void getTargetWaterTempTo80(){
        R15_TargetWaterTemp targetWaterTemp = new R15_TargetWaterTemp();

        targetWaterTemp.settargetwatertemp(65);

        assertEquals(65,targetWaterTemp.gettargetwatertemp());
    }
    @Test
    @DisplayName("Should increase targetwatertemp by one")

    void increaseTargetWaterTempBy1(){
        R15_TargetWaterTemp targetWaterTemp = new R15_TargetWaterTemp();

        targetWaterTemp.settargetwatertemp(65);

        assertEquals(66, targetWaterTemp.increasetemp());

    }

    @Test
    @DisplayName("Should decrease targetwatertemp by one")

    void decreaseTargetWaterTempBy1(){
        R15_TargetWaterTemp targetWaterTemp = new R15_TargetWaterTemp();

        targetWaterTemp.settargetwatertemp(65);

        assertEquals(64, targetWaterTemp.decreasetemp());

    }

    @Test
    @DisplayName("Shouldn't increase targetwatertemp due to hitting the minimum water temperature ")

    void hittingTargetWaterTempMin(){
        R15_TargetWaterTemp targetWaterTemp = new R15_TargetWaterTemp();

        targetWaterTemp.settargetwatertemp(55);

        assertEquals(55, targetWaterTemp.decreasetemp());

    }
}

