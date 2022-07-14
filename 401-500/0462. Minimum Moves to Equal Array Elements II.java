class Solution {
    public int minMoves2(int[] nums) {
        
        //Try to find the median
        
        Arrays.sort(nums);
	int operations = 0, mid = nums[nums.length/2];
	for (int num: nums) operations += Math.abs(mid - num);
	return operations;
    }
}