class Solution {
    public int reverse(int x) {
        
        if(x==0)
            return 0;
        
        int sign=(x<0 ? -1: 1);//if positive
        
        if(sign==-1){
            x*=-1;
        }
        
        int revX=0;
        while(x>0){
            if(revX*sign>Integer.MAX_VALUE/10 || revX*sign<Integer.MIN_VALUE/10){
                return 0;
            }
            
            revX = revX*10 + x%10;
            x/=10;
        }
        
        if(sign==-1){
            revX *= -1;
        }
        
        return revX;
        
        
    }
}