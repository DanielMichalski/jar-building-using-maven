package pl.dmichalski.jar_building_using_maven.ui.main_window.controller;

import pl.dmichalski.jar_building_using_maven.ui.main_window.view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrameController {

    private MainFrame mainFrame;

    public MainFrameController() {
        this.mainFrame = new MainFrame();
        initListeners();
    }

    public void showMainFrameWindow() {
        mainFrame.setVisible(true);
    }

    private void initListeners() {
        JButton showDialogWindowBtn = mainFrame.getMainFramePanel().getShowDialogWindowBtn();
        showDialogWindowBtn.addActionListener(new ShowDialogWindowBtnListener());
    }

    private class ShowDialogWindowBtnListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Hello!");
        }
    }
}
