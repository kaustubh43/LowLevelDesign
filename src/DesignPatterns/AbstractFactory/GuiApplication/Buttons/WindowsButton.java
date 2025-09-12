package DesignPatterns.AbstractFactory.GuiApplication.Buttons;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Create Windows Button");
    }

    @Override
    public void click() {
        System.out.println("Click Windows Button");
    }
}
