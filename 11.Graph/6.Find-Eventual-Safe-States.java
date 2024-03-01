class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {

        // res array for keep tracking ans
        List<Integer> res = new ArrayList<>();

        // map for tracking the truth/false value
        HashMap<Integer, Boolean> safeMap = new HashMap<>();

        // loop through each node and apply dfs

        for (int i = 0; i < graph.length; i++) {

            if (dfs(graph, i, safeMap)) {

                res.add(i);
            }
        }

        return res;

    }

    private boolean dfs(int[][] graph, int i, HashMap<Integer, Boolean> safeMap) {

        // check safeMap contains the value or not
        if (safeMap.containsKey(i)) {

            return safeMap.get(i);
        }

        safeMap.put(i, false); // if it doesn't contain then make it false

        for (int neigbour : graph[i]) { // check each neighbor of the node

            if (!dfs(graph, neigbour, safeMap)) {

                return false;
            }
        }

        // make the node true

        safeMap.put(i, true);

        return true;
    }
}