package DataStructuresAlgorithms.Trees.BST;

import java.util.*;

public class ZigZagLevelOrder {
    // Return type is 2D array.
    /**
     [
     [3],  no reverse
     [9, 20], reverse
     [15, 7] no reverse
     ]
     */
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();

        // Do a level order traversal
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        // Start traversal.
        q.add(root);
        q.add(null);

        // Start processing.
        while(!q.isEmpty()) {
            TreeNode popped = q.poll();
            if(popped == null) { // End of level.
                result.add(new ArrayList<>(curr));
                curr.clear();
                if(!q.isEmpty()) { // Elements left to be processed.
                    q.add(null);
                }
            } else { // Processing Level
                curr.add(popped.val);
                if(popped.left != null) q.add(popped.left);
                if(popped.right != null) q.add(popped.right);
            }
        }
        // Flip every alternate list
        boolean shouldFlip = false;
        for(List<Integer> level: result) {
            if(shouldFlip) {
                Collections.reverse(level);
            }
            shouldFlip = !shouldFlip;
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        List<List<Integer>> result = zigzagLevelOrder(root);
        for(List<Integer> level: result) {
            System.out.println(Arrays.toString(level.toArray()));
        }
    }
}