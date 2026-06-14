package com.doubly.LinkedList;

public class TestDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList d= new DoublyLinkedList();
        d.insertAtBegining(10);
        d.insertAtBegining(30);
        d.insertAtBegining(40);
        d.insertAtBegining(60);
        d.traverse();

        d.reversal();
        System.out.println("print after reversal");
        d.traverse();
      /*  System.out.println("\n");
        System.out.println("Insert at end");
        DoublyLinkedList d1= new DoublyLinkedList();
        d1.insertAtEnd(10);
        d1.insertAtEnd(50);
        d1.insertAtEnd(70);
        d1.insertAtEnd(90);

        d1.traverse();*/
    }
}
