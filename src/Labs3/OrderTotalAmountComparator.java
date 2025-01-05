package Labs3;

import java.util.Comparator;

public class OrderTotalAmountComparator implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {
        return Double.compare(o2.getTotalAmount(), o1.getTotalAmount());
//        Other way of writing.
//        if(o1.getTotalAmount() > o2.getTotalAmount())
//            return 1;
//        else
//            return -1;
    }
}
