package cs3500.operate;

import cs3500.operate.R15_TargetWaterTemp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class R15_TargetWaterTempTest {

    R15_TargetWaterTemp targetWaterTemp;

    @BeforeEach
    void setUp() {
        targetWaterTemp = new R15_TargetWaterTemp();
    }

    @Test
    @DisplayName("Should set targetWaterTemp to 70")
    void setTargetWaterTempTo70(){
        assertEquals(70,targetWaterTemp.setTargetWaterTemp(70));
    }

    @Test
    @DisplayName("Should get targetWaterTemp which is set to 65")
    void getTargetWaterTempTo80(){
        targetWaterTemp.setTargetWaterTemp(65);
        assertEquals(65,targetWaterTemp.getTargetWaterTemp());
    }

    @Test
    @DisplayName("Should increase targetWaterTemp by one")
    void increaseTargetWaterTempBy1(){
        targetWaterTemp.setTargetWaterTemp(65);
        assertEquals(66, targetWaterTemp.increaseTargetWaterTemp());
    }

    @Test
    @DisplayName("Should decrease targetWaterTemp by one")
    void decreaseTargetWaterTempBy1(){
        targetWaterTemp.setTargetWaterTemp(65);
        assertEquals(64, targetWaterTemp.decreaseTargetWaterTemp());
    }

    @Test
    @DisplayName("Shouldn't decrease targetWaterTemp due to hitting the minimum water temperature ")
    void hittingTargetWaterTempMin(){
        targetWaterTemp.setTargetWaterTemp(55);
        assertEquals(55, targetWaterTemp.decreaseTargetWaterTemp());
    }

    @Test
    @DisplayName("Shouldn't increase targetWaterTemp due to hitting the maximum water temperature ")
    void hittingTargetWaterTempMax(){
        targetWaterTemp.setTargetWaterTemp(80);
        assertEquals(80, targetWaterTemp.increaseTargetWaterTemp());
    }
}

