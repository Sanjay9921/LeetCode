class Solution {
    public int numberOfSteps(int num) {
     
        int count = 0;
        
        if(num==0)
            return count;
        
        while(num>0){
            count++;
            if(num%2==0){
                num/=2;
            }
            else{
                num-=1;
            }
        }
        
        return count;
        
    }
}