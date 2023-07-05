package com.datastructure.linkedlist.problems.singly;

import com.datastructure.linkedlist.SinglyLinkedList;

public class RemoveNthNode extends SinglyLinkedList {
    void removeNthNodefromEOL(int n) {
        Node fast = head;
        Node slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
    }

    public static void main(String[] args) {
        RemoveNthNode l1 = new RemoveNthNode();
        l1.populate();
        l1.print();
        l1.removeNthNodefromEOL(3);
        l1.print();
    }
}
