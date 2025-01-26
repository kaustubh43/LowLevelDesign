package InterfacesDemo.Practice;

public interface MyIF {

    int getNumber();

    void setNumber(int number);

    default void setNumberDefault(){
        setNumber(999);
    }

    static void sayHello(){
        System.out.println("Hello World");
    }
}
