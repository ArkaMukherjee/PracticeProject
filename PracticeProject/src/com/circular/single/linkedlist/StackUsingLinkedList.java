package com.circular.single.linkedlist;


public class StackUsingLinkedList {
    Node top;

    public void push(int value) {
        Node newNode = new Node(value);
        if (top != null) {
            newNode.next = top;
        }
        top = newNode;
    }

    public int pop() {
        int poppedValue = top.data;
        top = top.next;
        return poppedValue;
    }

    public int peek() {
        return top.data;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
