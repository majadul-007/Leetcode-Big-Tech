class Solution {



    private void dfs(int[][]ver, int i, boolean[] visited){
        
        
        for(int k=0; k<ver[i].length; k++){

            if(!visited[k] && ver[i][k] != 0){ //check k is not visited and vertex is not self directed

                visited[k] = true;
                dfs(ver, k, visited); //recursive approach
            }
        }
    }


    public int findCircleNum(int[][] isConnected) {

        int Vt = isConnected.length;
        boolean[] visited = new boolean[Vt];

        int cnt =0;

        for(int i=0; i<Vt; i++){

            if(!visited[i]){

                dfs(isConnected, i, visited);
                cnt++;
            }
        }

        return cnt;
        
    }
}