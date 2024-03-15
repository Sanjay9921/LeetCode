// Time Complexity:= O(N)
// Space Complexity:= O(N) // only one character array

// Credits to original solution: jeantimex [Clean Java two-pointers solution (no trim( ), no split( ), no StringBuilder)]

class Solution {
    public void reverseWord(char[] word, int start, int  end){
        while(start<end){
            char c = word[start];
            word[start] = word[end];
            word[end] = c;

            start++;
            end--;
        }
    }

    public void reverseWordsInString(char[] charArr){
        int n = charArr.length;
        int start=0;
        int end=0;

        while(start<n){
            // 1. Skip the initial spaces
            while(start<end || (start<n && charArr[start]==' ')){
                start++;
            }

            // 2. Skip the non spaces and get words (like split() method)
            while(end<start || (end<n && charArr[end]!=' ')){
                end++;
            }

            // 3. Reverse the word without spaces
            reverseWord(charArr,start,end-1);
        }
    }

    public String customTrim(char[] charArr){
        int n = charArr.length;
        int start=0;
        int end=0;

        while(end < n){
            // 1. Skip leading spaces
            while(end<n && charArr[end]==' '){
                end++;
            }

            // 2. Maintain the word between spaces
            while(end<n && charArr[end]!=' '){
                charArr[start++] = charArr[end++];
            }

            // 3. Skip trailing spaces
            while(end<n && charArr[end]==' '){
                end++;
            }

            // 4. Add one space after the word if `end` is not yet completed
            if(end<n){
                charArr[start++] = ' ';
            }
        }

        return new String(charArr).substring(0, start);
    }

    public String reverseWords(String s) {
        if(s==null){
            return null;
        }

        char[] charArr = s.toCharArray();
        int n = charArr.length;

        // 0. Do not trim at the starting as we have created character array
        // This saves additional space created by the new string as char array is mutable and we need to send it as a string
        // Clean/trim at the last

        // 1. Reverse the entire char array
        reverseWord(charArr,0,n-1);

        // 2. Reverse the words in the reversed char array
        reverseWordsInString(charArr);

        // 3. Custom Trim
        return customTrim(charArr);
    }
}