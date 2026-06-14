package com.test.singly.linked.list;

public class TestLinkedList {

    public static void main(String arg[])
    {
        SinglyLinkedList s= new SinglyLinkedList();
        s.insertAtBegining(20);
        s.insertAtBegining(30);
        s.insertAtBegining(40);
        s.insertAtEnd(50);
        s.insertAfterNode(s.getHead().next,-30);
        s.insertElementAfterGivenValue(30,70);
        s.insertElementAfterGivenValue(30,70);
        s.traverse();
        System.out.println();
       // s.removeFromFront();
        s.removeAtTheEnd();

        System.out.println("After removing from front");
        s.traverse();
        System.out.println();
        s.insertAtEnd(130);
        System.out.println("Insert aagin at the end");
        s.traverse();
    }
}
