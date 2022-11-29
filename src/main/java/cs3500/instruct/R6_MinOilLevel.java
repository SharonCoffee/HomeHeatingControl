package cs3500.instruct;

import java.util.ArrayList;

public class R6_MinOilLevel {

    public ArrayList<Integer> oilLevel;
    public final int cMIN_OIL_LEVEL = 0;
    public final int cMAX_OIL_LEVEL = 0;

    public R6_MinOilLevel() {
        oilLevel = new ArrayList<>();
    }
    public int size() {
        return oilLevel.size();
    }

    public void push(int oilLevelValue) {
        oilLevel.add(oilLevelValue);
    }

    public String message(String textMessage) {
        textMessage = "Minimum oil level has been reached.";
        return textMessage;
    }

    public void addOilLevels(int minOilLevelValue, int maxOilLevelValue) {
        if (minOilLevelValue < cMIN_OIL_LEVEL) {
            oilLevelTooLow("Oil level selected below minimum oil level value.");
        } else if (maxOilLevelValue > cMAX_OIL_LEVEL) {
            oilLevelTooHigh("Oil level selected above maximum oil level value.");
        } else {
            for (int i = minOilLevelValue; i <= maxOilLevelValue; i++) {
                oilLevel.add(i);
            }
        }
    }

    private String oilLevelTooHigh(String maximumMessage) {
        return maximumMessage;
    }

    private String oilLevelTooLow(String minimumMessage) {
        return minimumMessage;
    }

    public boolean contains(int vMinOilLevel) {
        for (int i = 0; i < oilLevel.size(); i++) {
            if (vMinOilLevel == oilLevel.get(i)) {
                return true;
            } else {
                continue;
            }
        }
        return false;
    }

}
