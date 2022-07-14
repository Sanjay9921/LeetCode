class Solution {
    public int longestValidParentheses(String s) {
        int count=0;
        Deque<Integer> stack = new LinkedList<>();
        stack.push(-1);
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)== '('){
                stack.push(i);//notice we are pushing the index not the character
            }
            else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }
                else{
                    count = Math.max(i-stack.peek(), count);
                }
            }
        }
        
        return count;
    }
}