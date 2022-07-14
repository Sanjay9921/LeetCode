class Solution {
    
    int[][] matrix;
    int[][] helper;
    int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
    
    public int longestIncreasingPath(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        helper = new int[m][n];
        
        this.matrix = matrix;
        
        int path = 0;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                path = Math.max(path, dfs(i,j));
            }
        }
        
        return path;
    }
    
    private int dfs(int x, int y) {
        if (helper[x][y] != 0) 
            return helper[x][y];
        
        for(int d=0;d<dirs.length;d++) {
            int i = dirs[d][0] + x;
            int j = dirs[d][1] + y;
            
            if(i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length && matrix[x][y] < matrix[i][j]) {
                helper[x][y] = Math.max(helper[x][y], dfs(i, j));
            }
        }
        return ++helper[x][y];
    }
}