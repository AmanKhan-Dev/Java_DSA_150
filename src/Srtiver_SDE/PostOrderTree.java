package Srtiver_SDE;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTree {
    public static void main(String[] args) {
         TreeNode root = new TreeNode(4,
        new TreeNode(2, new TreeNode(1), new TreeNode(3)),
        new TreeNode(7, new TreeNode(6), new TreeNode(9))
        );

        System.out.println(postorderTraversal(root));
          
    }

     public static List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> nList = new ArrayList<>();
    postorderHelper(root, nList);
    return nList;
}

private static void postorderHelper(TreeNode root, List<Integer> list) {
    if (root == null) return;

              // Visit root
    postorderHelper(root.left, list);  // Visit left
    postorderHelper(root.right, list); // Visit right
    list.add(root.val);
}

    
}
