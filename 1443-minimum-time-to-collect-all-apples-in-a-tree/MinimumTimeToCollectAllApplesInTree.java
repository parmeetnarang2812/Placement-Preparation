/* class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        int[] parentOf = new int[n];
        for (int i = 0; i < n; i++) {
            parentOf[i] = -2;
        }
        parentOf[0] = -1;
        boolean[] visited = new boolean[n];
        int time = 0;
        for (int[] edge : edges) {
            if (parentOf[edge[0]] == -2) {
                parentOf[edge[0]] = edge[1];

            } else {
                parentOf[edge[1]] = edge[0];
            }
        }
        for (int i = 0; i < n; i++) {
            int node = i;
            if (hasApple.get(i)) {
                while (node != 0 && !visited[node]) {
                    visited[node] = true;
                    node = parentOf[node];
                    time += 2;
                }
            }
        }
        return time;
    }
} */