package com.queue;

import com.test.queue.using.two.stacks.Queue;

public class QueueUsingSinglyLinkedList {
    Node front;
    Node rear;

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (front == null && rear == null) {
            front = rear = newNode;
        } else {
            newNode.next = rear;
            rear = newNode;
        }
    }

    public void dequeue() {
        if (front == null && rear == null) {
            System.out.println("Queue is empty");
        } else {
            Node temp = rear;
            while (temp != null && temp.next != front) {
                temp = temp.next;
            }
            front = temp;
            if (front == null) {
                rear = null;
            }
        }
    }

    public void traverse() {
        Node temp = rear;
        if (temp == null) {
            System.out.println("No element in queue");
        }
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


}
