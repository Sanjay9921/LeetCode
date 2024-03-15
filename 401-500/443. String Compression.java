// Two Pointers Approach
// Time Complexity:= O(N^2)
// Space Complexity:= O(N)

class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        
        int start=0;
        int end=0;
        int k = 0; // index that will help overwrite the existing elements in chars array

        while(start<n){
            char c = chars[start];
            int count=0;

            while(end<n && chars[end]==c){
                end++;
                count++;
            }

            chars[k++] = c;

            // count to be updated inside the chars array only if its greater than 1
            if(count>1){
                for(char num : String.valueOf(count).toCharArray()){ // every digit of the count appears as a separate character            
                    chars[k++] = num;
                }
            }

            start = end;
        }

        return k; // do not return the char length, we require the total length of the array till the result is contained
    }
}