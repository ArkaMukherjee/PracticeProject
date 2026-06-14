package com.company;

public class Tree {
    private TreeNode root;

    public void insertValueIntoTree(int value) {
        if (root != null) {
            root.insertValueIntoTreeNode(value);
        } else {
            root = new TreeNode(value);
        }
    }

    public void inOrderTraverse() {
        if (root != null) {
            root.inOrderTraverse();
        }
    }

    public int getMinInTree() {
        if (root != null) {
            return root.getMin();
        }
        return Integer.MIN_VALUE;
    }

    public int getMaxInTree() {
        if (root != null) {
            return root.getMax();
        }
        return Integer.MAX_VALUE;
    }

    public void deleteValueInTree(int value) {
        if (root != null) {
            TreeNode finalRoot=root.delete(value,root);
        }
    }
}
