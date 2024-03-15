// Time Complexity - O(M+N), M=shorter word, N=longer word
// Space Complexity - O(M+N), M=shorter word, N=longer word

class Solution {
    public String mergeAlternately(String word1, String word2) {
        // Character arrays are faster than strings
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        
        int n1 = arr1.length;
        int n2 = arr2.length;
        
        char[] result = new char[n1+n2];
        int p=0,q=0,k=0;
        
        while(p<n1 && q<n2){
            result[k++] = arr1[p++];
            result[k++] = arr2[q++];
        }
        
        while(p<n1){
            result[k++] = arr1[p++];
        }
        
        while(q<n2){
            result[k++] = arr2[q++];
        }
        
        return String.valueOf(result);
        
    }
}