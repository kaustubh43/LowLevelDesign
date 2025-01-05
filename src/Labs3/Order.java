package Labs3;

public class Order implements Comparable<Order>{
    private int orderID;
    private boolean isExpress;
    private double totalAmount;

    public Order(int orderID, boolean isExpress, double totalAmount) {
        this.orderID = orderID;
        this.isExpress = isExpress;
        this.totalAmount = totalAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    @Override
    public int compareTo(Order other) {
        // this vs other
        if(this.isExpress == other.isExpress){
            return Integer.compare(this.orderID, other.orderID);
        }
        else if(this.isExpress){
            return -1;  // Process "this" first, hence return -ve.
        }
        else {
            return 1;   // Process "other" first, hence return +ve.
        }
    }
}
