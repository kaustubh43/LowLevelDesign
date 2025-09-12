package DesignPatterns.AbstractFactory.GuiApplication.CheckBoxes;

public class MacCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Create MacCheckBox");
    }

    @Override
    public void check() {
        System.out.println("Check MacCheckBox");
    }

    @Override
    public void uncheck() {
        System.out.println("Uncheck MacCheckBox");
    }
}
