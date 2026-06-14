package com.circular.single.linkedlist;

public class CircularLinkedListTest {

    public static void main(String arg[]) {
        CircularList c = new CircularList();
        c.insertIntoListBegining(3);
        c.insertIntoListBegining(5);
        c.insertIntoListBegining(1);
        c.insertIntoListBegining(18);
        System.out.println("Traverse before reversal");
        c.traverse();
        System.out.println("Traverse After reversal");
        c.reverse();
        c.traverse();
      /*  System.out.println("\n");
        System.out.println("Insert at Last");

        CircularList c1 = new CircularList();
        c1.insertListEnd(3);
        c1.insertListEnd(5);
        c1.insertListEnd(1);
        c1.insertListEnd(18);
        c1.traverse();*/

    }
}
