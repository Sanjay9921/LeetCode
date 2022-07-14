class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        
        int score=0;
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            
            if(c=='('){
                stack.push(score);
                score = 0;//rest
            }
            else{
                score = stack.pop() + Math.max(2*score, 1);
            }
        }
        
        return score;
    }
}