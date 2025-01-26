package ConcurrencyExecutors.Practice2;

import java.util.concurrent.*;

public class TreeSizeCalculator implements Callable<Integer> {
    Node root;
    ExecutorService executor;

    public TreeSizeCalculator(Node root, ExecutorService executor) {
        this.root = root;
        this.executor = executor;
    }

    @Override
    public Integer call() throws Exception {
        return calculateSize(this.root);
    }

    public Integer calculateSize(Node node) throws ExecutionException, InterruptedException {
        if(node == null) {
            return 0;
        }
        // Run futures on the left subtree and the right subtree.
        Future<Integer> leftFuture = executor.submit(() -> calculateSize(node.left));
        Future<Integer> rightFuture = executor.submit(() -> calculateSize(node.right));

        return 1 + leftFuture.get() + rightFuture.get();
    }
}
