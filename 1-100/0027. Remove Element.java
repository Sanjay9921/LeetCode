class Solution {
    public int removeElement(int[] nums, int val) {
        int l=0;
        int count=0;
        
        for(int r=0;r<nums.length;r++){
            if(nums[r]!=val){
                count++;
                int t = nums[r];
                nums[r] = nums[l];
                nums[l] = t;
                l++;
            }
        }
        
        return count;
    }
}