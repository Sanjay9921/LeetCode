class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        
        int[] leftToRight = new int[n];
        int[] rightToLeft = new int[n];
        
        //Atleast 1 condition
        Arrays.fill(leftToRight, 1);
        Arrays.fill(rightToLeft, 1);
        
        //Left to Right Search and fill
        for(int i=1;i<n;i++){
            //If current > previous fulfill the having higher condition 
            if(ratings[i] > ratings[i-1]){
                leftToRight[i] = leftToRight[i-1]+1;
            }
        }
        
        //Right to Left Search and fill
        for(int i=n-2;i>=0;i--){
            //If current > next fulfill the having higher condition 
            if(ratings[i] > ratings[i+1]){
                rightToLeft[i] = rightToLeft[i+1]+1;
            }
        }
        
        int minSum=0;
        //Minimum sum calculation
        for(int i=0;i<n;i++){
            //Calculate the maximum of both the arrays
            //Maximum because this satisfies both the left and right neighbour relationship
            minSum += Math.max(leftToRight[i], rightToLeft[i]);
        }
        
        return minSum;
        
    }
}