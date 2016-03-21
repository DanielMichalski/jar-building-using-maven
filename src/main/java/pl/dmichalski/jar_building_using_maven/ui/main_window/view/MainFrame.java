package pl.dmichalski.jar_building_using_maven.ui.main_window.view;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;

    private MainFramePanel mainFramePanel;

    public MainFrame() {
        setFrameUp();
        initComponents();
    }

    private void setFrameUp() {
        setSize(new Dimension(WIDTH, HEIGHT));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        mainFramePanel = new MainFramePanel();
        add(mainFramePanel);
    }

    public MainFramePanel getMainFramePanel() {
        return mainFramePanel;
    }
}
