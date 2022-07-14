class Solution {
    public int findMaxForm(String[] strs, int M, int N) {
        int[][] dp = new int[M+1][N+1];
        for(String s:strs){
            int zeroes=0;
            int ones=0;
            
            for(char c: s.toCharArray()){
                if(c=='0')
                    zeroes++;
                else
                    ones++;
            }
            
            for(int i=M;i>=zeroes;i--){
                for(int j=N;j>=ones;j--){
                    dp[i][j] = Math.max(dp[i][j], dp[i-zeroes][j-ones]+1);
                }            
            }
        }
        
        
        return dp[M][N];
    }
}