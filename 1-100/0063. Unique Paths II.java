class Solution {
    public int uniquePathsWithObstacles(int[][] og) {//Obstacle Grid == O.G
        int m = og.length;
        int n = og[0].length;
        
        if(og[0][0] == 1)
            return 0;
        
        og[0][0] = 1;
        
        for(int i=1;i<m;i++){
            og[i][0] = (og[i][0] == 0 && og[i-1][0] == 1)?1:0;
        }
        
        for(int j=1;j<n;j++){
            og[0][j] = (og[0][j] == 0 && og[0][j-1] == 1)?1:0;
        }
        
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(og[i][j] == 0){
                    og[i][j] = og[i-1][j] + og[i][j-1];
                }
                else{
                    og[i][j] = 0;
                }
            }
        }
        
        return og[m-1][n-1];
    }
}