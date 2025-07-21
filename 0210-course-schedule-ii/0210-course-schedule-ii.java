class Solution {

    public boolean dfs(ArrayList<Integer>[] graph, int scr, int[] vis, ArrayList<Integer> topo){

        vis[scr] = 1;

        for(int nbr: graph[scr]){
            if (vis[nbr] == 0){
                boolean cycle = dfs(graph, nbr, vis, topo);
                if(cycle)
                    return true;

            }else if(vis[nbr] == 1){
                
                    return true;

            }
        }

        vis[scr] = 2;
        topo.add(scr);
        return false;
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {

        ArrayList<Integer>[] graph = new ArrayList[numCourses]; //Array of ArrayLists

        for(int i = 0; i < numCourses; i++){
            graph[i] = new ArrayList<>();
        }

        int[] vis = new int[numCourses];
        ArrayList<Integer> topo = new ArrayList<>();

        for(int[] edge: prerequisites){
            int a = edge[0];
            int b = edge[1];

            graph[b].add(a);
        }

        for(int i = 0; i < numCourses; i++){
            if(vis[i] == 0){
                boolean cycle = dfs(graph, i, vis, topo);
                if(cycle)
                    return new int[]{};
            }
            
        }

        int[] ans = new int[numCourses];
        for(int i = 0; i < ans.length; i++){
            ans[i] = topo.get(numCourses-i-1);
        }

        return ans;
    }
}
