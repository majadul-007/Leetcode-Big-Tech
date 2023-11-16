
//************************Recursive Approach********************

class Solution {

    public TreeNode invertTree(TreeNode root) {



//check if root is null

        if (root == null) {

            return null;


        }

//store the left subtree in left node


        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

//swap the root left value right
//swap the root right value left

        root.left = right;
        root.right = left;




        return root;

        


//************************Iterative Approach*********************


        if (root == null) {
            return root;
        }

//initializing queue

        Queue<TreeNode> myQ = new LinkedList();

//add the root value

        myQ.add(root);



//iterate untill queue is empty

        while (!myQ.isEmpty()) {

//get first value from queue then swap the left and right child


            TreeNode node = myQ.poll();

            TreeNode temp = node.left;

            node.left = node.right;
            node.right = temp;


//if node has any child left then add it to queue

            if (node.left != null) {
                myQ.add(node.left);
            }
            if (node.right != null) {
                myQ.add(node.right);
            }




        }

        return root;





    }
}