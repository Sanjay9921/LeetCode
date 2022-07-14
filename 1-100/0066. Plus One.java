class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        //ArrayList<Integer> list = new ArrayList<Integer>();
        
        int carry=1;
        int rem=0;
        int t=0;
        
        for(int i=digits.length-1;i>=0;i--){
            t = digits[i]+carry;
            
            rem = t%10;
            carry = t/10;
            
            //list.add(rem);            
            digits[i] = rem;
        }
        
        int[] result;
        int k=0;
        
        if(carry==1){
            result = new int[digits.length+1];
            result[k++] = 1;
        }
        else{
            result = new int[digits.length];
        }
        
        for(int i=0;i<digits.length;i++){
            result[k++] = digits[i];
        }
        
        return result;
        
    }
}