package DesignPatterns.Factory;

public class AndroidFlutter extends Flutter {

    @Override
    public UiFactory createUiFactory() {
        return new AndroidUiFactory();
    }
}
