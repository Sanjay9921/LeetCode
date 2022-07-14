class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        
        for(int i=n-1;i>=0;i--){
            if(k==1){
                return nums[i];
            }
            
            k--;
        }
        
        return -1;
    }
}