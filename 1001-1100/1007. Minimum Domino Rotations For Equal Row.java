class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        
        int[][] dp = new int[6][3];
        
        int m = tops.length;
        int n = bottoms.length;
        
        if(m!=n)
            return -1;
        
        //Col1->Frequency of the element (overall)
        //Col2->Frequency of the element in top
        //Col3->Frequency of the element in bottom
        
        for(int i=0;i<m;i++){
            if(tops[i] != bottoms[i]){
                dp[tops[i]-1][0]++;
                dp[tops[i]-1][1]++;
                
                dp[bottoms[i]-1][0]++;
                dp[bottoms[i]-1][2]++;
            }
            else{
                //both tops and bottom have the same value
                dp[tops[i]-1][0]++;
                dp[tops[i]-1][1]++;
                dp[tops[i]-1][2]++;
            }
        }
        
        int minRotations = Integer.MAX_VALUE;
        
        for(int i=0;i<6;i++){
            //Check the element with the overall frequency == the length of the tops/bottoms
            if(dp[i][0] == m){
                minRotations = Math.min(minRotations, Math.min(m-dp[i][1], n-dp[i][2]));
            }
        }
        
        if(minRotations > m)
            return -1;
        
        return minRotations;
        
    }
}