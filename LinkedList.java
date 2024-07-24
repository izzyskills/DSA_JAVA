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

    public void deleteByKey(T key) {
        Node<T> currNode = head, prev = null;

        // CASE 1: The head node itself holds the key
        if (currNode != null && currNode.data.equals(key)) {
            head = currNode.next; // Changed head
            if (head != null) {
                head.prev = null; // Unlink previous reference of new head
            }
            // Display the message
            System.out.println(key + " found and deleted");
            return;
        }

        // CASE 2: The key is somewhere other than the head
        while (currNode != null && !currNode.data.equals(key)) {
            // If currNode does not hold key, continue to next node
            prev = currNode;
            currNode = currNode.next;
        }

        // If the key was present, currNode should not be null
        if (currNode != null) {
            // Since the key is at currNode, unlink currNode from the linked list
            prev.next = currNode.next;

            // If currNode is not the last node, update the next node's prev reference
            if (currNode.next != null) {
                currNode.next.prev = prev;
            }

            // Display the message
            System.out.println(key + " found and deleted");
        } else {
            // CASE 3: The key is not present in the list
            System.out.println(key + " not found");
        }
    }
}