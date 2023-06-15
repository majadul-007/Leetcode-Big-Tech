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
    public ListNode middleNode(ListNode head) {

        //iniatialize fast and slow pointer

        ListNode fast = head;
        ListNode slow = head;

//check if fast and fast.next is not null

        while(fast!= null && fast.next != null){

//move fast pointer 2 step ahead and slow one step

            fast = fast.next.next;
            slow = slow.next;
        }

//when the fast pointer reach before null the slow will be in the middle return slow

        return slow;


        
        
    }
}