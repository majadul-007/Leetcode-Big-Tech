class Solution {
    // Function to return Breadth First Traversal of given graph.

    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

        // Code here



        ArrayList <Integer> bfs = new ArrayList < >();
        boolean visited[] = new boolean[V];

        Queue<Integer> myQ = new LinkedList <>();



        myQ.add(0);
        visited[0] = true;


        while(!myQ.isEmpty()){

            Integer node = myQ.poll();
            bfs.add(node);

            for(Integer it: adj.get(node)){

                if(visited[it] == false){

                    visited[it] = true;
                    myQ.add(it);


                }
            }
        }

        return bfs;
    }
}