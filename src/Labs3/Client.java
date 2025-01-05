package Labs3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<Item>();
        items.add(new Book("B1", "Harry Potter", 99.9d, 1, "JK Rowling"));
        items.add(new Electronic("E1", "Sony XM4s", 26000.5d, 1, 2));
        items.add(new Clothing("C1", "Zara trousers", 12000.5d, 1, "M"));
        items.add(new Clothing("C2", "West Side", 1500.0d, 3, "L"));

//        Collections.sort(items);
//        int itemNumber = 1;
//        for(Item item : items){
//            System.out.println("item number::" + itemNumber++ + " " + item.getName());
//        }

        Inventory<Item> genericInventory = new Inventory<>();
        genericInventory.addItem(items.get(0));
        genericInventory.addItem(items.get(1));
        genericInventory.addItem(items.get(2));
        genericInventory.addItem(items.get(3));

        Item query = genericInventory.getItem("51");
        if(query != null) {
            System.out.printf("Name::%s price: %s", query.getName(), query.getPrice());
        }
        else
            System.out.println("No item found");

        Item removedItem = genericInventory.removeItem("E1");
        System.out.println("Removed item name is " + removedItem.getName());

        ArrayList<Item> allItems = genericInventory.getAllItems();
        for(Item item : allItems) {
            System.out.printf("Name::%s price: %s \n", item.getName(), item.getPrice());
        }

        // Making a book inventory.
        Inventory<Book> bookInventory = new Inventory<>();
        bookInventory.addItem(new Book("B1", "Harry Potter", 99.9d, 1, "JK Rowling"));
        bookInventory.addItem(new Book("B2", "Harry Potter: Goblet of Fire", 100.9d, 2, "JK Rowling"));

        System.out.println("Recently viewed items");
        RecentlyViewedItems recentlyViewedItems = new RecentlyViewedItems();
        recentlyViewedItems.addRecentlyViewed(items.get(0));
        recentlyViewedItems.addRecentlyViewed(items.get(1));
        recentlyViewedItems.addRecentlyViewed(items.get(2));
        recentlyViewedItems.addRecentlyViewed(items.get(3));
        recentlyViewedItems.addRecentlyViewed(items.get(0));

        for(Item item : recentlyViewedItems.getRecentlyViewed()) {
            System.out.printf("Name::%s price: %s \n", item.getName(), item.getPrice());
        }
    }
}
