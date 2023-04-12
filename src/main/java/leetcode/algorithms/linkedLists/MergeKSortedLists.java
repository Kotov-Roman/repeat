package leetcode.algorithms.linkedLists;

import leetcode.helpers.ListNode;

import java.util.List;

//not the fastest solution, but it works
//https://leetcode.com/problems/merge-k-sorted-lists/description/
public class MergeKSortedLists {

    public static void main(String[] args) {
        ListNode first = ListNode.createLinkedList(List.of(1, 3, 5));
        ListNode second = ListNode.createLinkedList(List.of(2, 4, 6));
        new MergeKSortedLists().mergeKLists(new ListNode[]{first, second});
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode resultHead = null;
        ListNode resultPointer = null;
        ListNode currentLeast = null;

        boolean atLeastOneIsNotNull = false;
        if (lists == null || lists.length == 0) {
            return null;
        }

        for (ListNode list : lists) {
            if (list != null) {
                atLeastOneIsNotNull = true;
            }
        }

        if (!atLeastOneIsNotNull) {
            return null;
        }

        int indexWhereToMovePointer = -1;

        //let's find head
        while (atLeastOneIsNotNull) {
            atLeastOneIsNotNull = false;
            for (int index = 0; index < lists.length; index++) {
                ListNode listPointer = lists[index];
                if (listPointer == null) {
                    continue;
                }

                atLeastOneIsNotNull = true;

                //find least
                if (currentLeast == null || currentLeast.val >= listPointer.val) {
                    currentLeast = listPointer;
                    indexWhereToMovePointer = index;
                }
            }
            if (currentLeast == null) {
                //means that least was not found, cuz all pointers are null
//                resultHead.printList();
                return resultHead;
            }
            //move pointer when the least was found
            lists[indexWhereToMovePointer] = currentLeast.next;
            if (resultHead == null) {
                resultPointer = currentLeast;
                resultHead = resultPointer;
            } else {
                resultPointer.next = currentLeast;
                resultPointer = resultPointer.next;
            }
            currentLeast = null;
        }

        return null;
    }
}
