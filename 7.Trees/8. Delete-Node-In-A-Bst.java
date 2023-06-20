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
    public TreeNode deleteNode(TreeNode root, int key) {

        //check if root is null

        if (root == null) {
            return root;
        }


//if key is greater the root then the value is in right subtree else left subtree

        if (key > root.val) {

            root.right = deleteNode(root.right, key); //traverse right subtree recursively
        } else if (key < root.val) {

            root.left = deleteNode(root.left, key); //traverse left subtree recursivley
        } else {

//if root left is null then return root right otherwise root right

            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
//if node has both left and right subtree then point curr node root.right

                TreeNode curr = root.right;

                while (curr.left != null) {

                    curr = curr.left;
                }

                root.val = curr.val;
                root.right = deleteNode(root.right, root.val);
            }





        }
        return root;
    }
}