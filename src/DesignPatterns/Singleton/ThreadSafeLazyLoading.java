package DesignPatterns.Singleton;

public class ThreadSafeLazyLoading {
    private static ThreadSafeLazyLoading instance;

    private ThreadSafeLazyLoading() {}

    public static ThreadSafeLazyLoading getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeLazyLoading.class) {     // First check
                if (instance == null) {                     // Double check locking: DCL.
                    instance = new ThreadSafeLazyLoading();
                }
            }
        }
        // 99% of the calls are fast and multiple
        // threads can process without getting a lock.
        return instance;
    }
}
