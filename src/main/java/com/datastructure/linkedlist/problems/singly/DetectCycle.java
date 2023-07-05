package com.datastructure.linkedlist.problems.singly;

import com.datastructure.linkedlist.SinglyLinkedList;

public class DetectCycle extends SinglyLinkedList {

    DetectCycle() {
        super();
    }

    void createCycle() {

        Node i = head;
        Node j = head;
        i = i.next.next.next;
        while (j.next != null) {
            j = j.next;
        }
        j.next = i;
    }

    Node detectCycle() {
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                System.out.println("Cycle exist");
                return slow;
            }
        }
        System.out.println("Cycle does not exist");
        return null;
    }

    void removeCycle() {
        Node meet = detectCycle();
        if (meet != null) {
            Node start = head;
            Node prev = null;
            while (start != meet) {
                prev = meet;
                start = start.next;
                meet = meet.next;
            }
            prev.next = null;
            System.out.println(meet.data);
        }
    }


    public static void main(String[] args) {
        DetectCycle l1 = new DetectCycle();
        for (int i = 0; i < 10; i++) {
            l1.add(i);
        }
        l1.print();
        l1.createCycle();
        l1.removeCycle();
        l1.print();
    }
}
