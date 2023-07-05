package com.datastructure.linkedlist.problems.singly;

import com.datastructure.linkedlist.SinglyLinkedList;

public class ReverseLinkList extends SinglyLinkedList {


    void reverse() {
        Node current = head;
        Node next = null;
        Node prev = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }


    public static void main(String[] args) {
        ReverseLinkList l1 = new ReverseLinkList();
        for (int i = 0; i < 10; i++) {
            l1.add(i);
        }
        l1.print();
        l1.reverse();
        l1.print();


    }
}
