package cs3500.instruct;

import java.util.ArrayList;

public class R6_MinOilLevel {

    private static int[] minOilLevelArray;

    public R6_MinOilLevel() {
        this.minOilLevelArray = new int[] {100, 200, 300, 400, 500};
    }
    public static int[] getMinOilLevelArray() {
        return minOilLevelArray;
    }

    public void setMinOilLevelArray(int[] minOilLevelArray) {
        this.minOilLevelArray = minOilLevelArray;
    }


    public int getLengthOfArray() {
        return minOilLevelArray.length;
    }


    public boolean contains(int selectedValue) {
        for (int i = 0; i < minOilLevelArray.length; i++) {
            if (selectedValue == minOilLevelArray[i]) {
                return true;
            } else {
                continue;
            }
        }
        return false;

    }


}
