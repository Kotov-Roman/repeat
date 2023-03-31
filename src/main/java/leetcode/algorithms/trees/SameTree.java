package leetcode.algorithms.trees;

import leetcode.helpers.TreeNode;

//https://leetcode.com/problems/same-tree/
public class SameTree {
    public static void main(String[] args) {
        TreeNode leaf11 = new TreeNode(15);
        TreeNode leaf12 = new TreeNode(5);
        TreeNode root1 = new TreeNode(10, leaf11, leaf12);

        TreeNode leaf21 = new TreeNode(15);
        TreeNode leaf22 = new TreeNode(5, null, leaf21);
        TreeNode root2 = new TreeNode(10, leaf22, null);
    }

    public boolean isSameTree(TreeNode first, TreeNode second) {
        return areLeavesEquals(first, second);
    }

    private boolean areLeavesEquals(TreeNode first, TreeNode second) {
        boolean areBothNull = (first == null && second == null); // return true
        if (areBothNull) {
            return true;
        }
        boolean isOnlyOneNull = (first == null || second == null); //return false
        if (isOnlyOneNull) {
            return false;
        }
        //means that both are not null, lets compare values
        boolean areValuesEq = first.val == second.val;
        if (!areValuesEq) {
            return false;
        }
        //let's repeat comparing left and right leaves
        boolean areLeftPartsEq = areLeavesEquals(first.left, second.left);
        boolean areRightPartsEq = areLeavesEquals(first.right, second.right);

        return areLeftPartsEq && areRightPartsEq;
    }

}
