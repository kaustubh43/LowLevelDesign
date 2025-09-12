package DesignPatterns.AbstractFactory.GuiApplication.Factories;

import DesignPatterns.AbstractFactory.GuiApplication.Buttons.Button;
import DesignPatterns.AbstractFactory.GuiApplication.CheckBoxes.CheckBox;

/**
 * Abstract Factory: Knows about all abstract product (Gui Elements) types.
 */
public interface GuiFactory {
    public Button createButton();

    public CheckBox createCheckBox();
}
