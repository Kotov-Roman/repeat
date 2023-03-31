package leetcode.algorithms.trees;

import leetcode.helpers.TreeNode;

//https://leetcode.com/problems/balanced-binary-tree/
public class BalancedBinaryTree {
    boolean isBalanced = true;

    public boolean isBalanced(TreeNode root) {
        computeDepth(root);
        return isBalanced;
    }

    public int computeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = computeDepth(root.left);
        int rightDepth = computeDepth(root.right);
        if (Math.abs(leftDepth - rightDepth) > 1) {
            isBalanced = false;
        }

        return Math.max(leftDepth, rightDepth) + 1;
    }
}
