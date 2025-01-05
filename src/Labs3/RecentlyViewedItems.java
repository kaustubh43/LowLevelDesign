package Labs3;

import java.util.HashMap;
import java.util.LinkedList;

public class RecentlyViewedItems {
    private static int MAX_SIZE = 3;
    LinkedList<Item> recentlyViewed;

    public RecentlyViewedItems() {
        recentlyViewed = new LinkedList<>();
    }

    // Improve time complexity of this function
    public void addRecentlyViewed(Item item) {
        recentlyViewed.remove(item);
        recentlyViewed.addFirst(item);
        if (recentlyViewed.size() > MAX_SIZE) {
            recentlyViewed.removeLast();
        }
    }

    public LinkedList<Item> getRecentlyViewed() {
        return recentlyViewed;
    }
}
