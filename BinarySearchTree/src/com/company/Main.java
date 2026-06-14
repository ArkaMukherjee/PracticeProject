package com.company;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insertValueIntoTree(13);
        tree.insertValueIntoTree(26);
        tree.insertValueIntoTree(7);
        tree.insertValueIntoTree(21);
        tree.insertValueIntoTree(32);
        tree.insertValueIntoTree(15);
        tree.insertValueIntoTree(26);
        tree.insertValueIntoTree(19);
        tree.insertValueIntoTree(9);
        tree.insertValueIntoTree(28);
        tree.insertValueIntoTree(23);
        tree.insertValueIntoTree(5);
        tree.inOrderTraverse();

      //  System.out.println("Minimum value in tree : "+tree.getMinInTree());
       // System.out.println("Maximum value in tree : "+tree.getMaxInTree());
        tree.deleteValueInTree(32);
        System.out.println("Tree after deletion");
        tree.inOrderTraverse();


          System.out.println("Minimum value in tree : "+tree.getMinInTree());
          System.out.println("Maximum value in tree : "+tree.getMaxInTree());
    }
}
