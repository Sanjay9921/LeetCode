class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length())
            return false;
        
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        
        for(int i=0;i<s.length();i++){
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            
            if(map.containsKey(cs)){
                if(ct != map.get(cs))
                    return false;
            }
            else{
                if(map.containsValue(ct))
                    return false;
                
                map.put(cs,ct);
            }
        }
        
        return true;
    }
}