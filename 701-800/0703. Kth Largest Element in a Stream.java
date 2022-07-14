class KthLargest {
    PriorityQueue<Integer> pq;
    int k;
    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<Integer>();
        this.k = k;
        
        for(int i:nums){
            addToQueue(i);
        }
    }
    
    public int add(int val) {
        return addToQueue(val);
    }
    
    private int addToQueue(int x){
        pq.offer(x);
        
        if(pq.size()>k){
            pq.poll();
        }
        
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */