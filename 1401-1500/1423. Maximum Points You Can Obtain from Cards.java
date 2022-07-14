class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        //Idea: find the minimum sum of the subarray, and then subtract it from the total sum to get the maximum sum
        
        int totalSum = 0;
        int currSum=0;
        int minSum=0;
        int n = cardPoints.length;
        
        for(int i=0;i<n;i++){
            totalSum += cardPoints[i];
            currSum += cardPoints[i];
            
            if(i<n-k){
                minSum += cardPoints[i];
            }
            else{
                currSum -= cardPoints[i - (n-k)];
                minSum = Math.min(minSum, currSum);
            }
        }
        
        return totalSum - minSum;
        
    }
}