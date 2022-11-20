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
    @DisplayName("Should set targetWaterTemp to 70")

    void setTargetWaterTempTo70(){
        R15_TargetWaterTemp targetWaterTemp = new R15_TargetWaterTemp();

        assertEquals(70,targetWaterTemp.setTargetWaterTemp(70));
    }

    @Test
    @DisplayName("Should get targetWaterTemp which is set to 65")

    void getTargetWaterTempTo80(){
        R15_TargetWaterTemp targetWaterTemp = new R15_TargetWaterTemp();

        targetWaterTemp.setTargetWaterTemp(65);

        assertEquals(65,targetWaterTemp.getTargetWaterTemp());
    }
    @Test
    @DisplayName("Should increase targetWaterTemp by one")

    void increaseTargetWaterTempBy1(){
        R15_TargetWaterTemp targetWaterTemp = new R15_TargetWaterTemp();

        targetWaterTemp.setTargetWaterTemp(65);

        assertEquals(66, targetWaterTemp.increaseTargetWaterTemp());

    }

    @Test
    @DisplayName("Should decrease targetWaterTemp by one")

    void decreaseTargetWaterTempBy1(){
        R15_TargetWaterTemp targetWaterTemp = new R15_TargetWaterTemp();

        targetWaterTemp.setTargetWaterTemp(65);

        assertEquals(64, targetWaterTemp.decreaseTargetWaterTemp());

    }

    @Test
    @DisplayName("Shouldn't decrease targetWaterTemp due to hitting the minimum water temperature ")

    void hittingTargetWaterTempMin(){
        R15_TargetWaterTemp targetWaterTemp = new R15_TargetWaterTemp();

        targetWaterTemp.setTargetWaterTemp(55);

        assertEquals(55, targetWaterTemp.decreaseTargetWaterTemp());

    }

    @Test
    @DisplayName("Shouldn't increase targetWaterTemp due to hitting the maximum water temperature ")

    void hittingTargetWaterTempMax(){
        R15_TargetWaterTemp targetWaterTemp = new R15_TargetWaterTemp();

        targetWaterTemp.setTargetWaterTemp(80);

        assertEquals(80, targetWaterTemp.increaseTargetWaterTemp());

    }
}

