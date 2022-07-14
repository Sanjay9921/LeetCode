class Solution {
    public int minPartitions(String n) {
        
        //Input is string not integer
        //Check with more examples as to why the largest number would give the result
        //Deci Binary numbers are decimals - 10 does not mean 2, it mean ten
        
        int max=0;
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)-'0' == 9)
                return 9;
            
            max = Math.max(max, (n.charAt(i)-'0'));
        }
        
        return max;
    }
}