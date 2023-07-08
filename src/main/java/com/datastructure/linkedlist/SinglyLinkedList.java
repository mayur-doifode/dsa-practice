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
            add(new Random().nextInt(100));
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();

        // Populating the linked list with numbers from 0 to 9
        linkedList.populate();

        // Printing the initial state of the linked list
        System.out.print("Linked List: ");
        linkedList.print();

        // Adding a new node with data 10 to the end of the linked list
        linkedList.add(10);

        // Printing the updated linked list
        System.out.print("Linked List after adding 10: ");
        linkedList.print();

        // Populating the linked list with numbers from 20 to 29
        linkedList.populate(20, 30);

        // Printing the updated linked list
        System.out.print("Linked List after populating from 20 to 29: ");
        linkedList.print();

        // Populating the linked list with random numbers
        linkedList.populateRandom(5);

        // Printing the updated linked list
        System.out.print("Linked List after populating with random numbers: ");
        linkedList.print();
    }
}
