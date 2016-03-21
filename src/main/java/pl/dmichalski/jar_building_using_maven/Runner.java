package pl.dmichalski.jar_building_using_maven;


import pl.dmichalski.jar_building_using_maven.ui.main_window.controller.MainFrameController;

public class Runner {

    public static void main(String[] args) {
        MainFrameController mainFrameController = new MainFrameController();
        mainFrameController.showMainFrameWindow();
    }

}

