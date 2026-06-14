package com.circular.single.linkedlist;


public class CircularList {
    Node head;

    public void insertIntoListBegining(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newNode.next = head;
            head = newNode;
            temp.next = newNode;
        }
    }

    public void insertListEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node forward = head;
            while (forward.next != head) {
                forward = forward.next;
            }
            forward.next = newNode;
            forward.next.next = head;
        }
    }

    public void traverse() {
        Node forward = head;
        do {
            System.out.println(forward.data);
            forward = forward.next;
        }
        while (forward != head);
    }

    public void reverse() {
        Node temp = head;
        do {
            temp = temp.next;
        }
        while (temp.next != head);
        Node prev = null;
        Node next = null;
        Node curr = head;
        do {
            next = curr.next;
            if (prev != null) {
                curr.next = prev;
            } else {
                curr.next = temp;
            }
            prev = curr;
            curr = next;
        }
        while (curr != head);
        head = prev;
    }

}
