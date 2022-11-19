package cs3500;


import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Calendar;

public class R3_AutoTimeSchedule {

    public List<String> schedule;
    //public SortedMap<LocalDateTime, R13_ZoneState> zoneSchedule;
    Calendar scheduleDate;



    public R3_AutoTimeSchedule() {
        schedule = new ArrayList<>();
        //zoneSchedule = new TreeMap<LocalDateTime, R13_ZoneState>();
        scheduleDate = Calendar.getInstance();
    }


    public void push(String start) {
        schedule.add(start);
    }

    public String pop() {
        return schedule.remove(schedule.size() - 1);
    }

    public int size() {
        return schedule.size();
    }
}
