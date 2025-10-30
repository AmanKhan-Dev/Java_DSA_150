package Srtiver_SDE;

import java.util.ArrayList;
import java.util.List;

public class InOrderTree {
    public static void main(String[] args) {
          TreeNode root = new TreeNode(4,
        new TreeNode(2, new TreeNode(1), new TreeNode(3)),
        new TreeNode(7, new TreeNode(6), new TreeNode(9))
        );

        System.out.println(inorderTraversal(root));
        
    }

    public static List<Integer> inorderTraversal(TreeNode root) {

        List <Integer> nList = new ArrayList<>();
        inorderHelper(root,nList);
        return nList;
        
    }

    public static void inorderHelper(TreeNode root,List<Integer> list){

        if (root==null) {
            return;
        }

        inorderHelper(root.left, list);
        list.add(root.val);
        inorderHelper(root.right, list);

    }
    
}
