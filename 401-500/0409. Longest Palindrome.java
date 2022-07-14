class Solution {
    public int longestPalindrome(String s) {
        
        if(s.length() == 1)
            return 1;
        
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        
        int maxCount = 0;
        for(int i=0;i<charArr.length-1;i++){
            if(charArr[i] == charArr[i+1]){
                maxCount+=2;
                i++;
            }
        }
        
        if(maxCount < charArr.length){
            maxCount++;
        }
        
        return maxCount;
        
        
    }
}