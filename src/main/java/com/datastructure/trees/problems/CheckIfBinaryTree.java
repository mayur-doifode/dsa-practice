package com.datastructure.trees.problems;

import com.datastructure.trees.BST;


public class CheckIfBinaryTree extends BST {
    /*
    It recursively checks each node in the tree and validates if the node's value falls within the range defined by its parent nodes.
    If the value is outside the valid range, it returns false. The recursion continues for the left and right subtrees, updating the range accordingly.
     */
    boolean checkIfBinaryTree(Node root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (root.data <= min || root.data > max) {
            return false;
        }
        return checkIfBinaryTree(root.left, min, root.data) && checkIfBinaryTree(root.right, root.data, max);
    }

    public static void main(String[] args) {
        CheckIfBinaryTree t1 = new CheckIfBinaryTree();
        t1.populateRandom(10);
        if (t1.checkIfBinaryTree(t1.root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
            System.out.println("tree is binary");
        } else {
            System.out.println("tree is NOT binary");
        }
    }
}
