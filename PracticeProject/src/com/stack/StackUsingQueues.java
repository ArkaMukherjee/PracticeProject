package com.stack;

import java.util.*;

public class StackUsingQueues {
    Queue q1 = new LinkedList();
    Queue q2 = new LinkedList();

    public void push(int value) {
            q1.add(value);
    }

    public void pop()
    {
        if(!q1.isEmpty()) {
            while (q1.size() != 1) {
                q2.add(q1.remove());
            }
            q1.remove();

            Queue temp = q1;
            q1 = q2;
            q2 = temp;
            temp = null;
        }
    }

    public void traverseStack()
    {
        Iterator i= q1.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
