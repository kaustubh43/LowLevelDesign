package InterfacesDemo.Default;

public interface InterfaceB {
    default void display() {
        System.out.println("Hello from InterfaceB");
    }
}
