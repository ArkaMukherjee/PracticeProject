package com.queue;

public class QueueTest {
    public static void main(String[] args) {
    /*    QueueUsingArray queue= new QueueUsingArray(5);
        queue.add(5);
        queue.add(34);
        queue.add(3);
        queue.add(12);
        queue.add(21);
        System.out.println("Removed element from queue is :"+queue.remove());
        System.out.println("Removed element from queue is :"+queue.remove());
        queue.add(41);
        System.out.println("Peeked element from queue is :"+queue.peek());
        queue.add(45);
        //Check if queue is full
        queue.add(50);
        //print queue
        queue.traverse();*/
/*
        QueueUsingSinglyLinkedList qusl=new QueueUsingSinglyLinkedList();
        qusl.enqueue(10);
        qusl.enqueue(20);
        qusl.enqueue(30);
        qusl.enqueue(40);
        qusl.dequeue();
        qusl.dequeue();
        qusl.dequeue();
        qusl.dequeue();
        qusl.enqueue(60);
        qusl.enqueue(70);
        qusl.enqueue(90);
        qusl.traverse();*/

        QueueUsingSinglyLinkedListWithOof1Complexity q= new QueueUsingSinglyLinkedListWithOof1Complexity();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(40);
        q.dequeue();
        q.enqueue(50);
        q.dequeue();
        q.traverseQueue();
    }
}
