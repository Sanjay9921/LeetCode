class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s == null || t == null)
            return false;
        
        if(s.length()==1 && t.length()==1){
            return s==t;
        }
        
        int i=0;
        int j=0;
        
        while(i<s.length() && j<t.length()){
            char x = s.charAt(i);
            char y = t.charAt(j);
            
            if(x==y){
                i++;
            }
            
            j++;
        }
        
        return i==s.length();
    }
}