package com.datastructure.trees.problems;

import com.datastructure.trees.BST;

public class FindHeight extends BST {

    /*
    The approach recursively calculates the height of a binary tree by finding the maximum height between its left and right subtrees.
    If the root is null, the height is considered 0. The height of the tree is then returned as 1 plus the maximum height between the left and right subtrees.
     * */
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
