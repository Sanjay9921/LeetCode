class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int count=1;
        int[][] dir = {
            {0,1},{1,0},{0,-1},{-1,0}
        };
        
        int d=0;
        int i=0;
        int j=0;
        
        while(count <= n*n){
            result[i][j] = count++;
            int row = Math.floorMod(i + dir[d][0], n);
            int col = Math.floorMod(j + dir[d][1], n);
            
            if(result[row][col] != 0){
                d = (d+1)%4;
            }
            
            i += dir[d][0];
            j += dir[d][1];
        }
        
        return result;
    }
}