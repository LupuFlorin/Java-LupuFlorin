package compulsory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ConfigPanel extends JPanel {
    final MainFrame frame;
    DrawingPanel canvas;
    JSpinner sizeField1;
    JSpinner sizeField2;
    JLabel sizeLabel;
    JButton createBtn= new JButton("Create");

    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        sizeLabel = new JLabel("Grid size:");
        sizeField1 = new JSpinner(new SpinnerNumberModel(10, 2, 100, 1));
        sizeField1.setValue(10);
        sizeField2 = new JSpinner(new SpinnerNumberModel(10, 2, 100, 1));
        sizeField2.setValue(10);

        add(sizeLabel);
        add(sizeField1);
        add(sizeField2);
        add(createBtn);
        createBtn.addActionListener(this::create);
    }

    public void create(ActionEvent e){
        frame.remove(frame.canvas);
        canvas = new DrawingPanel(frame);
        canvas.init();
        frame.add(canvas, BorderLayout.CENTER);
        frame.pack();
    }

}