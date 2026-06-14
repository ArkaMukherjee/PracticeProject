package com.tree;

public class BinarySearchTreeTest {
    public static void main(String[] args) {
        BinarySearchTree bst= new BinarySearchTree();
        bst.addElement(7);
        bst.addElement(5);
        bst.addElement(10);
        bst.addElement(4);
        bst.addElement(6);
        bst.addElement(9);
        bst.addElement(11);
        bst.addElement(8);
        System.out.println("In Order Traversal");
        bst.inOrderTraversal();
        System.out.println("Pre Order Traversal");
        bst.preOrderTraversal();
        System.out.println("Post Order Traversal");
        bst.postOrderTraversal();

        //System.out.println("Level is : "+bst.getLevelOfNode(8));

        System.out.println("Element present in tree: "+bst.getElementInTree(4));
    }

}
