package com.queue;

public class QueueUsingSinglyLinkedListWithOof1Complexity {
    Node front, rear = null;

    public void enqueue(int element) {
        Node newNode = new Node(element);
        if (front == null && rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            front = front.next;
        }
    }

    public void traverseQueue() {
        Node temp = front;
        while (temp != null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
