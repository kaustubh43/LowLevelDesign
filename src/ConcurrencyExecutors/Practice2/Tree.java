package ConcurrencyExecutors.Practice2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Tree {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool(); // Need to use a cached pool, otherwise you will encounter a deadlock.
        Node root  = new Node(1);
        root.left  = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        TreeSizeCalculator calc = new TreeSizeCalculator(root, executor);
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        Future<Integer> future = singleThreadExecutor.submit(calc);
        Integer result = future.get();
        System.out.println(result);

        executor.shutdown();
    }
}
