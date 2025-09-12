package DesignPatterns.AbstractFactory.GuiApplication;

import DesignPatterns.AbstractFactory.GuiApplication.Factories.GuiFactory;
import DesignPatterns.AbstractFactory.GuiApplication.Factories.MacFactory;
import DesignPatterns.AbstractFactory.GuiApplication.Factories.WindowsFactory;

/**
 * Configurator class that returns GuiFactory objects based on the type
 * This configurator will be modified when new operating systems arrer added.
 */
public class AppConfigurator {
    public static GuiFactory createGuiFactory(String type) {
        return switch(type.toLowerCase()) {
            case "windows" -> new WindowsFactory();
            case "mac" -> new MacFactory();
            default -> throw new IllegalArgumentException("Unknown GUI type: " + type);
        };
    }
}
