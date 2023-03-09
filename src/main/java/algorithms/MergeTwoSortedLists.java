package algorithms;

//https://leetcode.com/problems/merge-two-sorted-lists/
public class MergeTwoSortedLists {

    public static void main(String[] args) {
//        ListNode head1 = null;
        ListNode head1 = new ListNode(1);
        ListNode h1n2 = new ListNode(2);
        ListNode h1n3 = new ListNode(4);
        head1.next = h1n2;
        h1n2.next = h1n3;

        ListNode head2 = null;
//        ListNode head2 = new ListNode(1);
        ListNode h2n2 = new ListNode(3);
        ListNode h2n3 = new ListNode(4);
        head2.next = h2n2;
        h2n2.next = h2n3;

        ListNode listNode = mergeTwoLists(head1, head2);

        while (listNode != null) {
            System.out.print(listNode.val + ", ");
            listNode = listNode.next;
        }

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head;
        ListNode anotherListNode = null;
        //just return another list if one of them is null
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        // let's find head then
        else if (list1.val < list2.val) {
            head = list1;
            anotherListNode = list2;
        } else {
            head = list2;
            anotherListNode = list1;
        }

        ListNode currentListNode = head;

        while (currentListNode.next != null && anotherListNode != null) {
            if (currentListNode.next.val < anotherListNode.val) {
                // skip to next node and repeat
                currentListNode = currentListNode.next;
            } else {
                // means that next node should be from another list, reassign references and keep assign part of current list to another list
                ListNode tmp = currentListNode.next;
                currentListNode.next = anotherListNode;
                currentListNode = currentListNode.next;
                anotherListNode = tmp;
            }
        }

        if (anotherListNode != null) {
            //then means that currentListNode.next is null, and it is needed to append tail of another list
            currentListNode.next = anotherListNode;
        }

        return head;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }
}
