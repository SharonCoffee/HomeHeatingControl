package cs3500.swing;

import cs3500.instruct.*;
import cs3500.operate.R14_TargetRoomTemp;
import cs3500.operate.R15_TargetWaterTemp;
import cs3500.operate.R16_BoostTimes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class UserInterface implements ActionListener {

    JFrame frame;
    JPanel panel;
    JPanel panelA;
    JPanel panelB;
    JPanel panelC;
    JPanel panelD;
    JPanel panelE;
    JPanel panelF;
    JPanel panelG;
    JPanel panelH;
    JPanel panelI;
    JPanel panelJ;

    JLabel labelZone;
    JButton zoneOne;
    JButton zoneTwo;
    JButton zoneThree;
    JButton zoneFour;

    JLabel labelZoneState;
    JButton zoneOn;
    JButton zoneOff;
    JButton zoneAuto;
    JButton zoneBoost;
    JLabel labelFrostProtection;
    JButton frostOn;
    JButton frostOff;

    JLabel labelAlerts;
    JButton alertsOn;
    JButton alertsOff;

    JLabel labelTargetRoomTemp;
    JTextField textTargetRoomTemp;
    JButton upButtonTargetRoomTemp;
    JButton downButtonTargetRoomTemp;
    JLabel labelTargetWaterTemp;
    JTextField textTargetWaterTemp;
    JButton upButtonTargetWaterTemp;
    JButton downButtonTargetWaterTemp;

    JLabel labelBoostTargetTemp;
    JTextField textBoostTargetTemp;
    JButton upButtonBoostTargetTemp;
    JButton downButtonBoostTargetTemp;

    JLabel labelBoostSchedule;
    JTextField textBoostSchedule;
    JButton upButtonBoostSchedule;
    JButton downButtonBoostSchedule;

    JLabel labelMinOilLevel;
    JTextField textMinOilLevel;
    JButton upButtonMinOilLevel;
    JButton downButtonMinOilLevel;

    JLabel labelAutoWeekDay;
    JLabel labelSetAutoWeekDay;
    JComboBox comboBoxAutoWeekDay;
    JLabel labelAutoStartTime;
    JComboBox comboBoxAutoStartHour;
    JComboBox comboBoxAutoStartMinutes;
    JLabel labelSetStartTime;
    JLabel labelAutoEndTime;
    JComboBox comboBoxAutoEndHour;
    JComboBox comboBoxAutoEndMinutes;
    JLabel labelSetEndTime;
    JButton saveAutoTimeSchedule;
    JButton cancelAutoTimeSchedule;

    JLabel labelHolidaySchedule;
    JLabel labelSetStartHolidayTime;
    JComboBox comboBoxStartHolidayDay;
    JComboBox comboBoxStartHolidayMonth;
    JComboBox comboBoxStartHolidayYear;
    JLabel labelSetEndHolidayTime;
    JComboBox comboBoxEndHolidayDay;
    JComboBox comboBoxEndHolidayMonth;
    JComboBox comboBoxEndHolidayYear;
    JButton saveHolidaySchedule;
    JButton cancelHolidaySchedule;

    JLabel labelServiceSchedule;
    JComboBox comboBoxServiceDay;
    JComboBox comboBoxServiceMonth;
    JComboBox comboBoxServiceYear;
    JButton saveServiceSchedule;
    JButton cancelServiceSchedule;

    JLabel labelActivityLog;
    JButton buttonGenerate;

    JButton buttonOk;
    JButton buttonApply;
    JButton buttonCancel;


    private int targetRoomTemperature = 19;
    private int targetWaterTemperature = 60;
    private int boostTargetTemperature = 20;
    private int minOilLevel = 100;

    private int boostTime = 60;

    private String weekDay = "";
    private int startHour = 0;

    private int startMinutes = 0;
    private int endHour = 0;
    private int endMinutes = 0;

    private int startDay = 0;
    private String startMonth = "";
    private int startYear = 0;
    private int endDay = 0;
    private String endMonth = "";
    private int endYear = 0;

    private int day = 0;
    private String month = "";
    private int year = 0;

    R5_BoostTargetTemp boostTargetTempList = new R5_BoostTargetTemp();
    private final int[] boostTempList = boostTargetTempList.getBoostTargetTempArray();


    R6_MinOilLevel minimumOilLevelList = new R6_MinOilLevel();
    private final int[] minOilList = minimumOilLevelList.getMinOilLevelArray();

    R16_BoostTimes boostTimesScheduleList = new R16_BoostTimes();
    private final int[] boostScheduleList = boostTimesScheduleList.getBoostTimeSchedule();

    R3_AutoTimeSchedule autoTimeScheduleList = new R3_AutoTimeSchedule();
    private final String[] autoWeekDayList = autoTimeScheduleList.getWeekDays();
    private final int[] autoStartHoursList = autoTimeScheduleList.getStartHours();
    private final int[] autoStartMinutesList = autoTimeScheduleList.getStartMinutes();
    private final int[] autoEndHoursList = autoTimeScheduleList.getEndHours();
    private final int[] autoEndMinutesList = autoTimeScheduleList.getEndMinutes();

    R4_HolidaySchedule holidayScheduleList = new R4_HolidaySchedule();

    private final int[] startHolidayDay = holidayScheduleList.getStartDay();
    private final String[] startHolidayMonth = holidayScheduleList.getStartMonth();
    private final int[] startHolidayYear = holidayScheduleList.getStartYear();
    private final int[] endHolidayDay = holidayScheduleList.getEndDay();
    private final String[] endHolidayMonth = holidayScheduleList.getEndMonth();
    private final int[] endHolidayYear = holidayScheduleList.getEndYear();

    R7_ServiceSchedule serviceScheduleList = new R7_ServiceSchedule();
    private final int[] serviceDay = serviceScheduleList.getDay();
    private final String[] serviceMonth = serviceScheduleList.getMonth();
    private final int[] serviceYear = serviceScheduleList.getYear();

    //int count = 0;
    public UserInterface() {
        frame = new JFrame();
        frame.setTitle("Home Heating Control System");

        zoneOne = new JButton("1");
        zoneTwo = new JButton("2");
        zoneThree = new JButton("3");
        zoneFour = new JButton("4");

        zoneOn = new JButton("ON");
        zoneOff = new JButton("OFF");
        zoneAuto = new JButton("AUTO");
        zoneBoost = new JButton("BOOST");

        frostOn = new JButton("ON");
        frostOff = new JButton("OFF");

        alertsOn = new JButton("ON");
        alertsOff = new JButton("OFF");

        textTargetRoomTemp = new JTextField("19", 2);
        upButtonTargetRoomTemp = new JButton("+");
        downButtonTargetRoomTemp = new JButton("-");

        textTargetWaterTemp = new JTextField("60", 2);
        upButtonTargetWaterTemp = new JButton("+");
        downButtonTargetWaterTemp = new JButton("-");

        textBoostTargetTemp = new JTextField("20", 2);
        upButtonBoostTargetTemp = new JButton("+");
        downButtonBoostTargetTemp = new JButton("-");

        textMinOilLevel = new JTextField("100", 2);
        upButtonMinOilLevel = new JButton("+");
        downButtonMinOilLevel = new JButton("-");

        textBoostSchedule = new JTextField("60", 2);
        upButtonBoostSchedule = new JButton("+");
        downButtonBoostSchedule = new JButton("-");

        comboBoxAutoWeekDay = new JComboBox(autoWeekDayList);

        comboBoxAutoStartHour = new JComboBox();
        for (int i = 0; i < 24; i++){
            comboBoxAutoStartHour.addItem(i);
        }
        comboBoxAutoStartHour.setBounds(50, 50, 50, 20);
        comboBoxAutoStartMinutes = new JComboBox();
        for (int i = 0; i < 56; i++) {
            comboBoxAutoStartMinutes.addItem(i);
            i += 4;
        }
        comboBoxAutoStartMinutes.setBounds(50, 50, 50, 20);
        comboBoxAutoEndHour = new JComboBox();
        for (int i = 0; i < 24; i++){
            comboBoxAutoEndHour.addItem(i);
        }
        comboBoxAutoEndHour.setBounds(50, 50, 50, 20);
        comboBoxAutoEndMinutes = new JComboBox();
        for (int i = 0; i < 56; i++) {
            comboBoxAutoEndMinutes.addItem(i);
            i += 4;
        }
        comboBoxAutoEndMinutes.setBounds(50, 50, 50, 20);
        saveAutoTimeSchedule = new JButton("Save");
        cancelAutoTimeSchedule = new JButton("Cancel");

        comboBoxStartHolidayDay = new JComboBox();
        for (int i = 1; i < 31; i++){
            comboBoxStartHolidayDay.addItem(i);
        }
        comboBoxStartHolidayDay.setBounds(50, 50, 50, 20);
        comboBoxStartHolidayMonth = new JComboBox(startHolidayMonth);
        comboBoxStartHolidayYear = new JComboBox();
        for (int i = 2022; i < 2050; i++) {
            comboBoxStartHolidayYear.addItem(i);
        }
        comboBoxStartHolidayYear.setBounds(50, 50, 50, 20);
        comboBoxEndHolidayDay = new JComboBox();
        for (int i = 1; i < 31; i++){
            comboBoxEndHolidayDay.addItem(i);
        }
        comboBoxEndHolidayDay.setBounds(50, 50, 50, 20);
        comboBoxEndHolidayMonth = new JComboBox(endHolidayMonth);
        comboBoxEndHolidayYear = new JComboBox();
        for (int i = 2022; i < 2050; i++) {
            comboBoxEndHolidayYear.addItem(i);
        }
        saveHolidaySchedule = new JButton("Save");
        cancelHolidaySchedule = new JButton("Cancel");


        // Start here
        comboBoxServiceDay = new JComboBox();
        for (int i = 1; i < 31; i++){
            comboBoxServiceDay.addItem(i);
        }
        comboBoxServiceDay.setBounds(50, 50, 50, 20);
        comboBoxServiceMonth = new JComboBox(serviceMonth);
        comboBoxServiceYear = new JComboBox();
        for (int i = 2022; i < 2050; i++) {
            comboBoxServiceYear.addItem(i);
        }
        saveServiceSchedule = new JButton("Save");
        cancelServiceSchedule = new JButton("Cancel");

        buttonGenerate = new JButton("Generate Activity Log");


        //buttonOk = new JButton("Ok");
        //buttonApply = new JButton("Apply");
        //buttonCancel = new JButton("Cancel");
        zoneOne.addActionListener(this);
        zoneTwo.addActionListener(this);
        zoneThree.addActionListener(this);
        zoneFour.addActionListener(this);
        zoneOn.addActionListener(this);
        zoneOff.addActionListener(this);
        zoneAuto.addActionListener(this);
        zoneBoost.addActionListener(this);
        frostOn.addActionListener(this);
        frostOff.addActionListener(this);
        alertsOn.addActionListener(this);
        alertsOff.addActionListener(this);
        upButtonTargetRoomTemp.addActionListener(this);
        downButtonTargetRoomTemp.addActionListener(this);
        upButtonTargetWaterTemp.addActionListener(this);
        downButtonTargetWaterTemp.addActionListener(this);
        upButtonBoostTargetTemp.addActionListener(this);
        downButtonBoostTargetTemp.addActionListener(this);
        upButtonBoostSchedule.addActionListener(this);
        downButtonBoostSchedule.addActionListener(this);
        upButtonMinOilLevel.addActionListener(this);
        downButtonMinOilLevel.addActionListener(this);

        comboBoxAutoWeekDay.addActionListener(this);
        comboBoxAutoStartMinutes.addActionListener(this);
        comboBoxAutoStartHour.addActionListener(this);
        comboBoxAutoEndHour.addActionListener(this);
        comboBoxAutoEndMinutes.addActionListener(this);
        saveAutoTimeSchedule.addActionListener(this);
        cancelAutoTimeSchedule.addActionListener(this);

        comboBoxStartHolidayDay.addActionListener(this);
        comboBoxStartHolidayMonth.addActionListener(this);
        comboBoxStartHolidayYear.addActionListener(this);
        comboBoxEndHolidayDay.addActionListener(this);
        comboBoxEndHolidayMonth.addActionListener(this);
        comboBoxEndHolidayYear.addActionListener(this);
        saveHolidaySchedule.addActionListener(this);
        cancelHolidaySchedule.addActionListener(this);

        comboBoxServiceDay.addActionListener(this);
        comboBoxServiceMonth.addActionListener(this);
        comboBoxServiceYear.addActionListener(this);
        saveServiceSchedule.addActionListener(this);
        cancelServiceSchedule.addActionListener(this);

        buttonGenerate.addActionListener(this);

        //buttonOk.addActionListener(this);
        //buttonApply.addActionListener(this);
        //buttonCancel.addActionListener(this);
        //JLabel label = new JLabel("");

        labelZone = new JLabel("Select Zone:");
        labelZoneState = new JLabel("Select Program Mode:");
        labelFrostProtection = new JLabel("Set Frost Protection:");
        labelAlerts = new JLabel("Set Alerts:");
        labelTargetRoomTemp = new JLabel("Target Room Temperature:");
        labelTargetWaterTemp = new JLabel("Target Water Temperature:");
        labelBoostTargetTemp = new JLabel("Boost Target Temperature:");
        labelBoostSchedule = new JLabel("Boost Time Schedule Setting:");
        labelMinOilLevel = new JLabel("Minimum Oil Level Setting:");
        labelAutoWeekDay = new JLabel("Auto Time Schedule: Weekday: ");
        labelSetAutoWeekDay = new JLabel("");
        labelAutoStartTime = new JLabel("From start time:");
        labelSetStartTime = new JLabel("");
        labelAutoEndTime = new JLabel("To end time:");
        labelSetEndTime = new JLabel("");
        labelHolidaySchedule = new JLabel("Holiday Schedule:");
        labelSetStartHolidayTime = new JLabel("From:");
        labelSetEndHolidayTime = new JLabel("To:");
        labelServiceSchedule = new JLabel("Boiler and Radiator Service Schedule:");
        labelActivityLog = new JLabel("Activity Log.");

        panel = new JPanel();
        panelA = new JPanel();
        panelB = new JPanel();
        panelC = new JPanel();
        panelD = new JPanel();
        panelE = new JPanel();
        panelF = new JPanel();
        panelG = new JPanel();
        panelH = new JPanel();
        panelI = new JPanel();

        //panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 300, 300));
        panelA.setPreferredSize(new Dimension(200, 10));
        panelA.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));
        panelB.setPreferredSize(new Dimension(200, 10));
        panelB.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));
        panelC.setPreferredSize(new Dimension(200, 10));
        panelC.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));
        panelD.setPreferredSize(new Dimension(200, 10));
        panelD.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));
        panel.setPreferredSize(new Dimension(200, 50));
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));
        panelE.setPreferredSize(new Dimension(200, 10));
        panelE.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));
        panelF.setPreferredSize(new Dimension(200, 50));
        panelF.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));
        panelG.setPreferredSize(new Dimension(200, 50));
        panelG.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));
        panelH.setPreferredSize(new Dimension(200, 50));
        panelH.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));
        panelI.setPreferredSize(new Dimension(200, 50));
        panelI.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));
        //panel.setLayout(new GridLayout(10, 5));
        //panel.add(buttonOk);
        //panel.add(label);
        //panel.add(buttonApply);
        //panel.add(buttonCancel);
        panelA.add(labelZone);
        panelA.add(zoneOne);
        panelA.add(zoneTwo);
        panelA.add(zoneThree);
        panelA.add(zoneFour);
        panelB.add(labelZoneState);
        panelB.add(zoneOn);
        panelB.add(zoneOff);
        panelB.add(zoneAuto);
        panelB.add(zoneBoost);
        panelA.add(labelFrostProtection);
        panelA.add(frostOn);
        panelA.add(frostOff);
        panelC.add(labelTargetRoomTemp);
        panelC.add(textTargetRoomTemp);
        panelC.add(upButtonTargetRoomTemp);
        panelC.add(downButtonTargetRoomTemp);
        panelD.add(labelTargetWaterTemp);
        panelD.add(textTargetWaterTemp);
        panelD.add(upButtonTargetWaterTemp);
        panelD.add(downButtonTargetWaterTemp);
        panel.add(labelAlerts);
        panel.add(alertsOn);
        panel.add(alertsOff);
        panel.add(labelBoostTargetTemp);
        panel.add(textBoostTargetTemp);
        panel.add(upButtonBoostTargetTemp);
        panel.add(downButtonBoostTargetTemp);
        panel.add(labelBoostSchedule);
        panel.add(textBoostSchedule);
        panel.add(upButtonBoostSchedule);
        panel.add(downButtonBoostSchedule);
        panel.add(labelMinOilLevel);
        panel.add(textMinOilLevel);
        panel.add(upButtonMinOilLevel);
        panel.add(downButtonMinOilLevel);
        panelE.add(labelAutoWeekDay);
        panelE.add(comboBoxAutoWeekDay);
        panelE.add(labelSetAutoWeekDay);
        panelE.add(labelAutoStartTime);
        panelE.add(comboBoxAutoStartHour);
        panelE.add(comboBoxAutoStartMinutes);
        panelE.add(labelSetStartTime);
        panelE.add(labelAutoEndTime);
        panelE.add(comboBoxAutoEndHour);
        panelE.add(comboBoxAutoEndMinutes);
        panelE.add(labelSetEndTime);
        panelE.add(saveAutoTimeSchedule);
        panelE.add(cancelAutoTimeSchedule);
        panelF.add(labelHolidaySchedule);
        panelF.add(labelSetStartHolidayTime);
        panelF.add(comboBoxStartHolidayDay);
        panelF.add(comboBoxStartHolidayMonth);
        panelF.add(comboBoxStartHolidayYear);
        panelF.add(labelSetEndHolidayTime);
        panelF.add(comboBoxEndHolidayDay);
        panelF.add(comboBoxEndHolidayMonth);
        panelF.add(comboBoxEndHolidayYear);
        panelF.add(saveHolidaySchedule);
        panelF.add(cancelHolidaySchedule);
        panelG.add(labelServiceSchedule);
        panelG.add(comboBoxServiceDay);
        panelG.add(comboBoxServiceMonth);
        panelG.add(comboBoxServiceYear);
        panelG.add(saveServiceSchedule);
        panelG.add(cancelServiceSchedule);
        panelH.add(labelActivityLog);
        panelH.add(buttonGenerate);

        //frame.add(panel, BorderLayout.CENTER);

        frame.add(panelI);
        frame.add(panelA);
        frame.add(panelB);
        frame.add(panelC);
        frame.add(panelD);
        frame.add(panel);
        frame.add(panelE);
        frame.add(panelF);
        frame.add(panelG);
        frame.add(panelH);
        frame.setSize(1000, 1000);
        frame.setLayout(new GridLayout(20, 20));
        frame.pack();         // packs all panels into the frame.
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param event the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == zoneOne) {
            JOptionPane.showMessageDialog(frame, "Zone One is selected");
        }
        if(event.getSource() == zoneTwo) {
            JOptionPane.showMessageDialog(frame, "Zone Two is selected");
        }
        if(event.getSource() == zoneThree) {
            JOptionPane.showMessageDialog(frame, "Zone Three is selected");
        }
        if(event.getSource() == zoneFour) {
            JOptionPane.showMessageDialog(frame, "Zone Four is selected");
        }
        if(event.getSource() == zoneOn) {
            JOptionPane.showMessageDialog(frame, "The system is now On");
        }
        if(event.getSource() == zoneOff) {
            JOptionPane.showMessageDialog(frame, "The system is now Off");
        }
        if(event.getSource() == zoneAuto) {
            JOptionPane.showMessageDialog(frame, "The system is now in Auto Mode");
        }
        if(event.getSource() == zoneBoost) {
            JOptionPane.showMessageDialog(frame, "The zone selected has been boosted.");
        }
        if(event.getSource() == frostOn) {
            JOptionPane.showMessageDialog(frame, "Frost protection is selected");
        }
        if(event.getSource() == frostOff) {
            JOptionPane.showMessageDialog(frame, "Frost protection is deselected");
        }
        if(event.getSource() == alertsOn) {
            JOptionPane.showMessageDialog(frame, "Alert messages will be sent.");
        }
        if(event.getSource() == alertsOff) {
            JOptionPane.showMessageDialog(frame, "Alert messages will not be sent");
        }
        if(event.getSource() == upButtonTargetRoomTemp) {
            //increase the target temperature by 1
            if (targetRoomTemperature < R14_TargetRoomTemp.getcMaxRoomTemp()) {
                targetRoomTemperature++;
                textTargetRoomTemp.setText("" + targetRoomTemperature);
                JOptionPane.showMessageDialog(frame, "Target Room Temperature: " + targetRoomTemperature);
            } else {
                JOptionPane.showMessageDialog(frame, "Target Room Temperature cannot be increased above 26 degrees Celsius.");
            }
        }
        if(event.getSource() == downButtonTargetRoomTemp) {
            //decrease the target temperature by 1
            if (targetRoomTemperature > R14_TargetRoomTemp.getcMinRoomTemp()) {
                targetRoomTemperature--;
                textTargetRoomTemp.setText("" + targetRoomTemperature);
                JOptionPane.showMessageDialog(frame, "Target Room Temperature: " + targetRoomTemperature);
            } else {
                JOptionPane.showMessageDialog(frame, "Target Room Temperature cannot be decreased below 18 degrees Celsius.");
            }
        }
        if(event.getSource() == upButtonTargetWaterTemp) {
            if (targetWaterTemperature < R15_TargetWaterTemp.getcMaxWaterTemp()) {
                targetWaterTemperature += 5;
                textTargetWaterTemp.setText("" + targetWaterTemperature);
                JOptionPane.showMessageDialog(frame, "Target Water Temperature: " + targetWaterTemperature);
            } else {
                JOptionPane.showMessageDialog(frame, "Target Water Temperature cannot be increased above 80 degrees Celsius.");
            }
        }
        if(event.getSource() == downButtonTargetWaterTemp) {
            if (targetWaterTemperature > R15_TargetWaterTemp.getcMinWaterTemp()) {
                targetWaterTemperature -= 5;
                textTargetWaterTemp.setText("" + targetWaterTemperature);
                JOptionPane.showMessageDialog(frame, "Target Water Temperature: " + targetWaterTemperature);
            } else {
                JOptionPane.showMessageDialog(frame, "Target Water Temperature cannot be decreased below 55 degrees Celsius.");
            }
        }
        if(event.getSource() == upButtonBoostTargetTemp) {
            int lastItem = boostTempList[boostTempList.length - 1];
            if (boostTargetTemperature < lastItem) {
                boostTargetTemperature += 2;
                textBoostTargetTemp.setText("" + boostTargetTemperature);
                JOptionPane.showMessageDialog(frame, "Boost Target Temperature: " + boostTargetTemperature);
            } else {
                JOptionPane.showMessageDialog(frame, "Boost Target Temperature cannot be increased above 26 degrees Celsius.");
            }
        }
        if(event.getSource() == downButtonBoostTargetTemp) {
            int firstItem = boostTempList[0];
            if (boostTargetTemperature > firstItem) {
                boostTargetTemperature -= 2;
                textTargetRoomTemp.setText("" + boostTargetTemperature);
                JOptionPane.showMessageDialog(frame, "Boost Target Temperature: " + boostTargetTemperature);
            } else {
                JOptionPane.showMessageDialog(frame, "Boost Target Temperature cannot be decreased below 20 degrees Celsius.");
            }
        }
        if(event.getSource() == upButtonBoostSchedule) {
            int lastItem = boostScheduleList[boostScheduleList.length - 1];
            if (boostTime < lastItem) {
                boostTime += 60;
                textBoostSchedule.setText("" + boostTime);
                JOptionPane.showMessageDialog(frame, "Boost Time Schedule: " + boostTime);
            } else {
                JOptionPane.showMessageDialog(frame, "Boost Time Schedule cannot be set higher than 180 minutes.");
            }
        }
        if(event.getSource() == downButtonBoostSchedule) {
            int firstItem = boostScheduleList[0];
            if (boostTime > firstItem) {
                boostTime -= 60;
                textBoostSchedule.setText("" + boostTime);
                JOptionPane.showMessageDialog(frame, "Boost Time Schedule: " + boostTime);
            } else {
                JOptionPane.showMessageDialog(frame, "Boost Time Schedule cannot be set lower than 60 minutes.");
            }
        }
        if(event.getSource() == upButtonMinOilLevel) {
            int lastItem = minOilList[minOilList.length - 1];
            if (minOilLevel < lastItem) {
                minOilLevel += 100;
                textMinOilLevel.setText("" + minOilLevel);
                JOptionPane.showMessageDialog(frame, "Minimum oil level: " + minOilLevel);
            } else {
                JOptionPane.showMessageDialog(frame, "Minimum oil level cannot be set above 500L.");
            }
        }
        if(event.getSource() == downButtonMinOilLevel) {
            int firstItem = minOilList[0];
            if (minOilLevel > firstItem) {
                minOilLevel -= 100;
                textMinOilLevel.setText("" + minOilLevel);
                JOptionPane.showMessageDialog(frame, "Minimum oil level: " + minOilLevel);
            } else {
                JOptionPane.showMessageDialog(frame, "Minimum oil level cannot be set below 100L.");
            }
        }
        if (event.getSource() == comboBoxAutoWeekDay) {
            weekDay = (String) comboBoxAutoWeekDay.getSelectedItem();
            //JOptionPane.showMessageDialog(frame, "Selected Weekday: " + weekDay);
        }
        if (event.getSource() == comboBoxAutoStartHour || event.getSource() == comboBoxAutoStartMinutes) {
            startHour = (int) comboBoxAutoStartHour.getSelectedItem();
            startMinutes = (int) comboBoxAutoStartMinutes.getSelectedItem();
            //JOptionPane.showMessageDialog(frame, "Selected Start Time: "+ startHour + ":" + startMinutes);
        }
        if(event.getSource() == comboBoxAutoEndHour || event.getSource() == comboBoxAutoEndMinutes) {
            endHour = (int)comboBoxAutoEndHour.getSelectedItem();
            endMinutes = (int)comboBoxAutoEndMinutes.getSelectedItem();
            //JOptionPane.showMessageDialog(frame, "Selected End Time: "+ endHour + ":" + endMinutes);
            //JOptionPane.showMessageDialog(frame, "End Hour cannot be set before start hour.");
        }
        if(event.getSource() == saveAutoTimeSchedule) {
            JOptionPane.showMessageDialog(frame, "Selected schedule: " + weekDay + " with start time: " + startHour + ":" + startMinutes + " and end time: " + endHour + ":" + endMinutes + ".\nAuto Time Schedule has been saved");
        }
        if(event.getSource() == cancelAutoTimeSchedule) {
            comboBoxAutoStartHour.setSelectedItem(0);
            comboBoxAutoStartMinutes.setSelectedItem(0);
            comboBoxAutoEndHour.setSelectedItem(0);
            comboBoxAutoEndMinutes.setSelectedItem(0);
            JOptionPane.showMessageDialog(frame, "Auto Time Schedule has been cancelled");
        }
        if(event.getSource() == comboBoxStartHolidayDay) {
            startDay = (int) comboBoxStartHolidayDay.getSelectedItem();
        }
        if(event.getSource() == comboBoxStartHolidayMonth) {
            startMonth = (String) comboBoxStartHolidayMonth.getSelectedItem();
        }
        if(event.getSource() == comboBoxStartHolidayYear) {
            startYear = (int) comboBoxStartHolidayYear.getSelectedItem();
        }
        if(event.getSource() == comboBoxEndHolidayDay) {
            endDay = (int) comboBoxEndHolidayDay.getSelectedItem();
        }
        if(event.getSource() == comboBoxEndHolidayMonth) {
            endMonth = (String) comboBoxEndHolidayMonth.getSelectedItem();
        }
        if(event.getSource() == comboBoxEndHolidayYear) {
            endYear = (int) comboBoxEndHolidayYear.getSelectedItem();
        }
        if(event.getSource() == saveHolidaySchedule) {
            JOptionPane.showMessageDialog(frame, "Holiday schedule from: " + startDay + "-" + startMonth + "-" + startYear + " to: " + endDay + "-" + endMonth + "-" + endYear + " is selected.\nHoliday Schedule has been saved");
        }
        if(event.getSource() == cancelHolidaySchedule) {
            comboBoxStartHolidayDay.setSelectedItem(1);
            comboBoxStartHolidayMonth.setSelectedItem("January");
            comboBoxStartHolidayYear.setSelectedItem(2022);
            comboBoxEndHolidayDay.setSelectedItem(1);
            comboBoxEndHolidayMonth.setSelectedItem("January");
            comboBoxEndHolidayYear.setSelectedItem(2023);
            JOptionPane.showMessageDialog(frame, "Holiday Schedule has been cancelled");
        }
        if(event.getSource() == comboBoxServiceDay) {
            day = (int) comboBoxServiceDay.getSelectedItem();
        }
        if(event.getSource() == comboBoxServiceMonth) {
            month = (String) comboBoxServiceMonth.getSelectedItem();
        }
        if(event.getSource() == comboBoxServiceYear) {
            year = (int) comboBoxServiceYear.getSelectedItem();
        }
        if(event.getSource() == saveServiceSchedule) {
            JOptionPane.showMessageDialog(frame, "Service date selected: " + day + "-" + month + "-" + year + "\nService Schedule has been saved");
        }
        if(event.getSource() == cancelServiceSchedule) {
            comboBoxServiceDay.setSelectedItem(1);
            comboBoxServiceMonth.setSelectedItem("January");
            comboBoxServiceYear.setSelectedItem(2023);
            JOptionPane.showMessageDialog(frame, "Service Schedule has been cancelled");
        }
        if(event.getSource() == buttonGenerate) {
            JOptionPane.showMessageDialog(frame, "Activity Log has been generated.\nAn email with the report link has been sent.");
        }

        if(event.getSource() == buttonOk) {
            JOptionPane.showMessageDialog(frame, "Action: Ok");
        }
        if(event.getSource() == buttonApply) {
            JOptionPane.showMessageDialog(frame, "Action: Applied");
        }
        if(event.getSource() == buttonCancel) {
            JOptionPane.showMessageDialog(frame, "Action: Cancelled");
        }

   }
}
