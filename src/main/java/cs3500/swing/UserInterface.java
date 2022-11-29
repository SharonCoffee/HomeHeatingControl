package cs3500.swing;

import cs3500.operate.R14_TargetRoomTemp;
import cs3500.operate.R15_TargetWaterTemp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInterface implements ActionListener {

    JFrame frame;
    JPanel panel;
    JLabel labelTargetRoomTemp;
    JTextField textTargetRoomTemp;
    JButton upButtonTargetRoomTemp;
    JButton downButtonTargetRoomTemp;
    JLabel labelTargetWaterTemp;
    JTextField textTargetWaterTemp;
    JButton upButtonTargetWaterTemp;
    JButton downButtonTargetWaterTemp;

    JButton buttonOk;
    JButton buttonApply;
    JButton buttonCancel;


    private int targetRoomTemperature = 19;
    private int targetWaterTemperature = 60;
    //int count = 0;
    public UserInterface() {
        frame = new JFrame();
        frame.setTitle("Home Heating Control System");


        textTargetRoomTemp = new JTextField("19", 2);
        upButtonTargetRoomTemp = new JButton("+");
        downButtonTargetRoomTemp = new JButton("-");
        textTargetWaterTemp = new JTextField("55", 2);
        upButtonTargetWaterTemp = new JButton("+");
        downButtonTargetWaterTemp = new JButton("-");
        //buttonOk = new JButton("Ok");
        //buttonApply = new JButton("Apply");
        //buttonCancel = new JButton("Cancel");
        upButtonTargetRoomTemp.addActionListener(this);
        downButtonTargetRoomTemp.addActionListener(this);
        upButtonTargetWaterTemp.addActionListener(this);
        downButtonTargetWaterTemp.addActionListener(this);
        //buttonOk.addActionListener(this);
        //buttonApply.addActionListener(this);
        //buttonCancel.addActionListener(this);
        //JLabel label = new JLabel("");

        labelTargetRoomTemp = new JLabel("Target Room Temperature:");
        labelTargetWaterTemp = new JLabel("Target Water Temperature:");

        panel = new JPanel();
        //panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 300, 300));
        panel.setPreferredSize(new Dimension(500, 300));
        panel.setLayout(new FlowLayout());

        //panel.setLayout(new GridLayout(10,7));
        //panel.add(buttonOk);
        //panel.add(label);
        //panel.add(buttonApply);
        //panel.add(buttonCancel);
        panel.add(labelTargetRoomTemp);
        panel.add(textTargetRoomTemp);
        panel.add(upButtonTargetRoomTemp);
        panel.add(downButtonTargetRoomTemp);
        panel.add(labelTargetWaterTemp);
        panel.add(textTargetWaterTemp);
        panel.add(upButtonTargetWaterTemp);
        panel.add(downButtonTargetWaterTemp);


        //frame.add(panel, BorderLayout.CENTER);
        frame.add(panel);
        frame.setSize(500, 300);
        frame.setLayout(new GridLayout(2, 6));
        frame.pack();
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
                //set the text in the textField to the target temperature
                textTargetRoomTemp.setText("" + targetRoomTemperature);
                //show a dialog box with the target temperature
                JOptionPane.showMessageDialog(frame, "Target Room Temperature: " + targetRoomTemperature);
            } else {
                JOptionPane.showMessageDialog(frame, "Target Room Temperature cannot be decreased below 18 degrees Celsius.");
            }
        }
        if(event.getSource() == upButtonTargetWaterTemp) {
            //increase the target temperature by 1
            if (targetWaterTemperature < R15_TargetWaterTemp.getcMaxWaterTemp()) {
                targetWaterTemperature++;
                textTargetWaterTemp.setText("" + targetWaterTemperature);
                JOptionPane.showMessageDialog(frame, "Target Water Temperature: " + targetWaterTemperature);
            } else {
                JOptionPane.showMessageDialog(frame, "Target Water Temperature cannot be increased above 80 degrees Celsius.");
            }
        }
        if(event.getSource() == downButtonTargetWaterTemp) {
            //decrease the target temperature by 1
            if (targetWaterTemperature > R15_TargetWaterTemp.getcMinWaterTemp()) {
                targetWaterTemperature--;
                //set the text in the textField to the target temperature
                textTargetWaterTemp.setText("" + targetWaterTemperature);
                //show a dialog box with the target temperature
                JOptionPane.showMessageDialog(frame, "Target Water Temperature: " + targetWaterTemperature);
            } else {
                JOptionPane.showMessageDialog(frame, "Target Water Temperature cannot be decreased below 55 degrees Celsius.");
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
