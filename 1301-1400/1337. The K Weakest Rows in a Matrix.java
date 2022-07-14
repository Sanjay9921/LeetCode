class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> a[0]!=b[0]?a[0]-b[0]:a[1]-b[1]
        );
        
        for(int i=0;i<mat.length;i++){
            int countOnes=0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    countOnes++;
                }
                else{
                    break;
                }
            }
            pq.add(new int[]{countOnes, i});
        }
        
        int[] result = new int[k];
        int index=0;
        
        while(k-- >0){
            result[index++] = pq.remove()[1];
        }
        
        return result;
        
    }
}