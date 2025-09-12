package DesignPatterns.AbstractFactory.GuiApplication.Buttons;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Create Mac Button");
    }

    @Override
    public void click() {
        System.out.println("Click MacButton");
    }
}
