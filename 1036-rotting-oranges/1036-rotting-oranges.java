class Solution {
    public int orangesRotting(int[][] grid) {

        int freshOrange = 0;

        int n = grid.length;
        int m = grid[0].length;

        LinkedList<Integer> que = new LinkedList<>();

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1)
                    freshOrange++;
                else if(grid[i][j] == 2){
                    que.addLast(i*m+j);
                }
            }
        }

        if(freshOrange == 0) return 0;

        int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};

        int level = 0;

    
        while(que.size() > 0){
            int size = que.size();
            while(size-- > 0){

                int idx = que.removeFirst();

                int i = idx/m;
                int j = idx%m;

                for(int[] dir: dirs){
                    int x = i + dir[0];
                    int y = j + dir[1];

                    if(x >= 0 && y >= 0 && x < n && y < m && grid[x][y]==1){
                        grid[x][y] = 2;
                        freshOrange--;

                        if(freshOrange == 0){
                            return level+1;
                        }
                        que.addLast(x*m+y);
                        
                    }
                }
            }
            level++;
        }
        return -1;
    }
}