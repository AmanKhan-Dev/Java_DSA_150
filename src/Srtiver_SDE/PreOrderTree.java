package Srtiver_SDE;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTree {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(4,
        new TreeNode(2, new TreeNode(1), new TreeNode(3)),
        new TreeNode(7, new TreeNode(6), new TreeNode(9))
        );

        System.out.println(preorderTraversal(root));
        
    }

      public static List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> nList = new ArrayList<>();
    preorderHelper(root, nList);
    return nList;
}

private static void preorderHelper(TreeNode root, List<Integer> list) {
    if (root == null) return;

              // Visit root
    preorderHelper(root.left, list);  // Visit left
    preorderHelper(root.right, list); // Visit right
    list.add(root.val);
}

}