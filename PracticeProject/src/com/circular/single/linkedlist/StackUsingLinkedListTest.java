package com.circular.single.linkedlist;

public class StackUsingLinkedListTest {
    public static void main(String[] args) {
        StackUsingLinkedList s= new StackUsingLinkedList();
        s.push(20);
        s.push(30);
        s.push(10);
        System.out.println("Popped ELelmnt is : "+s.pop());
        s.push(40);
        System.out.println("Peeked ELelmnt is : "+s.peek());
        s.printStack();
    }


}
