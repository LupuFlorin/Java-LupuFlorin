package compulsory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class ControlPanel extends JPanel {
    final MainFrame frame;
    JButton saveBtn = new JButton("Save");
    JButton loadBtn = new JButton("Load");
    JButton resetBtn = new JButton("Reset");
    JButton exitBtn = new JButton("Exit");

    public ControlPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }


    public void init() {
        setLayout(new GridLayout(1, 4));
        add(saveBtn);
        add(loadBtn);
        add(resetBtn);
        add(exitBtn);

        exitBtn.addActionListener(this::exit);
    }

    private void exit(ActionEvent e) {
        frame.dispose();

    }
}