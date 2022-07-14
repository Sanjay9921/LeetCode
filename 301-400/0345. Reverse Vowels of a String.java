class Solution {
    public String reverseVowels(String s) {
        
        if(s.length()==0)
            return "";
        
        int l=0;
        int r=s.length()-1;
        
        char[] charArr = s.toCharArray();
        
        while(l<=r){
            if(isVowel(charArr[l]) && isVowel(charArr[r])){
                swap(l,r,charArr);
                l++;
                r--;
            }
            else if(!isVowel(charArr[l])){
                l++;
            }
            else if(!isVowel(charArr[r])){
                r--;
            }
        }
        
        return new String(charArr);
        
    }
    
    public static boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
            c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
    }
               
    public static void swap(int l, int r, char[] charArr){
        char c = charArr[l];
        charArr[l] = charArr[r];
        charArr[r] = c;
    }
}