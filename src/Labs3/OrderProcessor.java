package Labs3;

import java.util.Comparator;
import java.util.PriorityQueue;

public class OrderProcessor {
    PriorityQueue<Order> pq;

    public OrderProcessor(){
        pq = new PriorityQueue<>();
    }

    public void addOrder(Order order){
        pq.add(order);
    }

    public void setComparator(Comparator<Order> c){
        pq = new PriorityQueue<>(c);
    }

    public Order processOrder(){
        return pq.poll();
    }
}
