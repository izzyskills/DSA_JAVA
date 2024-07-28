package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class MaxHeap {
    int[] arr;
    int maxSize;
    int heapSize;

    public MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        heapSize = 0;
    }

    public void MaxHeapify(
            int i) {
        int l = lChild(i);
        int r = rChild(i);
        int largest = i;
        if (l < heapSize && arr[l] > arr[i])
            largest = l;
        if (r < heapSize && arr[r] > arr[largest])
            largest = r;
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            MaxHeapify(largest);
        }
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    // Returns the index of the left child.
    int lChild(int i) {
        return (2 * i + 1);
    }

    // Returns the index of the
    // right child.
    int rChild(int i) {
        return (2 * i + 2);
    }

    int removeMax() {
        // Checking whether the heap array
        // is empty or not.
        if (heapSize <= 0)
            return Integer.MIN_VALUE;
        if (heapSize == 1) {
            heapSize--;
            return arr[0];
        }

        // Storing the maximum element
        // to remove it.
        int root = arr[0];
        arr[0] = arr[heapSize - 1];
        heapSize--;

        // To restore the property
        // of the Max heap.
        MaxHeapify(0);

        return root;
    }

    // Increases value of key at
    // index 'i' to new_val.
    void increaseKey(int i, int newVal) {
        arr[i] = newVal;
        while (i != 0 && arr[parent(i)] < arr[i]) {
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
            i = parent(i);
        }
    }

    // Returns the maximum key
    // (key at root) from max heap.
    int getMax() {
        return arr[0];
    }

    int curSize() {
        return heapSize;
    }

    // Deletes a key at given index i.
    void deleteKey(int i) {
        // It increases the value of the key
        // to infinity and then removes
        // the maximum value.
        increaseKey(i, Integer.MAX_VALUE);
        removeMax();
    }

}
