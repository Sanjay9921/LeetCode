class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder str = new StringBuilder(s);
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            
            if(c=='('){
                stack.push(i);
            }
            else if(c==')'){
                if(!stack.isEmpty() && s.charAt(stack.peek())=='('){
                    stack.pop();
                }
                else{
                    stack.push(i);
                }
            }            
        }
        
        while(!stack.isEmpty())     
            str.deleteCharAt(stack.pop());
        
        return str.toString();
    }
}