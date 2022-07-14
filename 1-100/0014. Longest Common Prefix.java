class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs == null)
            return "";
        
        int min_length = strs[0].length();
        
        for(int i=1;i<strs.length;i++){
            min_length = Math.min(min_length, strs[i].length());
        }
        
        String result = "";
        
        for(int j=0;j<min_length;j++){
            char c = strs[0].charAt(j);
            boolean f = true;
            
            for(int i=1;i<strs.length;i++){
                if(strs[i].charAt(j) != c){
                    f = false;
                    break;
                }
            }
            
            if(f){
                result += String.valueOf(c);
            }
            else{
                break;
            }
        }
        
        return result;
    }
}