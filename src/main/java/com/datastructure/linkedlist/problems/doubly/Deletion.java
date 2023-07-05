package com.datastructure.linkedlist.problems.doubly;

import com.datastructure.linkedlist.DoublyLinkedList;

public class Deletion extends DoublyLinkedList {

    void delete(int value) {

        if (head == null) {
            return;
        }

        if (head.data == value) {
            head = head.next;
            head.prev = null;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            if (curr.data == value) {
                curr.prev.next = curr.next;
                curr.next.prev = curr.prev;
                return;
            }
            curr = curr.next;
        }
        if (curr.data == value) {
            curr.prev.next = null;
        }
    }

    public static void main(String[] args) {
        Deletion dl1 = new Deletion();
        dl1.populate();
        dl1.print();
        dl1.delete(5);
        dl1.delete(0);
        dl1.delete(9);
        dl1.print();
    }
}
