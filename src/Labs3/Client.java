package Labs3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<Item>();
        items.add(new Book("Harry Potter", 99.9d, 1, "JK Rowling"));
        items.add(new Electronic("Heaphones XM4s", 26000.5d, 1, 2));
        items.add(new Clothing("Zara trousers", 12000.5d, 1, "M"));
        items.add(new Clothing("West Side", 1500.0d, 3, "L"));

        Collections.sort(items);
        int itemNumber = 1;
        for(Item item : items){
            System.out.println("item number::" + itemNumber++ + " " + item.getName());
        }
    }
}
