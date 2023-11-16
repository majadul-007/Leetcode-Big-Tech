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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        //check if head or next of head is null

        if(head ==null || head.next == null){
            
            return null;
        }


        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy, second = dummy;

 
        while(n>=0){

            second = second.next;
            n--;
        }
        
//move untill second is not null
        while(second != null){
            second = second.next;
            first = first.next; //first will point node which is before nth node
        }

        first.next = first.next.next; //point first node pointer to next of next node

        return dummy.next;


        
    }
}