package CollectionsFramework;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionsLinkedLists {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(1);
        q.poll();
        q.add(2);
        q.remove();


        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(1);
        ll.addLast(2);
        ll.removeFirst();

        System.out.println("LinkedList contents:");
        for(Integer i : ll) {
            System.out.println(i);
        }
    }
}
