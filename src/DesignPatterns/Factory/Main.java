package DesignPatterns.Factory;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Flutter flutter = new AndroidFlutter();
        flutter.setTheme("Dark");

        UiFactory uiFactory = flutter.createUiFactory();        // No need to mention AndroidUiFactory since it is abstracted.
        Button button = uiFactory.createButton();               // Creates a button for android, without mentioning its platform.

        Flutter ios = new IosFlutter();
        ios.setTheme("Light");
        UiFactory uiIosFactory = ios.createUiFactory();         // No ios specific stuff here
        Button iosButton = uiIosFactory.createButton();         // Creates a button as per apple standards.
    }
}
