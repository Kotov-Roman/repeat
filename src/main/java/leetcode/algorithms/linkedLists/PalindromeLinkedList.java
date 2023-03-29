package leetcode.algorithms.linkedLists;

import leetcode.algorithms.linkedLists.helpers.ListNode;

import java.util.List;

//https://leetcode.com/problems/palindrome-linked-list/
public class PalindromeLinkedList {
    public static void main(String[] args) {

        List<Integer> integers = List.of(1, 2, 3, 4 );
        ListNode head = ListNode.createLinkedList(integers);
        head.printList();

        ListNode middle = findMiddle(head);
        middle.printList();
    }

    public static ListNode findMiddle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next!=null && fast.next.next!=null){
            slow= slow.next;
            fast = fast.next.next;
        }
        return slow.next;
    }

}
