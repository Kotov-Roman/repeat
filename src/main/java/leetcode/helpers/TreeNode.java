package leetcode.helpers;

import java.io.PrintStream;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
//    public void print(PrintStream os) {
//        StringBuilder sb = new StringBuilder();
//        traversePreOrder(sb, this);
//        os.print(sb.toString());
//    }
//
//    public void traversePreOrder(StringBuilder sb, TreeNode node) {
//        if (node != null) {
//            sb.append(node.val);
//            sb.append("\n");
//            traversePreOrder(sb, node.left);
//            traversePreOrder(sb, node.right);
//        }
//    }

}
