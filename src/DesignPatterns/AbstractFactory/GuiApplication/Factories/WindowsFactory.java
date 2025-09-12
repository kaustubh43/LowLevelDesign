package DesignPatterns.AbstractFactory.GuiApplication.Factories;

import DesignPatterns.AbstractFactory.GuiApplication.Buttons.Button;
import DesignPatterns.AbstractFactory.GuiApplication.Buttons.WindowsButton;
import DesignPatterns.AbstractFactory.GuiApplication.CheckBoxes.CheckBox;
import DesignPatterns.AbstractFactory.GuiApplication.CheckBoxes.WindowsCheckBox;

/**
 *  WindowsFactory is a "concrete factory" which creates windows-specific Gui Elements.
 *  Implement GuiFactory interface to provide WindowsButton and WindowsCheckBox objects.
 */
public class WindowsFactory implements GuiFactory{
    /**
     * Create a Windows-specific button
     * @return WindowsButton
     */
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    /**
     * Create a Windows-specific check box
     * @return WindowsCheckBox
     */
    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
