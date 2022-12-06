package cs3500.swing;

import cs3500.operate.R14_TargetRoomTemp;
import cs3500.operate.R15_TargetWaterTemp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import static javax.swing.JOptionPane.*;
import static org.junit.jupiter.api.Assertions.*;

class UserInterfaceBBTest {

    JFrame frame;



    @BeforeEach
    void setUp() {

    }

    @Test
    void testZoneOne() {
        String expected = "Zone One is selected";
        //The function showMessageDialog(...) is similar to System.out.println(...), it just shows a message but there's no point in assigning any result to something.
        //If you want a result, use showInputDialog (which returns a String) or showOptionDialog (which returns an int).
        String actual = JOptionPane.showInputDialog(frame, "Zone One is selected", expected);
        assertEquals(expected,actual);
    }

    @Test
    void testZoneTwo() {
        String expected = "Zone Two is selected";
        String actual = JOptionPane.showInputDialog(frame, "Zone Two is selected", expected);
        assertEquals(expected,actual);
    }

    @Test
    void testZoneThree() {
        String expected = "Zone Three is selected";
        String actual = JOptionPane.showInputDialog(frame, "Zone Three is selected", expected);
        assertEquals(expected,actual);
    }

    @Test
    void testZoneFour() {
        String expected = "Zone Four is selected";
        String actual = JOptionPane.showInputDialog(frame, "Zone Four is selected", expected);
        assertEquals(expected,actual);
    }

    @Test
    void testZoneOn() {
        String expected = "The system is now On";
        String actual = JOptionPane.showInputDialog(frame, "The system is now On", expected);
        assertEquals(expected,actual);
    }

    @Test
    void testZoneOff() {
        String expected = "The system is now Off";
        String actual = JOptionPane.showInputDialog(frame, "The system is now Off", expected);
        assertEquals(expected,actual);
    }

    @Test
    void testZoneAuto() {
        String expected = "The system is now in Auto Mode";
        String actual = JOptionPane.showInputDialog(frame, "The system is now in Auto Mode", expected);
        assertEquals(expected,actual);
    }

    @Test
    void testZoneBoost() {
        String expected = "The zone selected has been boosted.";
        String actual = JOptionPane.showInputDialog(frame, "The zone selected has been boosted.", expected);
        assertEquals(expected,actual);
    }

    @Test
    void testFrostOn() {
        String expected = "Frost protection is selected";
        String actual = JOptionPane.showInputDialog(frame, "Frost protection is selected", expected);
        assertEquals(expected,actual);
    }
    @Test
    void testFrostOff() {
        String expected = "Frost protection is deselected";
        String actual = JOptionPane.showInputDialog(frame, "Frost protection is deselected", expected);
        assertEquals(expected,actual);
    }
    @Test
    void testAlertsOn() {
        String expected = "Alert messages will be sent.";
        String actual = JOptionPane.showInputDialog(frame, "Alert messages will be sent.", expected);
        assertEquals(expected,actual);
    }
    @Test
    void testAlertsOff() {
        String expected = "Alert messages will not be sent";
        String actual = JOptionPane.showInputDialog(frame, "Alert messages will not be sent", expected);
        assertEquals(expected,actual);
    }
    @Test
    void upButtonTargetRoomTemp() {
        String expected = "Target Room Temperature cannot be increased above 26 degrees Celsius.";
        String actual = JOptionPane.showInputDialog(frame, "Target Room Temperature cannot be increased above 26 degrees Celsius.", expected);
        assertEquals(expected,actual);
    }

    @Test
    void downButtonTargetRoomTemp() {
        String expected = "Target Room Temperature cannot be decreased below 18 degrees Celsius.";
        String actual = JOptionPane.showInputDialog(frame, "Target Room Temperature cannot be decreased below 18 degrees Celsius.", expected);
        assertEquals(expected,actual);
    }
    @Test
    void upButtonTargetWaterTemp() {
        String expected = "Target Water Temperature cannot be increased above 80 degrees Celsius.";
        String actual = JOptionPane.showInputDialog(frame, "Target Water Temperature cannot be increased above 80 degrees Celsius.", expected);
        assertEquals(expected,actual);
    }

    @Test
    void downButtonTargetWaterTemp() {
        String expected = "Target Water Temperature cannot be decreased below 55 degrees Celsius.";
        String actual = JOptionPane.showInputDialog(frame, "Target Water Temperature cannot be decreased below 55 degrees Celsius.", expected);
        assertEquals(expected,actual);
    }
    @Test
    void upButtonBoostTargetTemp() {
        String expected = "Boost Target Temperature cannot be increased above 26 degrees Celsius.";
        String actual = JOptionPane.showInputDialog(frame, "Boost Target Temperature cannot be increased above 26 degrees Celsius.", expected);
        assertEquals(expected,actual);
    }

