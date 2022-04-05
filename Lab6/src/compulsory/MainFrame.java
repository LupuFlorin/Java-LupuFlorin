package compulsory;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    ConfigPanel configPanel;
    ControlPanel controlPanel;
    DrawingPanel canvas;

    public MainFrame() {
        super("My game");
        init();
    }

    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        configPanel = new ConfigPanel(this);
        controlPanel = new ControlPanel(this);
        canvas = new DrawingPanel(this);
        add(controlPanel, BorderLayout.PAGE_END);
        add(configPanel,BorderLayout.PAGE_START);
        add(canvas, BorderLayout.CENTER);

        pack();
    }
    public static void main(String[] args) {
        JFrame MainFrame=new MainFrame();
         MainFrame.setVisible(true);

    }
}