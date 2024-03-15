// Two Pointers Approach
// Time Complexity:= O(N) where N=t.length()
// Space Complexity:= O(1) (if charArrays are not used, else O(N))

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0; // index for String s // which is supposedly a subsequence
        int j=0; // index for String t

        int ns = s.length();
        int nt = t.length();

        // Improves Time Complexity
        // as iterating character arrays are faster than strings
        // Memory however :P
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();

        for(;i<ns && j<nt;){
            // if(s.charAt(i) == t.charAt(j)){
            if(charS[i] == charT[j]){
                // i iterates only in case of a match
                // follows the in-order principle of the indices
                i++;
            }

            // j iterates regardless of a match
            j++;

            if(i==ns){
                return true;
            }
        }

        return i==ns;
    }
}