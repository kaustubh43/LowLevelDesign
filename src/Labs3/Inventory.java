package Labs3;

import java.util.ArrayList;
import java.util.HashMap;

public class Inventory<T extends Item> {
    private HashMap<String, T> inventory;

    public Inventory() {
        inventory = new HashMap<>();
    }

    public void addItem(T item) {
        inventory.put(item.getId(), item);
    }

    public T removeItem(String id) {
        return inventory.remove(id);
    }

    public T getItem(String id){
        return inventory.getOrDefault(id, null);
    }

    public ArrayList<T> getAllItems(){
        return new ArrayList<>(inventory.values());
    }
}
