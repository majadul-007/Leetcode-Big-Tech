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
  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

    List<List<Integer>> zigzag = new ArrayList<>();

    if (root == null) {

      return zigzag;

    }

//queue for holding the node value


    Queue<TreeNode> myQ = new LinkedList<>();
    myQ.add(root);


//stack for holding the value which need to reversed

    Stack<Integer> reverseSt = new Stack<>();
    boolean flag = false;


    while (!myQ.isEmpty()) {

      int size = myQ.size();

      List<Integer> level = new ArrayList<>();


      for (int i = 0; i < size; i++) {

        TreeNode node = myQ.poll();


        if (flag) { //if flag is true then it should reversed

          reverseSt.push(node.val);
        } else {
          level.add(node.val); //else add to level
        }


//check current node if it has left and right child and added to queue

        if (node.left != null) {

          myQ.add(node.left);
        }

        if (node.right != null) {
          myQ.add(node.right);
        }

      }

      flag = !flag; //shift the flag for zigzag traversal


//pop out value from stack added to level
      while (!reverseSt.isEmpty()) {

        level.add(reverseSt.pop());
      }

      zigzag.add(level);



    }

    return zigzag;




  }
}