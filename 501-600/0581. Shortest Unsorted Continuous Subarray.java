class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int l = n;//l--
        int r = 0;//r++
        
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i] > nums[j]){
                    r = Math.max(r, j);
                    l = Math.min(l, i);
                }
            }
        }
        
        if(r<l){
            return 0;
        }
        
        return r-l+1;
    }
}