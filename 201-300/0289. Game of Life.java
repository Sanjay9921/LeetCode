class Solution {
    public void gameOfLife(int[][] board) {
        
        int m = board.length;
        int n = board[0].length;
        
        int[][] temp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                
                int sum = neighbours(i,j-1,board) + neighbours(i,j+1,board)+
                          neighbours(i-1,j,board) + neighbours(i+1,j,board)+
                          neighbours(i-1,j-1,board) + neighbours(i-1,j+1,board)+
                          neighbours(i+1,j-1,board) + neighbours(i+1,j+1,board);
                
                //Live Cases
                if(board[i][j]==1){
                    
                    if(sum<2 || sum>3){
                        temp[i][j] = 0;
                    }
                    else{
                        temp[i][j] = 1;
                    }
                }
                //Dead Case
                else{
                    if(sum==3){
                        temp[i][j] = 1;
                    }
                    else{
                        temp[i][j]=0;
                    }
                }
                
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                board[i][j] = temp[i][j];
            }
        }
        
    }
    
    private int neighbours(int i, int j, int[][] board){
        if(i<0 || j<0 || i>=board.length || j>= board[0].length || board[i][j]==0)
        {
            return 0;
        }
        
        return 1;
    }
}