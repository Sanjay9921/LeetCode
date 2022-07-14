class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        
        int total = m*n;
        
        k = k%total;
        
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i=0;i<m;i++){
            List<Integer> res = new ArrayList<>();
            for(int j=0;j<n;j++){
                int idx = ((i*n + j)-k+total)%total;
                res.add(grid[idx/n][idx%n]);
            }
            result.add(res);
        }
        
        return result;
    }
}