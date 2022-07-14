class MyStack {

    private static Queue<Integer> q1 = new LinkedList<Integer>();
    private static Queue<Integer> q2 = new LinkedList<Integer>();
    
    private static int n;
    
    public MyStack() {
        n = 0;
    }
    
    public void push(int x) {
        n++;
        
        q2.add(x);
        
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.remove();
        }
        
        Queue<Integer> t = q1;
        q1 = q2;
        q2 = t;
    }
    
    public int pop() {
        if(q1.isEmpty())
            return -1;
        
        int x = q1.peek();
        q1.remove();
        n--;
        
        return x;
    }
    
    public int top() {
        if(q1.isEmpty())
            return -1;
        
        return q1.peek();   
    }
    
    public boolean empty() {
        return n==0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */