class Solution {
    int count=0;
    public boolean isHappy(int n) {
        
        /*HashSet<Integer> set = new HashSet<Integer>();
        
        while(true){
            int sum=0;
            while(n>0){
                sum += Math.pow(n%10,2);
                n/=10;
            }
            
            if(sum==1)
                return true;
            
            n = sum;
            
            if(!set.contains(n)){
                set.add(n);
            }
            else{
                return false;
            }
        }*/
        
        int sum=0;
        while(n>0){
            sum += Math.pow(n%10,2);
            n/=10;
        }
        
        if(sum==1)
            return true;
        
        n = sum;
        count++;
        
        if(count>7)
            return false;
        
        return isHappy(n);
        
    }
}