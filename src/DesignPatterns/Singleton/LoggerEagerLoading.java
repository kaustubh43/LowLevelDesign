package DesignPatterns.Singleton;

public class LoggerEagerLoading {
    static LoggerEagerLoading instance = new LoggerEagerLoading();
    // instance will be created when the app is loaded.
    // this is a problem because.
    // Cons of eager loading
    // 1. App start time will increase.
    // 2. Object might never be used.

    private LoggerEagerLoading() {}

    public static LoggerEagerLoading getInstance() {
        return instance;
    }
}
