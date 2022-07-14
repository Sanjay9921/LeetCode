class Solution {
    public int lengthOfLongestSubstring(String s) {    
        if(s.length() == 0)
            return 0;
        
        int[] position = new int[256];
        
        int l=0;
        int maxCount=1;
        
        for(int r=1;r<=s.length();r++){
            int c = (int)s.charAt(r-1);
            
            //If character does not exist
            if(position[c] == 0){
                position[c] = r;
                if(l==0){
                    l = r;
                }
            }
            else{
                //character exists
                if(position[c] >= l){
                    int currCount = r-l;
                    maxCount = Math.max(maxCount, currCount);
                    l = position[c] + 1;
                }
                
                position[c] = r;
            }
        }
        
        if(l>0){
            //r = s.length()
            maxCount = Math.max(maxCount, s.length()-l+1);
        }
        
        return maxCount;
    }
    
}