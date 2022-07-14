class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        
        int prevSum=0;
        
        for(int i=0;i<nums.length;i++){
            result[i] = prevSum + nums[i];
            prevSum += nums[i];
        }
        
        return result;
        
    }
}