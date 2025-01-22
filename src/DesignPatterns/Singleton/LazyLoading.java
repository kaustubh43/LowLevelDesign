package DesignPatterns.Singleton;

public class LazyLoading {
    private static LazyLoading instance = null;

    private LazyLoading() {}

    // Object is created only when it is required.
    // This is "Lazy Loading".
    public static LazyLoading getInstance(){
        if(instance ==null) {
            instance = new LazyLoading();
        }
        return instance;
    }
}
