package com.datastructure.linkedlist.problems.singly;

import com.datastructure.linkedlist.SinglyLinkedList;

public class CheckPalindrome extends SinglyLinkedList {

    Node reverseLinkedList(Node head) {
        Node i0 = null, i1 = head, i2 = null;
        while (i1 != null) {
            i2 = i1.next;
            i1.next = i0;
            i0 = i1;
            i1 = i2;

        }
        head = i0;
        return i0;
    }

    void checkForPalindrome() {
        Node fast = head, slow = head, prev = null, sprev = null;

        while (fast != null && fast.next != null) {
            prev = fast.next;
            fast = fast.next.next;
            sprev = slow;
            slow = slow.next;
        }
        sprev.next = reverseLinkedList(slow);

//        compare
        slow = head;
        fast = sprev.next;
        while (fast.next != null) {
            if (slow.data != fast.data) {
                System.out.println("Not a palindrome");
                return;
            }
            slow = slow.next;
            fast = fast.next;
        }
        System.out.println("Is a palindrome!");


    }

    public static void main(String[] args) {
        CheckPalindrome l1 = new CheckPalindrome();

        l1.populate();
        for (int i = 9; i >= 0; i--) {
            l1.add(i);
        }
        l1.add(4);
        l1.print();
        l1.checkForPalindrome();

        l1.print();
    }

}
