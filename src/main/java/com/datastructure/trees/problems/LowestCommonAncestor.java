package com.datastructure.trees.problems;

import com.datastructure.trees.BST;

public class LowestCommonAncestor extends BST {

    /*
    * If the root is null or either of the given nodes, return the root.
    Recursively find the lowest common ancestor in the left and right subtrees.
    If both left and right subtrees return a non-null value, the current root is the lowest common ancestor; otherwise, return the non-null subtree result or null if both are null.
    This approach efficiently searches for the lowest common ancestor in a binary tree by traversing the tree recursively and considering the properties of the given nodes.
    * */

    Node lowestCommonAncestor(Node root, Node n1, Node n2) {
        if (root == null) {
            return null;
        }
        if (root == n1 || root == n2) {
            return root;
        }

        Node left_lca = lowestCommonAncestor(root.left, n1, n2);
        Node right_lca = lowestCommonAncestor(root.right, n1, n2);

        if (left_lca != null && right_lca != null) {
            return root;
        }
        if (left_lca != null) {
            return left_lca;
        }
        return right_lca;

    }

    public static void main(String[] args) {
        LowestCommonAncestor t1 = new LowestCommonAncestor();
        t1.populateRandom(10);
        Node ans = t1.lowestCommonAncestor(t1.root, t1.root.left, t1.root.right);
        System.out.println(ans.data);
    }
}
