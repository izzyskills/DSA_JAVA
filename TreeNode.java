package DSA;

import static java.lang.Math.max;

import java.util.List;

public class TreeNode {
    double key;
    TreeNode right;
    TreeNode left;

    public TreeNode(double key) {
        this.key = key;
        this.right = this.left = null;
    }
}
