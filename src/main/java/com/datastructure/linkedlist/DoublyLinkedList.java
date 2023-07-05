package com.datastructure.linkedlist;

import java.util.Random;

public class DoublyLinkedList {
    public static class Node {
        public int data;
        public Node next;
        public Node prev;
    }

    public Node head;
    public Node tail;

    public void add(int data) {
        Node node = new Node();
        node.data = data;
        tail = node;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }

            n.next = node;
            node.prev = n;
        }
    }

    public void print() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + "-> ");
            n = n.next;
        }
        System.out.println();
    }

    public void printReverse() {
        Node n = tail;
        while (n != null) {
            System.out.print(n.data + "<- ");
            n = n.prev;
        }
        System.out.println();
    }

    public void populate() {
        for (int i = 0; i < 10; i++) {
            add(i);
        }
    }

    public void populate(int start, int end) {
        for (int i = start; i < end; i++) {
            add(i);
        }
    }

    public void populateRandom(int size) {
        for (int i = 0; i < size; i++) {
            add(new Random().nextInt(1000));
        }
    }

}
