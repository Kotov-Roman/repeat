package leetcode.algorithms.linkedLists;

import leetcode.helpers.ListNode;

import java.util.List;

//Reverse Linked List
//https://leetcode.com/problems/reverse-linked-list/
public class RevertLinkedList {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);
        ListNode result = ListNode.createLinkedList(integers);
        result.printList();

        ListNode head1 = new ListNode(1);
        ListNode h1n2 = new ListNode(2);
        ListNode h1n3 = new ListNode(3);
        head1.next = h1n2;
        h1n2.next = h1n3;

        ListNode reverted = reverseList(head1);

        reverted.printList();
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        //        {1->2->3->4->5}

        ListNode current = head;
        ListNode previous = null;
        ListNode next;
        while (current.next != null) {
            next = current.next;

            current.next = previous;
            previous = current;

            current = next;
        }
        current.next = previous;

        return current;
    }

}


