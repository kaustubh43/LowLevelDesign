package DesignPatterns.Singleton;

public class Client {
    public static void main(String[] args) {

        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();
        System.out.println("Lazy loading");

        LoggerEagerLoading l3 = LoggerEagerLoading.getInstance();
        LoggerEagerLoading l4 = LoggerEagerLoading.getInstance();
        System.out.println("Eager loading");
    }
}
