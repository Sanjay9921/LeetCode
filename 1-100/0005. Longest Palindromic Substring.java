class Solution {
    public String longestPalindrome(String s) {
        char[] charArray = s.toCharArray();
        
        int low=0;
        int high=0;
        
        int maxLen = 0;
        
        for(int i=0;i<charArray.length;i++){
            int l1 = palindrome(i,i,charArray);
            int l2 = palindrome(i,i+1,charArray);
            
            //System.out.println(l1 + " " + l2);
            
            int currMaxLen = Math.max(l1,l2);
            
            if(maxLen < currMaxLen){
                maxLen = currMaxLen;
                
                if(maxLen%2!=0){
                    low = i-maxLen/2; 
                }else{
                    low = i+1-maxLen/2;
                }
                
                high = i+maxLen/2;
            }
            
        }
        
        return s.substring(low,high+1);
        
    }
    
    public int palindrome(int l, int r, char[] str){
        while(l>=0 && r<str.length && str[l] == str[r]){
            l--;
            r++;
        }
        
        return r-l-1;
    }
        
}