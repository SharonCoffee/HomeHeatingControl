package cs3500.instruct;


import java.util.ArrayList;
import java.util.List;

public class R5_BoostTargetTemp {

    private static int[] boostTargetTempArray;

    public R5_BoostTargetTemp() {
        this.boostTargetTempArray = new int[] {20, 22, 24, 26};
    }

    public static int[] getBoostTargetTempArray() {
        return boostTargetTempArray;
    }

    public void setBoostTargetTempArray(int[] boostTargetTempArray) {
        this.boostTargetTempArray = boostTargetTempArray;
    }


    public int getLengthOfArray() {
        return boostTargetTempArray.length;
    }


    public boolean contains(int selectedValue) {
        for (int i = 0; i < boostTargetTempArray.length; i++) {
            if (selectedValue == boostTargetTempArray[i]) {
                return true;
            } else {
                continue;
            }
        }
        return false;

    }


}
