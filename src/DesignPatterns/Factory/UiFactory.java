package DesignPatterns.Factory;

import java.awt.*;

public interface UiFactory {
    public Button createButton();
    public Menu createMenu();
    public Scrollbar createScrollBar();
}
