/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {

    HashMap<Integer, Node> myMap = new HashMap<>();

    public Node cloneGraph(Node node) {


        //checking node is null or not

        if (node == null) {
            return null;
        }

        if (myMap.containsKey(node.val)) {
            return myMap.get(node.val);
        }

        Node newNode = new Node(node.val, new ArrayList<Node>());

        myMap.put(node.val, newNode);

//loop through node neighbours

        for (Node neighbor : node.neighbors) {

            newNode.neighbors.add(cloneGraph(neighbor)); //add to new node and apply dfs to the nighbour
        }

        return newNode;

    }
}
