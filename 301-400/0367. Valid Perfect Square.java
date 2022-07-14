class Solution {
    public boolean isPerfectSquare(int num) {
        int result = mySqrt(num);
        //System.out.println(result);
        return result*result == num;
    }
    
    public static int mySqrt(int n){
        if(n==0 || n==1)
            return n;
        
        int l=1;
        int h=n/2;
        
        while(l<=h){
            int m = l+(h-l)/2;
            if(m*m == n){
                return m;
            }
            else if(m< n/m){
                l = m+1;
            }else{
                h = m-1;
            }
        }
        
        return -1;
    }
}