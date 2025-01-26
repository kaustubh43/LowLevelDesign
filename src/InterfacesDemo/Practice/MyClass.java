package InterfacesDemo.Practice;

public class MyClass implements MyIF{
    public int number;

    @Override
    public int getNumber() {
        return this.number;
    }

    @Override
    public void setNumber(int number) {
        this.number = number;
    }
}
