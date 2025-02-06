package DesignPatterns.Observer;

public class AnalyticsOrderSubscriber implements Subscriber {

    @Override
    public void onOrderPlace(OrderDetails order) {
        System.out.println("Called AnalyticsOrderSubscriber service onOrderPlace by orderId:: " + order.orderID);
    }
}
