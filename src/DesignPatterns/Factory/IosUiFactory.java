package DesignPatterns.Factory;

import java.awt.*;

public class IosUiFactory implements UiFactory {
    @Override
    public Button createButton() {
        // Create ios specific stuff
        return null;
    }

    @Override
    public Menu createMenu() {
        // Create ios specific stuff.
        return null;
    }

    @Override
    public Scrollbar createScrollBar() {
        // create ios specific stuff.
        return null;
    }
}
