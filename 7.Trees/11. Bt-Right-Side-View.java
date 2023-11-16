/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {

//arraylist for keep tracking right side value

        List<Integer> list = new ArrayList<Integer>();

        Queue<TreeNode> myQ = new LinkedList<>();

//push the root value to queue

        if (root != null) {
            myQ.offer(root);
        }


        while (!myQ.isEmpty()) {

            int size = myQ.size();  //get the size of the queue

            
            for (int i = 0;i < size; i++) {

                TreeNode curr = myQ.poll();

//add the right most element
                if (i == 0) {
                    list.add(curr.val);
                }

//make sure that we first put right most element
                if (curr.right != null) {

                    myQ.offer(curr.right);
                }

                if (curr.left != null) {
                    myQ.offer(curr.left);
                }

            }


        }

        return list;
    }
}