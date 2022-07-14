class FreqStack {
    
    HashMap<Integer, LinkedList<Integer>> stack = stack = new HashMap<Integer, LinkedList<Integer>>();
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    
    int maxFreq=0;
    
    public FreqStack() {
        
    }
    
    public void push(int val) {
        int currFreq = map.getOrDefault(val, 0)+1;
        map.put(val, currFreq);
        
        if(!stack.containsKey(currFreq)){
            stack.put(currFreq, new LinkedList<Integer>());
        }
        
        stack.get(currFreq).addFirst(val);
        maxFreq = Math.max(maxFreq, currFreq);
    }
    
    public int pop() {
        int result = stack.get(maxFreq).removeFirst();
        
        int currFreq = map.get(result)-1;
        map.put(result, currFreq);
        
        if(stack.get(maxFreq).size() == 0){
            maxFreq--;
        }
        
        return result;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */