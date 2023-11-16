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
    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> myQ = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();

        if (root != null) {
            myQ.offer(root);
        }



        while (!myQ.isEmpty()) {

            List<Integer> level = new ArrayList<>();
            int size = myQ.size();

            for (int i = 0; i < size; i++) {

                TreeNode node = myQ.poll();

                level.add(node.val);

                if (node.left != null) {

                    myQ.offer(node.left);
                }
                if (node.right != null) {

                    myQ.offer(node.right);
                }



            }
            res.add(level);
        }

        return res;


    }
}