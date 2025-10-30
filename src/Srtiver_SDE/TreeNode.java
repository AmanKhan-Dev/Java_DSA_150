package Srtiver_SDE;

import java.util.*;

/**
 * Definition for a binary tree node.
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    // Default constructor
    public TreeNode() {}

    // Constructor with value
    public TreeNode(int val) {
        this.val = val;
    }

    // Constructor with value and child nodes
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    /**
     * Prints the tree in a list (level-order) form.
     * Example: [4, 2, 7, 1, 3, 6, 9]
     */
    public void printAsList() {
        List<Integer> list = toList();
        System.out.println(list);
    }

    /**
     * Returns the tree as a list (level-order traversal).
     */
    public List<Integer> toList() {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(this); // start from current node

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if (current == null) {
                // Optional: include nulls if you want a complete representation
                // result.add(null);
                continue;
            }

            result.add(current.val);
            if (current.left != null || current.right != null) {
                queue.add(current.left);
                queue.add(current.right);
            }
        }

        return result;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + (left != null ? left.val : "null") +
                ", right=" + (right != null ? right.val : "null") +
                '}';
    }
}
