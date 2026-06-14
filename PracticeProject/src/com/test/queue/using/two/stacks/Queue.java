package com.test.queue.using.two.stacks;

import java.util.Stack;

public class Queue {

    private Stack<Integer> stackOne = new Stack<>();
    private Stack<Integer> stackTwo = new Stack<>();

    public void enqueue(Integer value) {
        stackOne.push(value);
    }

    public void deQueue() {
        if (stackTwo.isEmpty()) {
            int lengthOfStackOne=stackOne.size();
            for (int i = 0; i < lengthOfStackOne; i++) {
                stackTwo.push(stackOne.pop());
            }
        }
        stackTwo.pop();
    }

    public void travarseQueue()
    {
        stackOne.forEach(i-> System.out.println(i));
        stackTwo.forEach(i-> System.out.println(i));
    }
}
