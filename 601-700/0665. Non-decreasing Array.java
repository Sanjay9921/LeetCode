class Solution {
    public boolean checkPossibility(int[] nums) {
        int count=0;//checks for atmost one possibility
        
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                if(count!=0)
                    return false;//atmost condition
                
                if(i>0 && i<nums.length-2 && nums[i-1] > nums[i+1] && nums[i] > nums[i+2])
                    return false;
                
                count++;
            }
        }
        
        return true;
    }
}