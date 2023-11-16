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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {



//dummy node

        ListNode temp = new ListNode(0);

        ListNode curr = temp;


//check untill list1 and list2 is null

        while (list1 != null && list2 != null) {


//if list1 value less or equal to list2 then move the current pointer to list1 and move list1 to next  value

            if (list1.val <= list2.val) {

                curr.next = list1;
                list1 = list1.next;
            }

//if list2 value less or equal to list1 then move the current pointer to list2 and move list2 to next  value
            else {
                
                curr.next = list2;
                list2 = list2.next;
            }

            curr = curr.next;

        }

//check the remaining list if any list has values then put it to last;

        curr.next = list1 != null ? list1 : list2;

        return temp.next;

    }
}