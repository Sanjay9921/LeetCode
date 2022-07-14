class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        if(target<matrix[0][0] || target>matrix[m-1][n-1])
            return false;
        
        int l = 0;
        int r = (m*n)-1;
        
        while(l<=r){
            int mid = l + (r-l)/2;
            int i = mid/n;
            int j = mid%n;
            //System.out.println("i " + i + " j " + j);
            if(matrix[i][j] == target){
                return true;
            }
            else if(matrix[i][j] < target){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        
        return false;
    }
}