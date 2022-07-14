class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        
        int n = columnNumber;
        
        int i,j;
        
        while(n!=0){
            i = (n%26);
            if(i==0)
                i = 26;
            
            j = i+64;
            result.append((char)j);
            n-=i;
            n/=26;
        }
        
        return result.reverse().toString();
    }
}