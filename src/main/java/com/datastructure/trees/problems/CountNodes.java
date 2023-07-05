package com.datastructure.trees.problems;

import com.datastructure.trees.BST;

public class CountNodes extends BST {

    int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + countOfNodes(root.left) + countOfNodes(root.right);
    }

    public static void main(String[] args) {
        CountNodes tree = new CountNodes();
//        tree.populateFromArray(new int[]{8, 4, 12, 2, 6, 10, 14, 1, 3, 5, 7, 9, 11, 13, 15});
        tree.populateRandom(11);
        System.out.println("\nans = " + tree.countOfNodes(tree.root));

    }
}
