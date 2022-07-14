class Solution {
    public int findDuplicate(int[] nums) {
        //Pigeon Hole + Binary search
        int l = 1;
        int r = nums.length-1;
        
        while(l<r){
            int m = l+(r-l)/2;
            int count=0;
            
            for(int i=0;i<nums.length;i++){
                if(nums[i] <= m){
                    count++;
                }
            }
            
            if(count <= m){
                l = m+1;
            }
            else{
                r = m;
            }
        }
        
        return l;
    }
}