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
    public List<Integer> postorderTraversal(TreeNode root) {



//2 stacks s1 for traversing the tree and s2 for storing the postorder in reverse order

        Stack<TreeNode> s1 = new Stack<>();

        Stack<TreeNode> s2 = new Stack<>();

        ArrayList<Integer> res = new ArrayList<>();


        if (root == null) {
            return res;
        }


        s1.push(root);
        while (!s1.isEmpty()) {

            TreeNode node = s1.pop();
            s2.push(node);

//if node left has child then push it to s1 stack

            if (node.left != null) {

                s1.push(node.left);
            }
//if node right has child then push it to s1 stack

            if (node.right != null) {

                s1.push(node.right);
            }

        }

//pop the value from s2 stack from top and add to res

        while (!s2.isEmpty()) {

            res.add(s2.pop().val);
        }


        return res;

    }
}