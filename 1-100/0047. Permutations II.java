class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        if(n==0)
            return result;
        
        Arrays.sort(nums);//Sort for pruning
        
        boolean[] visited = new boolean[n];
        helper(result, new ArrayList<>(), nums, visited, 0);
        
        return result;
    }
    
    //Backtracking and Pruning
    public void helper(List<List<Integer>> result, List<Integer> path, int[] nums, boolean[] visited, int n){
        if(n == nums.length){
            result.add(new ArrayList<>(path));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(visited[i]){
                continue;
            }
            
            //Pruning
            // i > 0 because i - 1 >=0
            // nums[i] == nums[i - 1] avoid duplicates
            // visited[i-1]=false is in tree level pruning
            if(i>0 && nums[i] == nums[i-1] && !visited[i-1])
                continue;
            
            visited[i] = true;
            path.add(nums[i]);
            
            helper(result, path, nums, visited, n+1);
            
            visited[i] = false;
            path.remove(path.size()-1);
        }
    }
}