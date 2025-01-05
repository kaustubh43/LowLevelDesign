package Labs3;

import java.io.Serializable;

public class Electronic extends Item{
    private int warranty;

    public Electronic(String id, String name, double price, int quantity, int warranty) {
        super(id, name, price, quantity);
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
