class Solution {
    public int myAtoi(String s) {
        
        if(s.length()==0)
            return 0;
        
        int l=0;
        
        //1. ignore leading whitespace
        while(l<s.length() && s.charAt(l)==' '){
            l++;
        }
        
        //2. Check for sign
        int sign=1;
        if(l<s.length() && (s.charAt(l)=='-' || s.charAt(l)=='+')){
            if(s.charAt(l)=='-'){
                sign = -1;
            }else{
                sign = 1;
            }
            
            l++;
        }
        
        int res=0;
        //3. Read all the digits till a non digit is reached
        while(l<s.length() && Character.isDigit(s.charAt(l))){
            
            //More than allowed max or less than allowed min
            if(res >= Integer.MAX_VALUE / 10 + 1) 
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            
            if(res == Integer.MAX_VALUE / 10) {
                if(sign == 1 && Character.getNumericValue(s.charAt(l)) >= 8) {
                    return Integer.MAX_VALUE;
                } else if(sign == -1 && Character.getNumericValue(s.charAt(l)) > 8) {
                    return Integer.MIN_VALUE;
                }
            }
            
            res = res*10 + s.charAt(l++)-'0';
        }
        
        if(sign==-1){
            res *= -1;
        }
        
        return res;
    }
}