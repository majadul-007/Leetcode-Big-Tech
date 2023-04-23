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
    public boolean isPalindrome(ListNode head) {

        //initialize fast and slow pointer and pointing to head

        ListNode fast = head;
        ListNode slow = head;

        //loop through when fast is not null and fast next is not null

        while (fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;


        }
        //point the slow pointer to reversed half list;
        //point fast pointer to head;

        slow = reverseList(slow);
        fast = head;

       //check while slow pointer is no null
        while (slow != null) {

            //check fast and slow pointer value and return false if not match

            if (fast.val != slow.val) {
                return false;
            } else {

                //if match then move the pointer to last
                fast = fast.next;
                slow = slow.next;

            }

        }
        return true;

    }


    ListNode reverseList(ListNode head) {

        ListNode prev = null;

        ListNode next = null;

//move till last
        while (head != null) {

            next = head.next;
            head.next = prev;

            prev = head;
            head = next;

        }
        return prev;
    }



}
