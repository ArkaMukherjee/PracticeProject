package com.test.singly.linked.list;

public class Node {

    public Integer data;
    public Node next;

    public Node(Integer data) {
        this.data = data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
