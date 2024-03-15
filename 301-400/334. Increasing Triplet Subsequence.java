// Time Complexity:= O(N)
// Space Complexity:= O(N)

// Two Pointers Approach

// Greedy Approach can also be used so that space is O(1)
// Credits:= longluo [Why Greedy works?]
/*
int first = nums[0];
int second = Integer.MAX_VALUE;

for (int third : nums) {
    if (third > second) {
        return true;
    } else if (third > first) {
        second = third;
    } else {
        first = third;
    }
}

return false;
*/

class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums == null || nums.length < 3){
            return false;
        }

        int n = nums.length;

        int[] minArr = new int[n];
        int[] maxArr = new int[n];

        // 1. Minimum Array
        // Left to Right => i<j rule
        minArr[0] = nums[0];
        for(int i=1;i<n;i++){
            minArr[i] = Math.min(minArr[i-1],nums[i]);
        }
        
        // 2. Maximum Array
        // Right to Left => j<k rule
        maxArr[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            maxArr[i] = Math.max(maxArr[i+1],nums[i]);
        }

        // 3. Current element
        // Normal Iteration so that we can check if i<j<k
        for(int i=0;i<n;i++){
            int first = minArr[i];
            int second = nums[i];
            int third = maxArr[i];

            if(first<second && second<third){
                return true;
            }
        }

        return false;
    }
}