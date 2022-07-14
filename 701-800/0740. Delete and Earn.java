class Solution {
    public int deleteAndEarn(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        int min = nums[0];
        int max = nums[0];
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
            
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        
        int prevInc=0;
        int prevExc=0;
        
        for(int i=min;i<=max;i++){
            int t = 0;
            if(map.containsKey(i)){
                t = map.get(i);
            }
               
            int currInc = i*t + prevExc;
            int currExc = Math.max(prevInc,prevExc);
               
            prevInc = currInc;
            prevExc = currExc;
        }
        
               
        return Math.max(prevInc, prevExc);
        
    }
}