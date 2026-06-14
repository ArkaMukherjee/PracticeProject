package com.doubly.LinkedList;

public class DoublyLinkedList {
    Node head;

    public void insertAtBegining(int value) {
        Node newNode = new Node(value);
        if (head != null) {
            newNode.next = head;
            head.previous = newNode;
        }
        head = newNode;
    }

    public void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            newNode.previous = temp;
            temp.next = newNode;
        }
    }

    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void reversal()
    {
        Node current=head;
        Node temp=null;
        while(current!=null)
        {
            temp=current.previous;
            current.previous=current.next;
            current.next=temp;
            current=current.previous;
        }
        if(temp!=null)
        {
            head=temp.previous;
        }
    }
}
