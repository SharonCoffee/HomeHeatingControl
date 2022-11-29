package cs3500.instruct;

import java.util.ArrayList;
import java.util.List;

public class R5_BoostTargetTemp {

    private List<Integer> boostTargetTempList;

    public R5_BoostTargetTemp() {
        boostTargetTempList = new ArrayList<>();
    }

    public int size() {

        //return 0;             this is done initially, but then it is changed later in the video to:
        return boostTargetTempList.size();
    }

    public void push(int targetTempValue) {
        boostTargetTempList.add(targetTempValue);
    }

    public boolean contains(int selectedValue) {
        for (int i = 0; i < boostTargetTempList.size(); i++) {
            if (selectedValue == boostTargetTempList.get(i)) {
                return true;
            } else {
                continue;
            }
        }
        return false;

    }
}
