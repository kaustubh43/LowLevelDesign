package DataStructuresAlgorithms.Trees.BST;

import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        int count = 0;

        while(curr != null || !st.isEmpty()) {
            if(curr != null) {
                // New subtree, at root.
                st.push(curr);
                curr = curr.left;
            } else {
                // Already processed.
                curr = st.pop();
                // Work
                count++;
                if(count == k) break; // Kth smallest element.
                // Traverse right
                curr = curr.right;
                if(curr != null) st.push(curr);
            }
        }
        return curr.val;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);

        int answer = kthSmallest(root, 3);
        System.out.println(answer);
    }
}