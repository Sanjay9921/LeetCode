// Two Pointers
// Time Complexity:= O(N^2)
// Space Complexity:= O(1)

class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;

        int result=Math.min(height[0], height[n-1])*(n-1);

        while(l<r){
            int currHeight = Math.min(height[l], height[r]);
            int currArea = currHeight * (r-l);

            result = Math.max(result, currArea);

            // Keep moving forward till you find a height greater than the current height
            while(l<r && height[l]<=currHeight){
                l++;
            }

            // Keep moving backward till you find a height greater than the current height
            while(l<r && height[r]<=currHeight){
                r--;
            }
        }

        return result;
    }
}