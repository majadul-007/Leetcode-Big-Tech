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

    public ListNode reverse(ListNode head) {

//check if head is null return the head then

        if (head == null) {
            return head;
        }



        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        while (curr != null) {

            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;


        }

        return prev;


    }



    public int pairSum(ListNode head) {

        //res for track the maximum sum

        int res = Integer.MIN_VALUE;


        ListNode slow = head;
        ListNode fast = head;

        //get the mid value after fast reached to null

        while (fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;
        }

//calling the method and reverse second half

        ListNode prev = reverse(slow);

        ListNode head1 = head, head2 = prev; //head1 point to first half and head2 to second half

//loop till second half reached to null

        while (head2 != null) {
    
            res = Math.max(res, head1.val + head2.val); //compare first half head and second half head
            head1 = head1.next;
            head2 = head2.next;

        }

        return res;



    }
}