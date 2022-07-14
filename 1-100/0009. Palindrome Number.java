class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        
        if(x%10 == 0 && x!=0)
            return false;
        
        int revX = 0;
        while(x > revX){
            revX = revX*10 + x%10;
            x/=10;
        }
        
        return (x == revX) || (x == revX/10); //even case || odd case
    }
}