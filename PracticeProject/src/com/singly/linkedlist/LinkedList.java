package com.singly.linkedlist;

public class LinkedList {

    Node head;

    public void add(int element)
    {
        Node node= new Node(element);
        if(head==null)
        {
            head=node;
        }
        else
        {
           node.next=head;
           head=node;
        }
    }

    public void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.getData());
            temp=temp.next;
        }
    }

    public void listReverse()
    {
        Node prev=null;
        Node next=null;
        Node  curr=head;
        while(curr!=null)
        {
            curr=curr.next;
        }
    }
}