    @Test
    void downButtonBoostTargetTemp() {
        String expected = "Boost Target Temperature cannot be decreased below 20 degrees Celsius.";
        String actual = JOptionPane.showInputDialog(frame, "Boost Target Temperature cannot be decreased below 20 degrees Celsius.", expected);
        assertEquals(expected,actual);
    }
    @Test
    void upButtonBoostSchedule() {
        String expected = "Boost Time Schedule cannot be set higher than 180 minutes.";
        String actual = JOptionPane.showInputDialog(frame, "Boost Time Schedule cannot be set higher than 180 minutes.", expected);
        assertEquals(expected,actual);
    }
    @Test
    void downButtonBoostSchedule() {
        String expected = "Boost Time Schedule cannot be set lower than 60 minutes.";
        String actual = JOptionPane.showInputDialog(frame, "Boost Time Schedule cannot be set lower than 60 minutes.", expected);
        assertEquals(expected,actual);
    }
    @Test
    void upButtonMinOilLeve() {
        String expected = "Minimum oil level cannot be set above 500L.";
        String actual = JOptionPane.showInputDialog(frame, "Minimum oil level cannot be set above 500L.", expected);
        assertEquals(expected,actual);
    }
    @Test
    void downButtonMinOilLevel() {
        String expected = "Minimum oil level cannot be set below 100L";
        String actual = JOptionPane.showInputDialog(frame, "Minimum oil level cannot be set below 100L", expected);
        assertEquals(expected,actual);
    }
    @Test
    void saveAutoTimeSchedule() {
        String expected = "Selected schedule: Tuesday with start time: 16:30 and end time: 18:30. Auto Time Schedule has been saved.";
        String actual = JOptionPane.showInputDialog(frame, "Selected schedule: Tuesday with start time: 16:30 and end time: 18:30. Auto Time Schedule has been saved.", expected);
        assertEquals(expected,actual);
    }
    @Test
    void cancelAutoTimeSchedule() {
        String expected = "Auto Time Schedule has been cancelled";
        String actual = JOptionPane.showInputDialog(frame, "Auto Time Schedule has been cancelled", expected);
        assertEquals(expected,actual);
    }
    @Test
    void saveHolidaySchedule() {
        String expected = "Holiday schedule from: 01-January-2023 to: 10-January-2023 is selected. Holiday Schedule has been saved";
        String actual = JOptionPane.showInputDialog(frame, "Holiday schedule from: 01-January-2023 to: 10-January-2023 is selected. Holiday Schedule has been saved", expected);
        assertEquals(expected,actual);
    }
    @Test
    void cancelHolidaySchedule() {
        String expected = "Holiday Schedule has been cancelled";
        String actual = JOptionPane.showInputDialog(frame, "Holiday Schedule has been cancelled", expected);
        assertEquals(expected,actual);
    }

    @Test
    void saveServiceSchedule() {
        String expected = "Service date selected: 01-January-2023. Service Schedule has been saved";
        String actual = JOptionPane.showInputDialog(frame, "Service date selected: 01-January-2023. Service Schedule has been saved", expected);
        assertEquals(expected,actual);
    }
    @Test
    void cancelServiceSchedule() {
        String expected = "Service Schedule has been cancelled";
        String actual = JOptionPane.showInputDialog(frame, "Service Schedule has been cancelled", expected);
        assertEquals(expected,actual);
    }

    @Test
    void buttonGenerate() {
        String expected = "Activity Log has been generated.An email with the report link has been sent.";
        String actual = JOptionPane.showInputDialog(frame, "Activity Log has been generated.An email with the report link has been sent.", expected);
        assertEquals(expected,actual);
    }
    @Test
    void buttonOk() {
        String expected = "Action: Ok";
        String actual = JOptionPane.showInputDialog(frame, "Action: Ok", expected);
        assertEquals(expected,actual);
    }
    @Test
    void buttonApply() {
        String expected = "Action: Applied";
        String actual = JOptionPane.showInputDialog(frame, "Action: Applied", expected);
        assertEquals(expected,actual);
    }
    @Test
    void buttonCancel() {
        String expected = "Action: Cancelled";
        String actual = JOptionPane.showInputDialog(frame, "Action: Cancelled", expected);
        assertEquals(expected,actual);
    }


}