package leetcode.algorithms.trees;

import leetcode.helpers.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PathSumII {
    LinkedList<Integer> currentPath = new LinkedList<>();
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        compute(root, targetSum);
        return result;
    }

    public void compute(TreeNode root, int targetSum) {
        if (root == null) {
            return;
        }
        currentPath.add(root.val);

        int diff = targetSum - root.val;
        if (diff == 0 && root.right == null && root.left == null) {
            result.add(new ArrayList<>(currentPath));
        }
        compute(root.left, diff);
        compute(root.right, diff);

        currentPath.removeLast();
    }
}
