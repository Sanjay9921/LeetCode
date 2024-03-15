// Linear Iteration
// Time Complexity:= O(N)
// Space Complexity:= O(N) (if charArray is used, else O(1))

class Solution {
    public boolean isPalindrome(char[] charArr){
        int n = charArr.length;

        for(int i=0;i<n/2;i++){
            if(charArr[i]!=charArr[n-i-1]){
                return false;
            }
        }

        return true;
    }

    public int removePalindromeSub(String s) {

        if(isPalindrome(s.toCharArray())){
           return 1; 
        }

        return 2;
    }
}