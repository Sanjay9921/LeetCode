class Solution {
    public int shortestPathBinaryMatrix(int[][] g) {
        if(g[0][0] == 1)
            return -1;
        
        int m = g.length;
        int n = g[0].length;
        int c=0;
        
        Queue<int[]> q = new LinkedList<>();
        
        q.offer(new int[]{0,0,1});//{i,j,length_of_path}
        int d[][] = {
            {1,1},{-1,-1},{1,0},{-1,0},{0,1},{0,-1},{1,-1},{-1,1}
        };
        
        while(!q.isEmpty()){
            int l = q.size();
            while(l-- > 0){
                int[] f = q.poll();
                if(f[0] == m-1 && f[1] == n-1){
                    return f[2];
                }
                
                for(int[] k: d){
                    int i = f[0] + k[0];
                    int j = f[1] + k[1];
                    
                    if(i>=0 && j>=0 && i<m && j<n && g[i][j]==0){
                        q.offer(new int[] {i,j, f[2]+1});
                        g[i][j] = 1;
                    }
                }
            }
        }
        
        return -1;
    }
}