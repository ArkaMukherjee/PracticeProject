package com.tree;

public class Tree {

    private int data;
    private Tree leftChild;
    private Tree rightChild;

    public Tree(int data) {
        this.data = data;
    }

    public void add(int data) {
        if (this.data == data) {
            return;
        } else if (this.data > data) {
            if (leftChild != null) {
                leftChild.add(data);
            } else {
                leftChild = new Tree(data);
            }
        } else {
            if (rightChild != null) {
                rightChild.add(data);
            } else {
                rightChild = new Tree(data);
            }
        }
    }

    public void inOrderTraversal() {
        if (leftChild != null) {
            leftChild.inOrderTraversal();
        }
        System.out.println(this.data);
        if (rightChild != null) {
            rightChild.inOrderTraversal();
        }
    }

    public void preOrderTraversal() {
        System.out.println(this.data);
        if (leftChild != null) {
            leftChild.preOrderTraversal();
        }
        if (rightChild != null) {
            rightChild.preOrderTraversal();
        }
    }

    public void postOrderTraversal() {

        if (leftChild != null) {
            leftChild.postOrderTraversal();
        }
        if (rightChild != null) {
            rightChild.postOrderTraversal();
        }
        System.out.println(this.data);
    }

    public int getLevelOfNode(int nodeValue) {
        int level = 1;
        if (this.data == nodeValue) {
            return level;
        } else if (this.getData() > nodeValue) {
            if (leftChild != null) {
                level = 1 + leftChild.getLevelOfNode(nodeValue);
            } else {
                return - getLevelOfNode(leftChild.getData());
            }
        } else {
            if (rightChild != null) {
                level = 1 + rightChild.getLevelOfNode(nodeValue);
            } else {
                return - getLevelOfNode(rightChild.getData());
            }
        }
        return level;
    }

    public boolean getElementInTree(int element)
    {
            if (this.data == element) {
                return true;
            } else if (this.data > element && this.leftChild!=null) {
                return this.leftChild.getElementInTree(element);
            } else if( this.data < element && this.rightChild!=null) {
                return this.rightChild.getElementInTree(element);
            }
        return false;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Tree getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Tree leftChild) {
        this.leftChild = leftChild;
    }

    public Tree getRightChild() {
        return rightChild;
    }

    public void setRightChild(Tree rightChild) {
        this.rightChild = rightChild;
    }
}
