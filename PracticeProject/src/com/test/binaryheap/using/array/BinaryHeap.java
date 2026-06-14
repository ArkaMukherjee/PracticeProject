package com.test.binaryheap.using.array;

public class BinaryHeap {
    private int[] heap;
    private int size;

    public BinaryHeap(int capacity) {
        heap = new int[capacity];
    }

    public void insertValue(int value) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Heap is full");
        }
        heap[size] = value;
        heapify(size);
        size++;
    }

    private void heapify(int index)
    {
        int newValue= heap[index];
        while(index>0 && heap[index]>heap[getParent(index)])
        {
            heap[index]=heap[getParent(index)];
            index=getParent(index);
        }
        heap[index]=newValue;
    }

    private boolean isFull() {
        return heap.length == size;
    }

    private int getParent(int index) {
        return (index - 1) / 2;
    }

}
