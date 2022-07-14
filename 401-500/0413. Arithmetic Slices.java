class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3)
            return 0;
        
        int sum=0;
        int prev=0;
        
        for(int i=2;i<nums.length;i++){
            int t1 = nums[i]-nums[i-1];
            int t2 = nums[i-1] - nums[i-2];
            
            if(t1==t2){
                prev++;
                sum += prev;
            }
            else{
                prev = 0;
            }
        }
        
        return sum;
        
    }
}