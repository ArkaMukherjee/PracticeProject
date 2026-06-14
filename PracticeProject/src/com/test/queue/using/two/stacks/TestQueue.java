package com.test.queue.using.two.stacks;

public class TestQueue {

    public static void main(String arg[])
    {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(7);
        q.enqueue(9);
        q.enqueue(10);
        q.deQueue();
        q.enqueue(15);
        q.deQueue();
        q.deQueue();
        q.enqueue(17);
        q.enqueue(18);
        q.travarseQueue();
    }



}
