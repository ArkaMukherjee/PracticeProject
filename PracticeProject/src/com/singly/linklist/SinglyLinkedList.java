package com.singly.linklist;

public class SinglyLinkedList {

    private Node head;

    public Node getHead() {
        return head;
    }

    public void insertAtBegining(int value) {
        Node newNode = new Node(value);
        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
    }

    public void insertAtTheEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void insertSorted(int value) {
        Node newNode = new Node(value);
        if (head == null || head.data > value) {
            insertAtBegining(value);
        } else {
            Node current = head.next;
            Node previous = head;
            while (current != null && current.data < value) {
                previous = current;
                current = current.next;
            }
            newNode.next = current;
            previous.next = newNode;
        }
    }

    public int findLengthRecursive(Node head) {
        Node temp = head;
        int initialLenght = 0;
        if (temp != null) {
            initialLenght = initialLenght + findLengthRecursive(temp.next);
            initialLenght++;
        }
        return initialLenght;
    }

    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void printReverse(Node node) {

        Node temp = node;
        if (temp == null) {
            return;
        }
        printReverse(temp.next);
        System.out.print(temp.data + " ");

    }

    public int searchElementWithRecursion(Node node, int element) {
        Node temp = node;
        int position = 0;
        if (temp.data != element) {
            position++;
            position = position + searchElementWithRecursion(temp.next, element);
        }
        return position;
    }

    public void delete(int position) {
        Node temp = head;
        for (int i = 0; temp.next != null; temp = temp.next, i++) {
            if (position == i + 1) {
                temp.next = temp.next.next;
            }
        }
    }

    public void findMiddle() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle node value is " + slow.data);
    }

    public int searchNthElementFromLast(int position) {
        Node temp = head;
        int lengthOfList = 0;
        while (temp != null) {
            lengthOfList++;
            temp = temp.next;
        }
        int expectedPosition = lengthOfList - (position-1);
        int count = 0;
        Node tempo = head;
        while (tempo != null) {
            if (++count != expectedPosition) {
                tempo = tempo.next;
            } else {
                return tempo.data;
            }
        }
        return 0;
    }


    public void printRecur(Node head)
    {
        if(head==null)
        {
            return;
        }

        System.out.println(head.data);
        printRecur(head.next);
    }
}
