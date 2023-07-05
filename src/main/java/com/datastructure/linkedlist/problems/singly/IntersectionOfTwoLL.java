package com.datastructure.linkedlist.problems.singly;

import com.datastructure.linkedlist.SinglyLinkedList;

import java.util.Random;

public class IntersectionOfTwoLL extends SinglyLinkedList {
    public void appendIntersection(IntersectionOfTwoLL intersectingList) {
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        n.next = intersectingList.head;
    }

    static void findIntersectionOfTwoLL(Node head1, Node head2) {
        Node intersectingNode = null;
        Node a = head1, b = head2;
//        Loop 1
        while (a != b) {

            if (a == null) {
                a = head2;
            } else if (b == null) {
                b = head1;
            }
            a = a.next;
            b = b.next;
        }
        if (a != null) {
            System.out.println(a.data);
        } else {
            System.out.println("NULL");
        }


    }

    public static void main(String[] args) {
        IntersectionOfTwoLL list1 = new IntersectionOfTwoLL();
        IntersectionOfTwoLL list2 = new IntersectionOfTwoLL();
//        IntersectionOfTwoLL intersectingList = new IntersectionOfTwoLL();
        list1.populateRandom(new Random().nextInt(12));

        list2.populateRandom(new Random().nextInt(21));
//        intersectingList.populateRandom(6);

//        list1.appendIntersection(intersectingList);
//        list2.appendIntersection(intersectingList);
        list1.print();
        list2.print();
//        intersectingList.print();

        findIntersectionOfTwoLL(list1.head, list2.head);


//        System.out.println(new IntersectionOfTwoLL().findIntersectionOfTwoLL(list1.head, list2.head).data);


    }

}
