package com.datastructure.linkedlist.problems.singly;

import com.datastructure.linkedlist.SinglyLinkedList;

public class DeleteGivenNode extends SinglyLinkedList {

    void deleteGivenNodeFromLL(Node currNode) {
        while (currNode != null && currNode.next != null) {
            currNode.data = currNode.next.data;
            if (currNode.next.next == null) {
                currNode.next = null;
            } else {
                currNode = currNode.next;
            }
        }
    }

    public static void main(String[] args) {
        DeleteGivenNode l1 = new DeleteGivenNode();
        l1.populate();
        l1.print();
        l1.deleteGivenNodeFromLL(l1.head.next.next);
        l1.print();

    }
}
