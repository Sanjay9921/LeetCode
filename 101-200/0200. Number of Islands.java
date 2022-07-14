class Solution {
    public int numIslands(char[][] grid) {
        int result=0;
        int m = grid.length;
        int n = grid[0].length;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    result++;
                    DFS(i,j,m,n,grid);
                }
            }
        }
        
        return result;
    }
    
    public void DFS(int i, int j, int m, int n, char[][] grid){
        if(i<0 || j<0 || i>=m || j>=n || grid[i][j]=='0' || grid[i][j]=='x')
            return;
        
        grid[i][j] = 'x';
        
        DFS(i,j+1,m,n,grid);
        DFS(i,j-1,m,n,grid);
        DFS(i+1,j,m,n,grid);
        DFS(i-1,j,m,n,grid);
        
    }
}