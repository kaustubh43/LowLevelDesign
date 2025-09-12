package DataStructuresAlgorithms.LinkedList;

import java.util.HashMap;
import java.util.Map;

/**
 * LruCache implements a Least Recently Used (LRU) cache using a doubly linked list and a hashmap.
 * The cache supports O(1) get and set operations.
 */
public class LruCache {
    /**
     * Constructs an LRU Cache with the specified capacity.
     * @param capacity The Maximum number of items the cache can hold.
     */
    public LruCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.hm = new HashMap<>();
        head = new ListNode(-1, -1); // assign to class fields
        tail = new ListNode(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    /**
     * ListNode represents a node in the doubly linked list used for the LRU cache.
     */
    public class ListNode{
        int key, value;
        ListNode next, prev;

        /**
         * Constructs a ListNode with the given key and value.
         * @param key The key for the cache entry.
         * @param value The value for the cache entry.
         */
        public ListNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    ListNode head, tail;
    int size, capacity;
    Map<Integer, ListNode> hm;

    /**
     * Retrieves the value for the given key if present in the cache, otherwise returns -1.
     * Moves the accessed node to the most recently used position.
     * @param key The key to look up.
     * @return The value associated with the key, or -1 if not found.
     */
    public int get(int key) {
        if(!hm.containsKey(key)){   // If hm does not contain key or size of cache is 0.
            return -1;
        }
        ListNode node = hm.get(key);
        moveToLast(node);
        return node.value;
    }

    /**
     * Inserts or updates the value for the given key in the cache.
     * If the cache exceeds its capacity, evicts the least recently used item.
     * @param key The key to insert or update.
     * @param value The value to associate with the key.
     */
    public void set(int key, int value) {
        if(hm.containsKey(key)){
            ListNode node = hm.get(key);
            node.value = value;
            moveToLast(node);
            return;
        }
        // Add a new node and add to last.
        ListNode node = new ListNode(key, value);
        hm.put(key, node);
        addToLast(node);
        size++;

        if(size > capacity){
            evictLRU();
        }
    }
    /**
     * Removes the specified node from the doubly linked list.
     * @param node The node to remove.
     */
    public void removeNode(ListNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    /**
     * Adds the specified node to the end (most recently used position) of the doubly linked list.
     * @param node The node to add.
     */
    public void addToLast(ListNode node) {
        tail.prev.next = node;
        node.prev = tail.prev;
        node.next = tail;
        tail.prev = node;
    }
    /**
     * Moves the specified node to the end (most recently used position) of the doubly linked list.
     * @param node The node to move.
     */
    public void moveToLast(ListNode node) {
        removeNode(node);

        addToLast(node);
    }
    /**
     * Evicts the least recently used (LRU) node from the cache.
     */
    public void evictLRU(){
        ListNode lru = head.next;
        removeNode(lru);
        hm.remove(lru.key);
        size--;
    }

    public static void main(String[] args) {

    }
}
