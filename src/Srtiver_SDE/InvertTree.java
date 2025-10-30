package Srtiver_SDE;



public class InvertTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4,
        new TreeNode(2, new TreeNode(1), new TreeNode(3)),
        new TreeNode(7, new TreeNode(6), new TreeNode(9))
);

root.printAsList();

  // Invert the tree
        InvertTree it = new InvertTree();
        TreeNode invertedRoot = it.invertTree(root);

        System.out.print("Inverted Tree: ");
        invertedRoot.printAsList();



        
        
    }
    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return root;
        }

      TreeNode left = invertTree(root.left);
      TreeNode right = invertTree(root.right);

      root.right = left;
      root.left= right;

      return root;




        
        
    }
    
}

// Definition for a binary tree node
 