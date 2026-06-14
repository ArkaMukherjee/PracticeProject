package com.stack.array;

public class Stack {
    private Integer[] stackArray = new Integer[10];
    private int top = -1;

    public void push(Integer value) {
        if (top == stackArray.length - 1) {
            System.out.println("Stack is full");
        } else {
            stackArray[++top] = value;
        }
    }

    public Integer pop() {
        if (top == -1) {
            System.out.println("there is no element in stack");
            return null;
        } else {
            return stackArray[top--];
        }
    }

    public Integer peek()
    {
        if (top == -1) {
            System.out.println("there is no element in stack");
            return null;
        } else {
            return stackArray[top];
        }
    }

    public void traverseStack()
    {
        for(int i=top;i>-1;)
        {
            System.out.println(stackArray[i--]);
        }
    }
}


