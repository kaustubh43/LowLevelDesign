package DesignPatterns.Singleton;

public class Logger {
    private static Logger instance = null;

    private Logger() {}

    // Object is created only when it is required.
    // This is "Lazy Loading".
    public static Logger getInstance(){
        if(instance ==null) {
            instance = new Logger();
        }
        return instance;
    }
}
