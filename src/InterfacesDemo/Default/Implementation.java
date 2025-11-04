package InterfacesDemo.Default;

public class Implementation implements InterfaceA, InterfaceB {
    // Overriding the display method to resolve the conflict
    @Override
    public void display() {
        // Calling display method from InterfaceA
        InterfaceA.super.display();
        // Calling display method from InterfaceB
        InterfaceB.super.display();
        // Custom implementation
        System.out.println("Hello from Implementation class");
    }

    public static void main(String[] args) {
        Implementation impl = new Implementation();
        impl.display();
    }
}
