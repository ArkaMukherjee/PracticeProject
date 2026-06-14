package com.singly.linklist;

public class LInkedListReversalTest {
    public static void main(String[] args) {
        LinkedListReverse llr = new LinkedListReverse();
        llr.addElement(10);
        llr.addElement(20);
        llr.addElement(30);
        llr.addElement(40);
        llr.addElement(50);
        llr.addElement(60);
        System.out.println("print before reversal");
        llr.traverse();
        System.out.println("print after reversal");
        llr.reverse();
        llr.traverse();
    }
}
