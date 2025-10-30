package Srtiver_SDE;

import java.util.ArrayList;
import java.util.List;

public class TwoSumTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5,
            new TreeNode(3, new TreeNode(2), new TreeNode(6)),
            new TreeNode(4, new TreeNode(7), new TreeNode(9))
        );
        System.out.println(findTarget(root, 9));
    }

    public static boolean findTarget(TreeNode root, int k) {
        List<Integer> nList = new ArrayList<>();
        inorderHelper(root, nList);

        int i = 0;
        int j = nList.size() - 1;

        while (i < j) {
            int sum = nList.get(i) + nList.get(j);

            if (sum == k)
                return true;
            else if (sum > k)
                j--;
            else
                i++;
        }

        return false;
    }

    public static void inorderHelper(TreeNode root, List<Integer> list) {
        if (root == null) return;
        inorderHelper(root.left, list);
        list.add(root.val);
        inorderHelper(root.right, list);
    }
}
