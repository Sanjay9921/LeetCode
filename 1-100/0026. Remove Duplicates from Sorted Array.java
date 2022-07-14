class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums == null || nums.length == 0)
            return 0;
        
        int l=0;
        int r=1;
        
        for(;r<nums.length;r++){
            if(nums[l] != nums[r]){
                l++;
                nums[l] = nums[r];
            }
        }
        
        return l+1;
    }
}