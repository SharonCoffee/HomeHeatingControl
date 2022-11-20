package cs3500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class R14_TargetRoomTempTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("Should set targetroomtemp to 20")

    void setTargetRoomTempTo20(){
        R14_TargetRoomTemp targetRoomTemp = new R14_TargetRoomTemp();

        assertEquals(20,targetRoomTemp.settargetRoomtemp(20));
    }

    @Test
    @DisplayName("Should get targetroomtemp which is 20")

    void getTargetRoomTemp20(){
        R14_TargetRoomTemp targetRoomTemp = new R14_TargetRoomTemp();

        targetRoomTemp.settargetRoomtemp(20);

        assertEquals(20,targetRoomTemp.gettargetRoomtemp());
    }

    @Test
    @DisplayName("Should increases targetroomtemp to 21")

    void increaseTargetRoomTempTo21(){
        R14_TargetRoomTemp targetRoomTemp = new R14_TargetRoomTemp();

        targetRoomTemp.settargetRoomtemp(20);

        assertEquals(21,targetRoomTemp.increasetargetRoomtemp());
    }

    @Test
    @DisplayName("Should increases targetroomtemp to 21")

    void decreaseTargetRoomTempTo19(){
        R14_TargetRoomTemp targetRoomTemp = new R14_TargetRoomTemp();

        targetRoomTemp.settargetRoomtemp(20);

        assertEquals(19,targetRoomTemp.decreasetargetRoomtemp());
    }
}