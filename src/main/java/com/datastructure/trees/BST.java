package com.datastructure.trees;

import java.util.Random;

public class BST {
    public class Node {
        public int data;
        public Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public Node root;

    Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);

        } else {
            if (root.data >= data) {
                root.left = insert(root.left, data);
            } else {
                root.right = insert(root.right, data);
            }

        }
        return root;

    }

    public void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public void populateRandom(int size) {
        for (int i = 0; i < size; i++) {
            int n = new Random().nextInt(100);
            System.out.println(n + " ");
            root = insert(root, n);
        }
    }

    public void populateFromArray(int[] arr) {
        System.out.print("\nInput = ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            root = insert(root, arr[i]);
        }
    }


    public static void main(String[] args) {
        BST bst1 = new BST();
        bst1.populateRandom(10);
        bst1.inorder(bst1.root);
    }
}
