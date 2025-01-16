package InterfacesDemo;

public class Car implements Comparable<Car>{
    public int price;
    public int speed;

    @Override
    public int compareTo(Car o) {
        return Integer.compare(this.price, o.price);
    }
}
