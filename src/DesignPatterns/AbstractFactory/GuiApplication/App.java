package DesignPatterns.AbstractFactory.GuiApplication;

import DesignPatterns.AbstractFactory.GuiApplication.Buttons.Button;
import DesignPatterns.AbstractFactory.GuiApplication.CheckBoxes.CheckBox;
import DesignPatterns.AbstractFactory.GuiApplication.Factories.GuiFactory;

public class App {
    public static void main(String[] args) {
        GuiFactory gui = AppConfigurator.createGuiFactory("MAC");

        Button button = gui.createButton();
        CheckBox checkBox = gui.createCheckBox();
        button.paint();
        checkBox.paint();

        button.click();
        checkBox.check();
        checkBox.uncheck();
    }
}
