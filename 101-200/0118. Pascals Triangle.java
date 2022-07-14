class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        result.add(Arrays.asList(1));
        if(numRows==1)
            return result;
        
        result.add(Arrays.asList(1,1));
        if(numRows==2)
            return result;
        
        for(int i=2;i<numRows;i++){
            List<Integer> res = new ArrayList<Integer>();
            int val=1;
            
            for(int j=0;j<=i;j++){
                res.add(val);
                val = val*(i-j)/(j+1);
            }
            
            result.add(res);
        }
        
        return result;
        
    }
}