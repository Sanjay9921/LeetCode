// Linear Iteration + Char Array
// Time Complexity:= O(N)
// Space Complexity:= O(N) (if char array is used, else O(1))

class Solution {
    public int lengthOfLastWord(String s) {
        if(s==null){
            return 0;
        }

        int n = s.length();
        char[] charArr = s.toCharArray();

        int i=n-1;
        while(i>=0 && charArr[i]==' '){
            i--;
        }

        int j=i;
        while(i>=0 && charArr[i]!=' '){
            i--;
        }

        return j-i;
    }
}