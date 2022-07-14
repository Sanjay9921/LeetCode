class Solution {
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        
        while(i<j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;   
            }
            else{
                return palindromeCheck(i+1,j,s) || palindromeCheck(i,j-1,s);
            }
        }
        
        return true;
    }
    
    private boolean palindromeCheck(int i, int j, String s){
        while(i<j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;   
            }
            else{
                return false;
            }
        }
        
        return true;
    }
}