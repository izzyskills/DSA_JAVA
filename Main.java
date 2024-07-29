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

        // Linked List
        LinkedList<Integer> list = new LinkedList<Integer>();

        //
        // ******INSERTION******
        //

        // Insert the values
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);

        // Print the LinkedList
        list.printList();
        list.deleteByKey(1);

        // Print the LinkedList
        list.printList();

        // Delete node with value 4
        // In this case the key is present ***in the
        // middle***
        list.deleteByKey(4);

        // Print the LinkedList
        list.printList();

        // Delete node at position 2
        // In this case the key is present ***in the
        // middle***
        list.deleteAtPosition(2);

        // Print the LinkedList
        list.printList();

        // Delete node at position 10
        // In this case the key is ***not present***
        list.deleteAtPosition(10);

        list.printList();

        System.err.println(list.findAtPosition(2));

        MaxHeap h = new MaxHeap(15);

        // Asking the user to input the keys:
        System.out.println("Entered 6 keys:- 3, 10, 12, 8, 2, 14 \n");
        h.insertKey(3);
        h.insertKey(10);
        h.insertKey(12);
        h.insertKey(8);
        h.insertKey(2);
        h.insertKey(14);

        // Printing the current size
        // of the heap.
        System.out.println("The current size of the heap is "
                + h.curSize() + "\n");

        // Printing the root element which is
        // actually the maximum element.
        System.out.println("The current maximum element is " + h.getMax()
                + "\n");

        // Deleting key at index 2.
        h.deleteKey(2);

        // Printing the size of the heap
        // after deletion.
        System.out.println("The current size of the heap is "
                + h.curSize() + "\n");

        // Inserting 2 new keys into the heap.
        h.insertKey(15);
        h.insertKey(5);
        System.out.println("The current size of the heap is "
                + h.curSize() + "\n");
        System.out.println("The current maximum element is " + h.getMax()
                + "\n");

        MinHeap MinH = new MinHeap(11);
        MinH.insertKey(3);
        MinH.insertKey(2);
        MinH.deleteKey(1);
        MinH.insertKey(15);
        MinH.insertKey(5);
        MinH.insertKey(4);
        MinH.insertKey(45);
        System.out.print(MinH.extractMin() + " ");
        System.out.print(MinH.getMin() + " ");

        MinH.decreaseKey(2, 1);
        System.out.print(MinH.getMin());
    }

}