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
            return;
        } else {
            // CASE 3: The key is not present in the list
            System.out.println(key + " not found");
            return;
        }
    }

    public void deleteAtPosition(int index) {
        Node<T> currNode = head, prev = null;
        if (index == 0 & currNode != null) {
            head = head.next;
            head.prev = null;
            System.out.println(index + " position element deleted");
            return;
        }

        int counter = 0;

        while (currNode != null) {
            if (index == counter) {
                prev.next = currNode.next;
                // If currNode is not the last node, update the next node's prev reference
                if (currNode.next != null) {
                    currNode.next.prev = prev;
                }
                return;
            } else {
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }
        if (currNode == null) {
            // Display the message
            System.out.println(
                    index + " position element not found");
            return;
        }

    }

    public T findElementBykey(T key) {
        Node<T> currNode = head;

        if (currNode == null) {
            // The list is empty
            System.out.println(key + " not found");
            return null;
        } else {
            // Start the recursive search
            return findElementByKeyRec(currNode, key);
        }
    }

    private T findElementByKeyRec(Node<T> currNode, T key) {
        // Base case: end of the list
        if (currNode == null) {
            System.out.println(key + " not found");
            return null;
        }
        // Base case: key found
        if (currNode.data.equals(key)) {
            return currNode.data;
        }
        // Recursive case: move to the next node
        return findElementByKeyRec(currNode.next, key);
    }

    public T findAtPosition(int index) {
        Node<T> currNode = head;
        int counter = 0;
        while (currNode != null) {
            if (index == counter) {
                return currNode.data;
            } else {
                currNode = currNode.next;
                counter++;
            }
        }
        if (currNode == null) {
            System.out.println(
                    index + " position element not found");
        }
        return null;

    }
}