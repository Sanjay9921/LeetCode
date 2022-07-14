class Solution {
    public int titleToNumber(String columnTitle) {
        
        int result=0;
        
        int shift=0;
        
        int x=0;
        
        for(int i=columnTitle.length()-1;i>=0;i--){
            result += (char)(columnTitle.charAt(i)-64)*((int)(Math.pow(26,shift)));
            shift++;
            
        }
        
        return result;
        
    }
}