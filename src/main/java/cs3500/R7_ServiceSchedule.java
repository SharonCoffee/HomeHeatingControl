package cs3500;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class R7_ServiceSchedule {
    public LocalDate date;

    public List<String> serviceSchedule;

    public R7_ServiceSchedule() {
        serviceSchedule = new ArrayList<>();;
    }
    public int size() {
        return serviceSchedule.size();
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getServiceMessage() {
        System.out.println("Boiler and Radiator service is now due.");
        return "Boiler and Radiator service is now due.";
    }

    public String getServiceMessageReminder() {
        return "Boiler and Radiator service is due in 30 days.";
    }
}
