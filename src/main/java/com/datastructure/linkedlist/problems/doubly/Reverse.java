package com.datastructure.linkedlist.problems.doubly;

import com.datastructure.linkedlist.DoublyLinkedList;

public class Reverse extends DoublyLinkedList {

    void reverse() {
        Node curr = head, prev = null;

        while (curr != null) {
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            curr = curr.prev;
        }
        head = prev.prev;
    }

    public static void main(String[] args) {
        Reverse rev1 = new Reverse();
        rev1.populate();
        rev1.reverse();
        rev1.print();
        rev1.printReverse();
    }
}
