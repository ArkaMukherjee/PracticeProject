package com.company;


public class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }
    public void insertValueIntoTreeNode(int value) {
        if (this.data == value) {
            return;
        } else if (value < this.data) {
            if (leftChild != null) {
                leftChild.insertValueIntoTreeNode(value);
            } else {
                leftChild = new TreeNode(value);
            }
        } else {
            if (rightChild != null) {
                rightChild.insertValueIntoTreeNode(value);
            } else {
                rightChild = new TreeNode(value);
            }
        }
    }

    public void inOrderTraverse() {
        if (leftChild != null) {
            leftChild.inOrderTraverse();
        }
        System.out.println(data + ",");
        if (rightChild != null) {
            rightChild.inOrderTraverse();
        }
    }

    public int getMin() {
        if (leftChild != null) {
            return leftChild.getMin();
        }
        return data;
    }

    public int getMax() {
        if (rightChild != null) {
            return rightChild.getMax();
        }
        return data;
    }

    public TreeNode delete(int value,TreeNode root) {
        if (data == value) {
            if (rightChild != null) {
                data = rightChild.getMax();
            } else {
                root=null;
            }
        } else if (data > value) {
            leftChild.delete(value,this);
        } else {
            rightChild.delete(value,this);
        }
        return  root;
    }
}
