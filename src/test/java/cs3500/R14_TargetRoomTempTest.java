package cs3500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class R14_TargetRoomTempTest {

    R14_TargetRoomTemp targetRoomTemp;

    @BeforeEach
    void setUp() {
        targetRoomTemp = new R14_TargetRoomTemp();
    }

    @Test
    @DisplayName("Should set targetRoomTemp to 20")
    void setTargetRoomTempTo20(){
        targetRoomTemp.setTargetRoomTemp(20);
        assertEquals(20,targetRoomTemp.setTargetRoomTemp(20));
    }

    @Test
    @DisplayName("Should get targetRoomTemp which is 20")
    void getTargetRoomTemp20(){
        targetRoomTemp.setTargetRoomTemp(20);
        assertEquals(20,targetRoomTemp.getTargetRoomTemp());
    }

    @Test
    @DisplayName("Should increases targetRoomTemp to 21")
    void increaseTargetRoomTempTo21(){
        targetRoomTemp.setTargetRoomTemp(20);
        assertEquals(21,targetRoomTemp.increaseTargetRoomTemp());
    }

    @Test
    @DisplayName("Should increases targetRoomTemp to 21")
    void decreaseTargetRoomTempTo19(){
        targetRoomTemp.setTargetRoomTemp(20);
        assertEquals(19,targetRoomTemp.decreaseTargetRoomTemp());
    }

    @Test
    @DisplayName("Should not increase targetRoomTemp since it would go above the max room temperature")
    void hitTargetRoomTempMaximumTemp(){
        targetRoomTemp.setTargetRoomTemp(26);
        assertEquals(26,targetRoomTemp.increaseTargetRoomTemp());
    }

    @Test
    @DisplayName("Should not decrease targetRoomTemp since it would go below the min room temperature")
    void hitTargetRoomTempMinimumTemp(){
        targetRoomTemp.setTargetRoomTemp(18);
        assertEquals(18,targetRoomTemp.decreaseTargetRoomTemp());
    }
}