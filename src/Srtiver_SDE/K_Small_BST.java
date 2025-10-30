package Srtiver_SDE;

import java.util.ArrayList;
import java.util.List;

public class K_Small_BST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4,
        new TreeNode(2, new TreeNode(1), new TreeNode(3)),
        new TreeNode(7, new TreeNode(6), new TreeNode(9))
        );


        System.out.println(kthSmallest(root,5));
        
    }

     public static int kthSmallest(TreeNode root, int k) {
        List<Integer> nList = new ArrayList<>();
        inorderHelper(root, nList);

        int result = nList.get(k-1);
        return result;

        
    }
      public static void inorderHelper(TreeNode root, List<Integer> list) {
        if (root == null) return;
        inorderHelper(root.left, list);
        list.add(root.val);
        inorderHelper(root.right, list);
    }
    
}
