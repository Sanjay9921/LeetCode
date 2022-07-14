class Solution {
    
    List<Integer> combArr = new ArrayList<>();
    List<List<Integer>> resCombArr = new ArrayList<>();
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        helper(k, n, 1);
        return resCombArr;
    }
    
    private void helper(int k, int n, int start){
        if(k==0 && n==0){
            resCombArr.add(new ArrayList<>(combArr));
            return;
        }
        
        for(int i=start;i<10;i++){//stated from 1 to 9 in the question
            combArr.add(i);
            helper(k-1,n-i,i+1);
            combArr.remove(combArr.size()-1);
        }
    }
}