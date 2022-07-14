class Solution {
    public int minOperations(int[] nums, int x) {
        int totalSum = 0;
        for(int i=0;i<nums.length;i++){
            totalSum += nums[i];
        }
        
        int l=0;
        int r=0;
        int currSum=0;
        int maxLength=-1;
        
        int checkSum = totalSum - x;
        
        while(r<nums.length){
            currSum += nums[r];
            while(l<=r && currSum > checkSum){
                currSum -= nums[l++];
            }
            
            if(currSum == checkSum){
                maxLength = Math.max(maxLength, r-l+1);
            }
            
            r++;
        }
        
        return (maxLength==-1?-1:nums.length - maxLength);
    }
}