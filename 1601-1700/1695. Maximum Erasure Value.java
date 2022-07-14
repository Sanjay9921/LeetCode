class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        
        //Required DS
        Set<Integer> set = new HashSet<>();
        
        //Sliding Window
        int l=0;
        int r=0;
        int n = nums.length;
        
        //Required Storage Variables
        int currSum=0;
        int maxSum = 0;
        
        
        while(r<n){
            while(!set.add(nums[r])){
                currSum -= nums[l];
                set.remove(nums[l++]);
            }
            
            currSum += nums[r++];
            maxSum = Math.max(maxSum, currSum);
        }
        
        return maxSum;
    }
}