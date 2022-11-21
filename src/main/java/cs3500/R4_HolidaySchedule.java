package cs3500;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class R4_HolidaySchedule {

    public LocalDate date;
    public LocalTime startTime;
    public LocalTime endTime;
    public List<String> holidaySchedule;



    public R4_HolidaySchedule() {
        holidaySchedule = new ArrayList<>();;
    }


    public void push(String start) {
        holidaySchedule.add(start);
    }

    public String pop() {
        return holidaySchedule.remove(holidaySchedule.size() - 1);
    }

    public int size() {
        return holidaySchedule.size();
    }


    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }
}
