package com.singly.linklist;

public class LinkedListReverse {
    Node head = null;


    public void addElement(int element) {
        Node newElement = new Node(element);
        if (head != null) {
            newElement.next = head;
        }
        head = newElement;
    }

    public void reverse() {
        Node prev = null;
        Node next = null;
        Node current = head;
        while (current!= null) {
            next=current.next;
            current.next=prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
