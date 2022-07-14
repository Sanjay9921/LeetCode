class Solution {
    public void reverseString(char[] s) {
        if(s.length == 0)
            return;
        
        int n = s.length;
        
        for(int i=0;i<n/2;i++){
            swap(i,n-i-1,s);
        }
    }
    
    private void swap(int i, int j, char[] s){
        char t = s[i];
        s[i] = s[j];
        s[j] = t;
    }
}