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
    public ListNode reverseList(ListNode head) {

        //initialize stack
        Stack<Integer> mystack = new Stack<>();


//loop through till last of the linked list
//push each value on stack and move the head to point next
        
        while(head != null){
            mystack.push(head.val);
            head = head.next;
            
        }

//create reveresedlist node
//create a ptr pointer to point head of rlist

        ListNode rList = new ListNode();
        ListNode ptr = rList;

//loop through till mystack is empty
        while(!mystack.isEmpty()){

//put ptr=rlist next value to the last of mystack
           ptr.next = new ListNode(mystack.pop());
           ptr = ptr.next;


        }

        return rList.next;




        
    }
}