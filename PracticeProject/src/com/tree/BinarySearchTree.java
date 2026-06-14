package com.tree;

public class BinarySearchTree {
    private Tree root;

    public void addElement(int data) {
        Tree newNode = new Tree(data);
        if (root == null) {
            root = newNode;
        } else {
            root.add(data);
        }
    }

    public boolean getElementInTree(int element)
    {
        if (root == null) {
            return false;
        } else {
            return root.getElementInTree(element);
        }
    }

    public void inOrderTraversal() {
        root.inOrderTraversal();
    }

    public void preOrderTraversal() {
        root.preOrderTraversal();
    }

    public void postOrderTraversal() {
        root.postOrderTraversal();
    }

    public int getLevelOfNode(int nodeValue) {
        return root.getLevelOfNode(nodeValue);
    }
}
