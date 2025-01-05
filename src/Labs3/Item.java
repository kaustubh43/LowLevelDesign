package Labs3;

public abstract class Item implements Comparable<Item> {
    private String id;
    private String name;
    private double price;
    private int quantity;
    private static int total_ids = 0;

    // Parameterised constructor
    public Item(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Copy constructor.
    public Item(Item other){
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

    // In this method, two objects will be compared.
    // first object is going to call this function
    // second object is passed as an argument.
    @Override
    public int compareTo(Item other) {
        // first object: this
        // second object: other
        // first object to appear first: return -1 (-ve)
        // second object to appear first: return +ve
        if(other == null)
            throw new NullPointerException("Cannot compare null object");
        return this.getName().compareToIgnoreCase(other.getName());
    }
}
