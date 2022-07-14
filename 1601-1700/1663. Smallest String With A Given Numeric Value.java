class Solution {
    public String getSmallestString(int n, int k) {
        char[] charArr = new char[n];
        for(int i=0;i<n;i++){
            charArr[i] = 'a';
            k--;
        }
        
        int i=n-1;
        while(k>0){
            int minChar = Math.min(25, k);
            charArr[i--] += minChar; //for ex, if its 25-> a (already placed)+25 = z
            k -= minChar;
        }
        
        return String.valueOf(charArr);
    }
}