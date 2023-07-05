package com.datastructure.linkedlist.problems.singly;

import com.datastructure.linkedlist.SinglyLinkedList;

public class FindMiddle extends SinglyLinkedList {
    public void findMiddleNode() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println(slow.data);
    }

    public static void main(String[] args) {
        FindMiddle l1 = new FindMiddle();
        l1.populate();
        l1.print();
        l1.findMiddleNode();
    }

}
