package DesignPatterns.Factory;

import java.awt.*;

public class AndroidUiFactory implements UiFactory {


    @Override
    public Button createButton() {
        return new Button();
    }

    @Override
    public Menu createMenu() {
//        return new AndroidMenu;
        return null;
    }

    @Override
    public Scrollbar createScrollBar() {
        return new Scrollbar();
    }
}
