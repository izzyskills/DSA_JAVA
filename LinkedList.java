package DSA;

public class LinkedList<T> {
    Node<T> head;

    static class Node<T> {
        T data;
        Node<T> next, prev;

        Node(T d) {
            data = d;
            next = prev = null;
        }

    }

    public LinkedList() {
        head = null;
    }

    public void insert(T data) {
        Node<T> new_node = new Node<T>(data);

        if (head == null) {
            head = new_node;

        } else {
            Node<T> last = head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = new_node;
            last.next.prev = last;
        }

    }

    public void printList() {
        Node<T> currNode = head;
        System.out.print("Linked List: ");

        while (currNode != null) {
            System.out.print(currNode.data + "--> ");
            currNode = currNode.next;
        }
        System.out.println();
    }
}
