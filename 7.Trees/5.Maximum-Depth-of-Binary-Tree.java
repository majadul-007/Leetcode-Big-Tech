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
  public int maxDepth(TreeNode root) {

    //if root is null

    if (root == null) {
      return 0;
    }



//queue ds for treenode

    Queue<TreeNode> queue = new LinkedList<>();


//add root to queue
    queue.add(root);

    int levels = 0;

//loop until queue is empty

    while (!queue.isEmpty()) {


      levels++; //update the level

      int size = queue.size();

//for loop for traversing queue

      for (int i = 0; i < size; i++) {

//pop the current node
        TreeNode currNode = queue.poll();

//check if current node has left or right child then add to queue

        if (currNode.left != null) {

          queue.add(currNode.left);
        }
        if (currNode.right != null) {

          queue.add(currNode.right);
        }
      }


    }


    return levels;
  }
}