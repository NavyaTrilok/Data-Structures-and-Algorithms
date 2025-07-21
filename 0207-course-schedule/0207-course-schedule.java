class Solution {

    public boolean dfs(ArrayList<Integer>[] graph, int scr, int[] vis){

        vis[scr] = 1;

        for(int nbr: graph[scr]){
            if (vis[nbr] == 0){
                boolean cycle = dfs(graph, nbr, vis);
                if(cycle)
                    return true;

            }else if(vis[nbr] == 1){
                
                    return true;

            }
        }

        vis[scr] = 2;
        return false;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        ArrayList<Integer>[] graph = new ArrayList[numCourses]; //Array of ArrayLists

        for(int i = 0; i < numCourses; i++){
            graph[i] = new ArrayList<>();
        }

        int[] vis = new int[numCourses];

        for(int[] edge: prerequisites){
            int a = edge[0];
            int b = edge[1];

            graph[b].add(a);
        }

        for(int i = 0; i < numCourses; i++){
            if(vis[i] == 0){
                boolean cycle = dfs(graph, i, vis);
                if(cycle)
                    return false;
            }
            
        }
        return true;
    }
}