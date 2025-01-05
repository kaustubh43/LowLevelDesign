package Labs3;

public class Clothing extends Item {
    private String size;
    public Clothing(String name, double price, int quantity, String size) {
        super(name, price, quantity);
        this.size = size;
    }

    public Clothing(Clothing other) {
        super(other);
        this.size = other.size;
    }
}
