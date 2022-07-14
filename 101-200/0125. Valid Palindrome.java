class Solution {
    public boolean isPalindrome(String s) {
        
        int l=0;
        int r=s.length()-1;
        
        s = s.toLowerCase();
        
        while(l<r){
            while(l<=r && Character.isLetterOrDigit(s.charAt(l))==false)
                l++;
            
            while(r>-1 && Character.isLetterOrDigit(s.charAt(r))==false)
                r--;
            
            if(l==s.length() && r==-1)
                return true;
            
            if(s.charAt(l)!=s.charAt(r))
                return false;
            
            l++;
            r--;
        }
        
        return true;
    }
}