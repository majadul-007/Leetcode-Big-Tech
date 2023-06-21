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
    public boolean isSameTree(TreeNode p, TreeNode q) {


//if p & q both are null that means both are same
        if (p == null && q == null) {

            return true;
        }


//if any of the Treenode is null and other is not null then tree's are not same
        if (p == null || q == null) {
            return false;
        }

//if p & q value is not different then tree's are not same

        if (p.val != q.val) {
            return false;
        }

        //check the leftsubtree and rightsubtreee recursively

        boolean leftSubtree = isSameTree(p.left, q.left);
        boolean rightSubtree = isSameTree(p.right, q.right);

        return leftSubtree && rightSubtree;



    }
}