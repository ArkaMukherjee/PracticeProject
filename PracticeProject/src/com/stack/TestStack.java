package com.stack;

public class TestStack {
    public static void main(String[] args) {
        StackUsingQueues s= new StackUsingQueues();
        s.push(10);
        s.push(23);
        s.push(11);
        s.push(100);
        s.pop();
        s.push(40);
        s.traverseStack();

    }
}
