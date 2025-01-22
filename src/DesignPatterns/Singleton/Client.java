package DesignPatterns.Singleton;

public class Client {
    public static void main(String[] args) {

        LazyLoading l1 = LazyLoading.getInstance();
        LazyLoading l2 = LazyLoading.getInstance();
        System.out.println("Lazy loading");

        LoggerEagerLoading l3 = LoggerEagerLoading.getInstance();
        LoggerEagerLoading l4 = LoggerEagerLoading.getInstance();
        System.out.println("Eager loading");
    }
}
