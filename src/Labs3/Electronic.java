package Labs3;

public class Electronic extends Item {
    private int warranty;

    public Electronic(String name, double price, int quantity, int warranty) {
        super(name, price, quantity);
        this.warranty = warranty;
    }

    public Electronic(Electronic other) {
        super(other);
        this.warranty = other.warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }
}