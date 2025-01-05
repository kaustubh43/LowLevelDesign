package Labs3;

public abstract class Item {
    private String id;
    private String name;
    private double price;
    private int quantity;
    private static int total_ids = 0;

    // Parameterised constructor
    public Item(String name, double price, int quantity) {
        this.id = generateId();
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Copy constructor.
    public Item(Item other){
        this.id = generateId();
        this.name = other.name;
        this.price = other.price;
        this.quantity = other.quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static int getTotal_ids() {
        return total_ids;
    }

    public static void setTotal_ids(int total_ids) {
        Item.total_ids = total_ids;
    }

    public String generateId() {
        total_ids++;
        return "item-" + total_ids;
    }
}
