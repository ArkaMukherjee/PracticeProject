package com.stack.array;

public class TwoStackUsingOneArray {
    int[] arr = new int[7];
    int top1 = -1;
    int top2 = arr.length;

    public static void main(String[] args) {
        TwoStackUsingOneArray tsuoa= new TwoStackUsingOneArray();
        tsuoa.pushInStackOne(2);
        tsuoa.pushInStackOne(3);
        tsuoa.pushInStackOne(9);
       // tsuoa.pushInStackOne(1);
        tsuoa.pushInStackTwo(5);
        tsuoa.pushInStackTwo(-5);
        tsuoa.pushInStackTwo(6);
        tsuoa.popFromStackOne();
        tsuoa.pushInStackTwo(11);
        tsuoa.pushInStackTwo(6);
        tsuoa.popFromStackTwo();
        tsuoa.pushInStackOne(13);
        tsuoa.traverseStack1();
        tsuoa.traverseStack2();
    }

    public void pushInStackOne(int element) {
        if (top2!=top1+1) {
            arr[++top1] = element;
        } else {
            System.out.println("Stack one Overflow");
        }
    }

    public void pushInStackTwo(int element) {
        if (top2!=top1+1){
            arr[--top2] = element;
        } else {
            System.out.println("Stack two Overflow");
        }
    }

    public void popFromStackOne() {
        if (top1 == -1) {
            System.out.println("Stack One is empty");
        } else {
            System.out.println("Element popped from stack one : " + arr[top1--]);
        }
    }

    public void popFromStackTwo() {
        if (top1 == arr.length) {
            System.out.println("Stack Two is empty");
        } else {
            System.out.println("Element popped from stack two : " + arr[top2++]);
        }
    }

    public void traverseStack1()
    {
        for(int i=0;i<=top1;i++)
        {
            System.out.println("Element int stack one : "+arr[i]);
        }
    }

    public void traverseStack2()
    {
        for(int i=top2;i<=arr.length-1;i++)
        {
            System.out.println("Element int stack Two : "+arr[i]);
        }
    }

}
