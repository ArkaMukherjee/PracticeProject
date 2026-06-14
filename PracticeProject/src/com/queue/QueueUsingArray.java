package com.queue;

public class QueueUsingArray {

    Integer[] a;
    int front = -1;
    int rear = -1;

    public QueueUsingArray(int capacity) {
        a = new Integer[capacity];
    }

    public void add(int value) {

        if (rear == a.length - 1) {
            System.out.println("Queue is full");
        }
        else if (front == -1) {
            a[++front] = value;
            rear++;
        } else {
            a[++rear] = value;
        }
    }

    public int peek() {
        return a[front];
    }

    public int remove() {
        int removedElement = a[front];
        for(int i=0 ;i<rear;i++)
        {
            a[i]=a[i+1];
        }
        a[rear]=null;
        rear--;
        return removedElement;
    }

    public void traverse() {
        while (front<=rear) {
            System.out.println(a[front++]);
        }
    }
}
