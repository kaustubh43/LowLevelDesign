package DesignPatterns.Observer;

import java.util.Observer;

public class InventoryOrderSubscriber implements Subscriber {
    @Override
    public void onOrderPlace(OrderDetails order) {
        System.out.println("Updated inventory order called onOrderPlace by order id:: " + order.orderID);
    }
}
