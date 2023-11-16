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
    public List<Integer> inorderTraversal(TreeNode root) {

        //arraylist for store the inorder values

        ArrayList<Integer> res = new ArrayList<>();

        Stack<TreeNode>  mySt = new Stack<>();

        TreeNode node = root;

//check untill stack is not empty or node is not null

        while (!mySt.isEmpty() || node != null) {

//if node is not null then push it to stack and move pointer to left node

            if (node != null) {
                mySt.push(node);
                node = node.left;

//if node is null that means there aro no left subtree so pop it and add to res and move pointer to left
            } else {

                node = mySt.pop();
                res.add(node.val);
                node = node.right;

            }



        }
//return the res list

        return res;


    }
}