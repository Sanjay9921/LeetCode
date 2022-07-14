class Solution {
    public int splitArray(int[] nums, int m) {
        
        int sum=0;
        int maxElement=Integer.MIN_VALUE;
        
        for(int i:nums){
            sum += i;
            maxElement = Math.max(maxElement, i);
        }
        
        int minSum=0;
        
        int l=maxElement;
        int r=sum;
        
        while(l<=r){
            int maxSum = l+(r-l)/2;
            if(splits(nums, maxSum) <= m){
                r = maxSum-1;
                minSum = maxSum;
            }
            else{
                l = maxSum + 1;
            }
        }
        
        return minSum;
    }
    
    private int splits(int[] nums, int maxSum){
        int splits=0;
        int currSum=0;
        
        for(int i : nums){
            if(currSum + i <= maxSum){
                currSum += i;
            }
            else{
                currSum = i;
                splits++;
            }
        }
        
        return splits+1;//+1 for the number of sub arrays split 
    }
}