/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {

        //check if head or head.next null or not

        if (head == null || head.next == null) {
            return head;

        }

        ListNode fast = head;
        ListNode slow = head;

        // temp node for keep tracking the end node of first half
        ListNode temp = null;


        while (fast != null && fast.next != null) {

            temp = slow;
            fast = fast.next.next;
            slow = slow.next;
        }

        temp.next = null; //point the first half last node to null for spliting

        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);


        return mergeList(l1, l2);



    }


    ListNode mergeList(ListNode head1, ListNode head2) {

        ListNode dummy = new ListNode(0);

        ListNode curr = dummy;

//loop through until head1 & head2 is not null
        while (head1 != null && head2 != null) {

            if (head1.val <= head2.val) {

                curr.next = head1; //update next of curr to head1 value
                head1 = head1.next; //update the pointer to point next head1 value
            } else {

                curr.next = head2;
                head2 = head2.next;
            }

            curr = curr.next;
        }

        curr.next = head1 != null ? head1 : head2; //check if head1 has any left values or not

        return dummy.next;


    }
}