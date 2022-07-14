class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b){
                return (a[0]-a[1])-(b[0]-b[1]);
            }
            
        });   
        
        int minPrice=0;
        for(int i=0;i<costs.length/2;i++){
            minPrice += costs[i][0];
        }
        
        for(int i=costs.length/2;i<costs.length;i++){
            minPrice += costs[i][1];
        }
        
        return minPrice;
    }
}