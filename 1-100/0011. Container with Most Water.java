class Solution {
    public int maxArea(int[] height) {
        
        if(height.length <= 1){
            return 0;
        }
        
        int l = 0;
        int r = height.length-1;
        
        int curr=0;
        int max=0;
        
        while(l<r){
            if(height[l] < height[r]){
                curr = height[l] *(r-l);
                l++;
            }else{
                curr = height[r]*(r-l);
                r--;
            }
            
            max = (max < curr ? curr : max);
        }
        
        return max;
    }
}