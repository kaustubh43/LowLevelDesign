package InterfacesDemo.Practice;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        System.out.println(myClass.getNumber());
        myClass.setNumberDefault();
        System.out.println(myClass.getNumber());
        MyIF.sayHello();
    }
}
