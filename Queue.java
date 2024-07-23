package DSA;

public class Queue<T> {
    private T[] data;
    private int capacity, size, front, rear;

    @SuppressWarnings("unchecked")
    public Queue(int size) {
        this.capacity = size;
        this.data = (T[]) new Object();
        this.size = 0;
        this.front = 0;
        this.rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(T value) {
        if (isFull()) {
            System.out.println("Queue is Full");
        }
        rear = (rear + 1) % capacity;
        data[rear] = value;
        System.err.println(value + "added to Queue");
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }
        T removedValue = data[front];
        front = (front + 1) % capacity;
        System.out.println(removedValue + " dequeued from queue");
        size--;
        return removedValue;
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }
        return data[front];
    }
}
