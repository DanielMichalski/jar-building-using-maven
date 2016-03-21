package pl.dmichalski.jar_building_using_maven.ui.main_window.view;

import javax.swing.*;

public class MainFramePanel extends JPanel {

    private JButton showDialogWindowBtn;

    MainFramePanel() {
        initComponents();
    }

    private void initComponents() {
        showDialogWindowBtn = new JButton("Show dialog window");
        add(showDialogWindowBtn);
    }

    public JButton getShowDialogWindowBtn() {
        return showDialogWindowBtn;
    }
}
