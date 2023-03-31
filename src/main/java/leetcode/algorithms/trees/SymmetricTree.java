package leetcode.algorithms.trees;

import leetcode.helpers.TreeNode;

//https://leetcode.com/problems/symmetric-tree/
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetricPartsEqual(root.left, root.right);
    }

    public boolean isSymmetricPartsEqual(TreeNode first, TreeNode second) {
        boolean areBothNull = (first == null && second == null); // return true
        if (areBothNull) {
            return true;
        }

        boolean isOnlyOneNull = (first == null || second == null); //return false
        if (isOnlyOneNull) {
            return false;
        }
        //lets compare val
        boolean areValuesEq = first.val == second.val;
        if (!areValuesEq) {
            return false;
        }
        //let's compare leaves
        boolean isOuterPartEq = isSymmetricPartsEqual(first.left, second.right);
        boolean isInnerPartEq = isSymmetricPartsEqual(first.right, second.left);

        return isOuterPartEq && isInnerPartEq;
    }

    private static void printNodes(TreeNode first, TreeNode second) {
        System.out.println("printing first");
        printNode(first);
        System.out.println("printing second");
        printNode(second);
    }

    public static void printNode(TreeNode node) {
        if (node == null) {
            System.out.println("root is null");
            return;
        } else {
            System.out.println("currant node val is " + node.val);
        }

        TreeNode left = node.left;
        if (left == null) {
            System.out.println("left is null");
        } else {
            System.out.println("left val is " + left.val);
        }
        TreeNode right = node.right;
        if (right == null) {
            System.out.println("right is null");
        } else {
            System.out.println("right val is " + right.val);
        }
    }
}
