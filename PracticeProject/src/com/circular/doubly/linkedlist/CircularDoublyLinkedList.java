package com.circular.doubly.linkedlist;

public class CircularDoublyLinkedList {

    private Node head;

    public void insertAtBegining(int value)
    {
        Node newNode= new Node(value);
        if(head==null)
        {
            head=newNode;
            head.next=head;
            head.previous=head;
        }
        else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newNode.next = head;
            head.previous=newNode;
            head = newNode;
            temp.next=newNode;
        }
    }

    public void traverse()
    {
        Node temp=head;
        do {
            System.out.println(temp.data);
            temp=temp.next;
        }
        while(temp!=head);
    }
}
