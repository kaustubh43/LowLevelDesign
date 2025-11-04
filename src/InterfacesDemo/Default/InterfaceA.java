package InterfacesDemo.Default;

public interface InterfaceA {
    static final int VALUE = 10; // public, static, final by default
    default void display(){
        System.out.println("Hello from InterfaceA");
    }
}
