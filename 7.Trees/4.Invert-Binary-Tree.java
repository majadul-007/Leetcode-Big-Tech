

//Recursive approach

class Solution {
    public TreeNode invertTree(TreeNode root) {



//check if root is null

        if (root == null) {

            return null;
        }

//store the left subtree in left sub tree
//store the right subtree in right data type

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

//swap the root left value right
//swap the root right value left

        root.left = right;
        root.right = left;


        return root;





    }
}