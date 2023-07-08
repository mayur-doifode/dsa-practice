package com.datastructure.trees.problems;

import com.datastructure.trees.BST;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder extends BST {
    Queue<Node> tempQueue = new LinkedList<>();

    /*
    The approach uses a queue to perform level order traversal on a binary tree.
    It starts with the root node in the queue, then iteratively dequeues nodes, prints their data, and enqueues their left and right children.
     A null node is added to the queue after each level to mark the end of that level. The process continues until all nodes have been traversed.
     */
    void performLevelOrder() {
        Node n = tempQueue.poll();

        if (n == null) {
            System.out.println();
            tempQueue.add(null);
            if (tempQueue.peek() == null) {
                return;
            } else {
                n = tempQueue.poll();
            }
        }

        System.out.print(n.data + " ");
        if (n.left != null) {
            tempQueue.add(n.left);
        }
        if (n.right != null) {
            tempQueue.add(n.right);
        }
        performLevelOrder();


    }


    public static void main(String[] args) {
        LevelOrder lo1 = new LevelOrder();
        lo1.populateFromArray(new int[]{8, 4, 12, 2, 6, 10, 14, 1, 3, 5, 7, 9, 11, 13, 15});
        System.out.print("\nInorder = ");
        lo1.inorder(lo1.root);
        System.out.println("\n");

        lo1.tempQueue.add(lo1.root);
        lo1.tempQueue.add(null);
        lo1.performLevelOrder();


    }
}
