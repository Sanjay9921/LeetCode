class Solution {
    public boolean isValid(String s) {
        LinkedList<Character> stack = new LinkedList<Character>();
        
        int i=0;
        int n = s.length();
        
        while(i<n){
            char c = s.charAt(i);
            if(c==')' && stack.peekLast()!=null && stack.peekLast()=='('){
                stack.removeLast();
            }
            else if(c=='}' && stack.peekLast()!=null && stack.peekLast()=='{'){
                stack.removeLast();
            }
            else if(c==']' && stack.peekLast()!=null && stack.peekLast()=='['){
                stack.removeLast();
            }
            else{
                stack.add(c);
            }
            
            i++;
        }
        
        return stack.isEmpty();
        
    }
}