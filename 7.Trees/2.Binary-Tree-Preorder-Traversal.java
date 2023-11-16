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
        public List<Integer> preorderTraversal(TreeNode root) {


//Stack for treeNode data type

                Stack<TreeNode> st = new Stack<>();
                ArrayList<Integer> pre = new ArrayList<>();


//Storing the root value in curr

                TreeNode curr = root;


                while (curr != null || !st.isEmpty()) {

//if current node has children
                        if (curr != null) {

                                pre.add(curr.val);
                                st.push(curr.right);
                                curr = curr.left;


                        }

//if current node has no children
                        else {

                                curr = st.pop();
                        }

                }

                return pre;

        }
}