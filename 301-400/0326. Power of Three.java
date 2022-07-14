class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<1)
            return false;
        
        if(n==1)
            return true;
        
        if(n%3!=0)
            return false;
        
        while(n%3==0){
            n/=3;
        }
        
        return n==1;
        
        //return (n == 0) ? false : Math.pow(3,Math.round(Math.log(n)/Math.log(3))) == (double)n;
    }
}