package com.datastructure.trees.problems;

import com.datastructure.trees.BST;

// Perform an in-order traversal of the binary tree and store the elements in a list.
// If the resulting list is sorted in ascending order, then the tree is a binary search tree.
public class CheckIfBinaryTree extends BST {


    boolean checkIfBinaryTree(Node root) {
        if (root == null) {
            return true;
        }
        boolean left = true, right = true;
        if (root.left != null) {
            if (root.data >= root.left.data) {
                left = checkIfBinaryTree(root.left);
            } else {
                return false;
            }

        }
        if (root.right != null) {
            if (root.data <= root.right.data) {
                right = checkIfBinaryTree(root.right);
            } else {
                return false;
            }

        }

        return left && right;

    }

    public static void main(String[] args) {


    }
}
