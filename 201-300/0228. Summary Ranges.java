class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> result = new ArrayList<String>();
        
        int i;
        int start;
        
        for(i=0;i<nums.length;i++){
            start = nums[i];
            while(i+1 < nums.length && nums[i]+1==nums[i+1]){
                i++;
            }
            
            if(start == nums[i]){
                result.add(""+start);
            }
            else{
                result.add(""+start+"->"+nums[i]);
            }
        }
        
        return result;
        
    }
}