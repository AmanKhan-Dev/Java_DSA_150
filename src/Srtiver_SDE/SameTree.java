package Srtiver_SDE;

import java.util.ArrayList;

public class SameTree {
    public static void main(String[] args) {
    }


   public static boolean isSameTree(TreeNode p, TreeNode q) {
        // Base cases
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;

        // Recursive check for left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    
}
