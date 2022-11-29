package cs3500.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInterface implements ActionListener {

    //int count = 0;
    public UserInterface() {
        JFrame frame = new JFrame();
        JButton buttonOk = new JButton("Ok");
        JButton buttonApply = new JButton("Apply");
        JButton buttonCancel = new JButton("Cancel");
        buttonOk.addActionListener((this));
        buttonApply.addActionListener((this));
        buttonCancel.addActionListener((this));
        //JLabel label = new JLabel("");


        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
        panel.setLayout(new GridLayout(3,3));
        panel.add(buttonOk);
        //panel.add(label);
        panel.add(buttonApply);
        panel.add(buttonCancel);


        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Home Heating Control System");
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        //count++;
        //label.setText("Number of clicks: " + count);

    }
}
