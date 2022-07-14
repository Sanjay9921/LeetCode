class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int k=0;
        int n = nums.length;
        
        int[] result = new int[n];
        
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                result[k++] = nums[i];
            }
        }
        
        for(int i=0;i<n;i++){
            if(nums[i]%2!=0){
                result[k++] = nums[i];
            }
        }
        
        return result;   
    }
}