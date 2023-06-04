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
    public void reorderList(ListNode head) {


//Fast and slow pointer for getting the mid value


        ListNode fast = head;
        ListNode slow = head;


        while (fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;
        }

//reverse the second half

        ListNode mid = slow;
        ListNode curr = mid;
        ListNode prev = null;
        ListNode next = null;

        while (curr != null) {

            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }


        ListNode l1 = head, l2 = prev;

//loop until l2 is not null


        while (l2.next != null) {

            ListNode temp = l1.next; //store the l1 next node in temp
            l1.next = l2; //point l1 next to l2 head
            l1 = temp;  //shift the l1 pointer to temp

            ListNode temp2 = l2.next;
            l2.next = l1;
            l2 = temp2;
        }



    }
}