
class Solution {
  public int diameterOfBinaryTree(TreeNode root) {

//map for storing the node and depth value

    Map<TreeNode, Integer> map = new HashMap<>();
    Stack<TreeNode> st = new Stack<>();
    int diameter = 0;



    if (root != null) {
      st.push(root);
    }


    while (!st.isEmpty()) {

//peek the top element of stack

      TreeNode node = st.peek();

//check if node left and right is not null and does not contain keys is map

      if (node.left != null && !map.containsKey(node.left)) {
        st.push(node.left);
      } else if (node.right != null && !map.containsKey(node.right)) {
        st.push(node.right);
      }

//if node left or right is null then pop it from stack get the left and right depth
      else {
        st.pop();

        int leftDepth = map.getOrDefault(node.left, 0);
        int rightDepth = map.getOrDefault(node.right, 0);
        // put the node value in map

        map.put(node, 1 + Math.max(leftDepth, rightDepth));

        diameter = Math.max(diameter, leftDepth + rightDepth); //get the diameter
      }


    }


    return diameter;
  }
}