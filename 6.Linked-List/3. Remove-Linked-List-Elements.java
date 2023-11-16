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
    public ListNode removeElements(ListNode head, int val) {



//creating dummy Node

        ListNode dummy = new ListNode();

//pointing dummy next node to head
        dummy.next = head;

        ListNode currNode = dummy;

//check till the dummynode is not null;

        while (currNode.next != null) {

//if current pointer value is same as val then move the pointer to second next element
            if (currNode.next.val == val) {

                currNode.next = currNode.next.next;
            }
//if not equal then move the pointer to next element first it was dummy then point to first element
            else {
                currNode = currNode.next;
            }


        }

        return dummy.next;



    }
}