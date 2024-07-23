package DSA;

public class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        root = null;
    }

    public TreeNode insertRec(TreeNode root, double key) {
        if (root == null) {
            root = new TreeNode(key);
            return root;
        }
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    public void insert(double key) {
        insertRec(root, key);
    }

    public void inorder() {
        inorderRec(root);
    }

    // A utility function to do inorder traversal of the binary tree
    private void inorderRec(TreeNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    // Method for preorder traversal of the binary tree
    public void preorder() {
        preorderRec(root);
    }

    // A utility function to do preorder traversal of the binary tree
    private void preorderRec(TreeNode root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    // Method for postorder traversal of the binary tree
    public void postorder() {
        postorderRec(root);
    }

    // A utility function to do postorder traversal of the binary tree
    private void postorderRec(TreeNode root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.key + " ");
        }
    }
}