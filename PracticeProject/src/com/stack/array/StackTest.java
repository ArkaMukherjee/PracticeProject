package com.stack.array;

public class StackTest {

    public static void main(String arg[]) {
        Stack s = new Stack();
       // s.traverseStack();
        s.peek();
        s.push(23);
        s.push(3);
        s.push(13);
        s.push(-9);
        s.push(10);
        System.out.println("Pop element from stack");
        s.pop();
       // System.out.println("Elements in stack");
       // s.traverseStack();
        System.out.println("Push elements into stack");
        s.push(40);
        s.push(4);
        s.push(11);
        s.push(13);
        s.push(22);
        System.out.println("Peek elements into stack");
        s.peek();
        System.out.println("Elements in stack");
        s.traverseStack();

    }
}
