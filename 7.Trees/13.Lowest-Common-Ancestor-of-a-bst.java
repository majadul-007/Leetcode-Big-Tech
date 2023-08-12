/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {


        if (root == null) {
            return null;
        }

        TreeNode curr = root;

        //if p & q are both greater than root than it should be on right side

        if (p.val > curr.val && q.val > curr.val) {

            return lowestCommonAncestor(root.right, p, q);
        }
        //if p & q are both less than root than it should be on left side

        else if (p.val < curr.val && q.val < curr.val) {

            return lowestCommonAncestor(root.left, p, q);

        }
        return root;



    }
}