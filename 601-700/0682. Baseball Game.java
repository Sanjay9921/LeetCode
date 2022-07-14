class Solution {
    public int calPoints(String[] ops) {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        
        for(String op : ops){
            if(op.equals("+")){
                int top = stack.pop();
                int sum = stack.peek() + top;
                stack.push(top);
                stack.push(sum);
            }
            else if(op.equals("C")){
                stack.pop();
            }
            else if(op.equals("D")){
                stack.push(stack.peek() * 2);
            }
            else{
                stack.push(Integer.valueOf(op));
            }
        }
        
        int result = 0;
        for(int res : stack){
            result += res;
        }
        
        return result;
    }
}