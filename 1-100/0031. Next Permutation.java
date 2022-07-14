class Solution {
    public void nextPermutation(int[] nums) {
        int r = nums.length - 2;
        while(r>=0 && nums[r]>=nums[r+1]){
            r--;
        }
        
        if(r>=0){
            int l = nums.length-1;
            while(nums[l] <= nums[r]){
                l--;
            }
            
            swap(nums, l, r);
        }
        
        reverse(nums, r+1);
    }
    
    private void reverse(int[] nums, int index){
        int l = index;
        int r = nums.length-1;
        
        while(l < r){
            swap(nums, l, r);
            l++;
            r--;
        }
    }
    
    private void swap(int[] nums, int a, int b){
        int t = nums[a];
        nums[a] = nums[b];
        nums[b] = t;
    }
}