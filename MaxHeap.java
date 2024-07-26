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

}
