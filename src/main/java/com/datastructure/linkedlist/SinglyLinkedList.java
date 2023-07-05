package com.datastructure.linkedlist;


import java.util.Random;

public class SinglyLinkedList {

    public static class Node {
        public int data;
        public Node next;
    }

    public Node head;

    public void add(int data) {
        Node node = new Node();
        node.data = data;
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
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
