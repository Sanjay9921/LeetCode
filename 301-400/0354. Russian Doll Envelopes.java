class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(
            envelopes, (a,b) -> a[0] == b[0] ? b[1]-a[1]:a[0]-b[0]
        );
        
        int n = envelopes.length;
        int[] dp = new int[n];
        int result=0;
        
        for(int[] env : envelopes){
            int height = env[1];
            int left = Arrays.binarySearch(dp, 0, result, height);
            if(left < 0){
                left = -left-1;
            }
            
            if(left == result){
                result++;
            }
            
            dp[left] = height;
        }
        
        return result;
    }
}