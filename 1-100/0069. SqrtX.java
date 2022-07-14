class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1)
            return x;
        
        long l=0;
        long h=x/2;
        
        long m=0;
        
        while(l<=h){
            m = l+(h-l)/2;
            if(m*m == x)
                return (int)m;
            else if(m*m > x)
                h = m-1;
            else
                l = m+1;
        }
        
        return (m*m > x)?(int)m-1:(int)m;
    }
}