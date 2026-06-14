package com.doubly.LinkedList;

public class XOROperatedDoublyLinkedList {

    XORNode head;

    public void insert(int value) {
        XORNode newNode = new XORNode(value);

        //since we are inserting new node at the begining of list,
       // hence npx for new node is XOR of NULL and current head of linked list;
        newNode.npx=(head);

        if(head!=null)
        {
            //head.npx=(XORNode) (newNode.data^head.data);
        }
    }
}
