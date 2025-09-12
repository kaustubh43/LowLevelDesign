package DesignPatterns.AbstractFactory.GuiApplication.Factories;

import DesignPatterns.AbstractFactory.GuiApplication.Buttons.Button;
import DesignPatterns.AbstractFactory.GuiApplication.Buttons.MacButton;
import DesignPatterns.AbstractFactory.GuiApplication.CheckBoxes.CheckBox;
import DesignPatterns.AbstractFactory.GuiApplication.CheckBoxes.MacCheckBox;

/**
 * MacFactory is a "concrete factory" that creates Mac-specific UI components.
 * Implements the GuiFactory interface to provide MacButton and MacCheckBox objects.
 */
public class MacFactory implements GuiFactory{
    /**
     * Creates a Mac-specific button.
     * @return a new instance of MacButton
     */
    @Override
    public Button createButton() {
        return new MacButton();
    }

    /**
     * Creates a Mac-specific checkbox.
     * @return a new instance of MacCheckBox
     */
    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
