package com.datastructure.linkedlist.problems.singly;

import com.datastructure.linkedlist.SinglyLinkedList;

public class MergeSortedList extends SinglyLinkedList {
    static SinglyLinkedList mergeTwoSortedList(SinglyLinkedList l1, SinglyLinkedList l2) {
        Node i = l1.head;
        Node j = l2.head;
        SinglyLinkedList mergedList = new SinglyLinkedList();
        while (i != null && j != null) {
            if (i.data < j.data) {
                mergedList.add(i.data);
                i = i.next;
            } else {
                mergedList.add(j.data);
                j = j.next;
            }
        }
        while (i != null) {
            mergedList.add(i.data);
            i = i.next;
        }
        while (j != null) {
            mergedList.add(j.data);
            j = j.next;
        }

        return mergedList;

    }

    public static void main(String[] args) {
        SinglyLinkedList l1 = new SinglyLinkedList();
        SinglyLinkedList l2 = new SinglyLinkedList();
        l1.populate(1, 10);
        l1.print();
        l2.populate(10, 20);
        l2.print();
        SinglyLinkedList mergedList = mergeTwoSortedList(l1, l2);
        mergedList.print();

    }
}
