package cs3500.swing;

import cs3500.instruct.R5_BoostTargetTemp;
import cs3500.instruct.R6_MinOilLevel;
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

    JLabel labelAutoTimeSchedule;
    JLabel labelAutoWeekDay;
    JLabel labelAutoStartHour;
    JLabel labelAutoEndHour;

    JButton buttonOk;
    JButton buttonApply;
    JButton buttonCancel;


    private int targetRoomTemperature = 19;
    private int targetWaterTemperature = 60;
    private int boostTargetTemperature = 20;
    private int minOilLevel = 100;

    private int boostTime = 60;

    R5_BoostTargetTemp boostTargetTempList = new R5_BoostTargetTemp();
    private int[] boostTempList = boostTargetTempList.getBoostTargetTempArray();

    R6_MinOilLevel minOilLevelList = new R6_MinOilLevel();
    private int[] minOilList = minOilLevelList.getMinOilLevelArray();

    R16_BoostTimes boostTimeScheduleList = new R16_BoostTimes();
    private int[] boostScheduleList = boostTimeScheduleList.getBoostTimeSchedule();



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

        //textAutoScheduleDateChooser = new JTextField();
        //textAutoScheduleDateChooser.setPreferredSize(new Dimension(150,25));



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
        labelAutoTimeSchedule = new JLabel("Auto Time Schedule:");
        labelAutoWeekDay = new JLabel("Select a week day:");
        labelAutoStartHour = new JLabel("Select a start hour:");
        labelAutoEndHour = new JLabel("Select end hour:");


        panel = new JPanel();
        panelA = new JPanel();
        panelB = new JPanel();
        panelC = new JPanel();
        panelD = new JPanel();

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
        panel.add(labelAutoTimeSchedule);
        panel.add(labelAutoWeekDay);
        panel.add(labelAutoStartHour);
        panel.add(labelAutoEndHour);

        //frame.add(panel, BorderLayout.CENTER);


        frame.add(panelA);
        frame.add(panelB);
        frame.add(panelC);
        frame.add(panelD);
        frame.add(panel);
        frame.setSize(1000, 300);
        frame.setLayout(new GridLayout(10, 20));
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
