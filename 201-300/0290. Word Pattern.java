class Solution {
    public boolean wordPattern(String pattern, String s) {   
        String[] str = s.split(" ");
        
        if(pattern.length()!=str.length)
            return false;
        
        HashMap<Character,String> map1 = new HashMap<Character,String>();
        HashMap<String, Boolean> map2 = new HashMap<String, Boolean>();
        
        for(int i=0;i<pattern.length();i++){
            
            char c = pattern.charAt(i);
            
            if(!map1.containsKey(c)){
                if(!map2.containsKey(str[i])){
                    map1.put(c, str[i]); 
                    map2.put(str[i],true);
                }
                else{
                    return false;
                }
            }
            else{
                if(map1.get(c).equals(str[i]) == false)
                    return false;
            }
        }
        
        return true;
    }
}