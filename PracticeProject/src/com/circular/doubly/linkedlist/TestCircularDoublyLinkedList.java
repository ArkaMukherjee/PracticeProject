package com.circular.doubly.linkedlist;

public class TestCircularDoublyLinkedList {
    public static void main(String[] args) {
        CircularDoublyLinkedList cd= new CircularDoublyLinkedList();
        cd.insertAtBegining(10);
        cd.insertAtBegining(30);
        cd.insertAtBegining(50);
        cd.insertAtBegining(90);
         cd.traverse();
    }
}
