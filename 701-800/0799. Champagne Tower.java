class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        
        if(poured == 0)
            return 0;
        
        double[][] pt = new double[101][101];//Pascal's Triangle problem
        
        pt[0][0] = poured;
        
        for(int i=0;i<=query_row;i++){               
            for(int j=0;j<=i;j++){
                double val = (pt[i][j]-1.0)/2.0;
                if(val > 0.0){
                    pt[i+1][j] += val;
                    pt[i+1][j+1] += val;
                }
            }
        }
        
        return Math.min(1, pt[query_row][query_glass]);
        
        
    }
}