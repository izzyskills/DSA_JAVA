package DSA;

public class Stack<T> {
    private int maxSize;
    private T[] data;
    private int top;

    @SuppressWarnings("unchecked")
    public Stack(int size) {
        this.maxSize = size;
        this.top = -1;
        this.data = (T[]) new Object[size];
    }

    public void push(T value) {
        if (top == maxSize) {
            System.out.println("Stack Overflow");
        }
        data[++top] = value;
        System.out.println(value + " has been added to the Stack");
    }

    public T pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return null;
        }
        T removedValue = data[top--];
        return removedValue;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public T peek() {
        if (top == -1) {
            System.err.println("Stack is empty");
            return null;
        }
        return data[top];
    }

}