package InterfacesDemo;

public class Client implements interface2, interface1{

    @Override
    public void doSomething2() {
        System.out.println("doSomething2");
    }

    @Override
    public void doSomething1() {
        System.out.println("doSomething1");
    }

    public static void main(String[] args) {
        Client c = new Client();
        c.doSomething1();
        c.doSomething2();
    }
}
