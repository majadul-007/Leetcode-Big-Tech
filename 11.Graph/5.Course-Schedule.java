class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<List<Integer>> adj = new ArrayList<>();

        // add empty array list for each course
        for (int i = 0; i < numCourses; i++) {

            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < prerequisites.length; i++) {

            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        // visited array for keep tracking

        int[] vis = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {

            if (vis[i] == 0) {

                if (isCycle(adj, vis, i)) {
                    return false; // if its cycle the return false
                }
            }
        }

        return true;

    }

    public boolean isCycle(List<List<Integer>> adj, int[] vis, int curr) {

        if (vis[curr] == 2) {
            return true;
        }

        vis[curr] = 2;

        for (int i = 0; i < adj.get(curr).size(); i++) {

            if (vis[adj.get(curr).get(i)] != 1) {

                // check neighbour has cycle or not
                if (isCycle(adj, vis, adj.get(curr).get(i))) {

                    return true;
                }
            }
        }

        vis[curr] = 1;

        return false;
    }
}
