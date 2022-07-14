class Solution {
    public int maxResult(int[] nums, int k) {
        int n = nums.length;
        int maxScore = nums[0];
        
        //Priority queue {value,index}
        PriorityQueue<int[]> queue = new PriorityQueue<>(
            (a,b) -> (b[0] - a[0])
        );
        
        queue.add(new int[]{nums[0], 0});
        
        for(int i=1;i<n;i++){
            while(queue.peek()[1] + k < i){
                queue.poll();
            }
            
            maxScore = nums[i] + queue.peek()[0];
            queue.add(new int[]{maxScore, i});
        }
        
        return maxScore;
    }
}