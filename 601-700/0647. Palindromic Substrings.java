class Solution {
    public int countSubstrings(String s) {
        int count=0;
        
        for(int i=0;i<s.length();i++){
            count += palindromeCount(s,i,i);//odd palindrome
            
            if(i<s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                count += palindromeCount(s,i,i+1);//even palindrome
            }
        }
        
        return count;
    }
    
    private int palindromeCount(String s, int l, int r){
        int count=0;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            count++;
            l--;
            r++;
        }
        
        return count;
    }
}