package DesignPatterns.AbstractFactory.GuiApplication.CheckBoxes;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Create Windows CheckBox");
    }

    @Override
    public void check() {
        System.out.println("Check Windows CheckBox");
    }

    @Override
    public void uncheck() {
        System.out.println("Uncheck Windows CheckBox");
    }
}
