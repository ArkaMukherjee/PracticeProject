package com.test.singly.linked.list;

import java.sql.SQLOutput;

public class SinglyLinkedList {
    private Node head;

    public void insertAtBegining(Integer value) {
        Node node = new Node(value);
        if (head != null) {
            node.next = head;
        }
        head = node;
    }

    public void traverse() {
        Node test = head;
        while (test != null) {
            System.out.print(test.data+"\t");
            test = test.next;
        }
    }

    public void insertAtEnd(Integer value) {

        Node test = head;
        while (test.next != null) {
            test = test.next;
        }
        test.next = new Node(value);

    }

    public void insertAfterNode(Node prev_node, Integer value) {
        if (prev_node == null) {
            System.out.println("Specified node does not exists");
        } else {
            Node node = new Node(value);
            node.next = prev_node.next;
            prev_node.next = node;
        }
    }

    public Node getHead() {
        return head;
    }

    public void insertElementAfterGivenValue(int i, int i1) {

        Node tnode = head;
        while (tnode != null) {
            if (tnode.data == i) {
                Node node = new Node(i1);
                node.next = tnode.next;
                tnode.next = node;
                break;
            }
            tnode=tnode.next;
        }
    }

    public void removeFromFront() {
        if(head!=null)
        {
            Node removeNode=head;
            head=head.next;
            removeNode.next=null;
        }
    }

    public void removeAtTheEnd() {
        Node node=head;
        while(node.next.next!=null)
        {
            node=node.next;
        }
        node.next=null;
    }
}
