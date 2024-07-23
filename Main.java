package DSA;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        /*
         * Let us create the following binary tree
         * 50
         * / \
         * 30 70
         * / \ / \
         * 20 40 60 80
         */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Print inorder traversal of the binary tree
        System.out.println("Inorder traversal:");
        tree.inorder();
        System.out.println();

        // Print preorder traversal of the binary tree
        System.out.println("Preorder traversal:");
        tree.preorder();
        System.out.println();

        // Print postorder traversal of the binary tree
        System.out.println("Postorder traversal:");
        tree.postorder();
        System.out.println();
    }

}