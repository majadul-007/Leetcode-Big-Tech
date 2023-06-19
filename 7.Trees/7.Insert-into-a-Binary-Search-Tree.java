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
    public TreeNode insertIntoBST(TreeNode root, int val) {

        //check if root is null

        if (root == null) {

            return new TreeNode(val);
        }

//it's a bst so left subtree always less than root and right will be higher than root
//check if val is less or greater than root

        if (val > root.val) {


            root.right = insertIntoBST(root.right, val); //recursively insert into right subtree
        
        } else {

            root.left = insertIntoBST(root.left, val); //recursively insert into left subtree
        }

        return root;

    }
}