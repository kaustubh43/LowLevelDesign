package DesignPatterns.Singleton;

public class Logger {
    static Logger obj = null;

    private Logger() {}

    static Logger getInstance(){
        if(obj==null) {
            obj = new Logger();
        }
        return obj;
    }
}
