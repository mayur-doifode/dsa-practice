package com.datastructure.trees.problems;

import com.datastructure.trees.BST;

public class FindHeight extends BST {

    int findHeight(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(findHeight(root.left), findHeight(root.right));
    }


    public static void main(String[] args) {
        FindHeight bst = new FindHeight();
        bst.populateRandom(10);
        bst.inorder(bst.root);
        int height = bst.findHeight(bst.root);

        System.out.println("\nHeight of the binary tree: " + height);

    }
}
