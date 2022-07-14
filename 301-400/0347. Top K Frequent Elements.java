class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        //MaxHeap
        Queue<Integer> pq = new PriorityQueue<Integer>(
            (a,b) -> map.get(b) - map.get(a)
        );
        
        for(int key: map.keySet()){
            pq.add(key);
        }
        
        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i] = pq.poll();
        }
        
        return result;
    }
}