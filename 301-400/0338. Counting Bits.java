class Solution {
    public int[] countBits(int n) {
        
        int offset=1;
        int[] result = new int[n+1];
        result[0] = 0;
        
        for(int i=1;i<=n;i++){
            if(offset*2 == i)
                offset*=2;
            
            result[i] = result[i-offset]+1;
        }
        
        return result;
        
    }
}