package com.circular.single.linkedlist;

public class SinglyLinkedListTest {
    public static void main(String[] args) {
        SinglyLinkedList s= new SinglyLinkedList();
        s.insertAtBegining(4);
        s.insertAtBegining(7);
        s.insertAtBegining(2);
        s.insertAtBegining(3);
        s.traverse();
        System.out.println("\n");
        SinglyLinkedList s1= new SinglyLinkedList();
        System.out.println("Check insert at the end");
        s1.insertAtTheEnd(5);
        s1.insertAtTheEnd(7);
        s1.insertAtTheEnd(9);
        s1.insertAtTheEnd(2);
        s1.traverse();
        s1.delete(2);
        System.out.println("\n");
        System.out.println("list after deletion");
        s1.traverse();

        SinglyLinkedList s3= new SinglyLinkedList();
        s3.insertSorted(34);
        s3.insertSorted(20);
        s3.insertSorted(45);
        s3.insertSorted(2);
        System.out.println("\n");
        System.out.println("Check sorted insertion");
        s3.traverse();
        System.out.println("\n");
        System.out.println("Length  is equal to "+s3.findLengthRecursive(s3.getHead()));

        System.out.println("Print reverse");
        s3.printReverse(s3.getHead());
        System.out.println("\n");
        System.out.println("Search Element with position");
        System.out.println("Element found at position "+s3.searchElementWithRecursion(s3.getHead(),2));


    }
}
