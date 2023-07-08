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
        tree.populateRandom(11);
        System.out.println("\nans = " + tree.countOfNodes(tree.root));

    }
}
