// Postfix Expression using Stack
// Time Complexity:= O(N)
// Space Complexity:= O(1)

class Solution {
    public static int evaluate(int a, int b, String op){
        int result = Integer.MIN_VALUE;
        
        // switch case is efficient than long if-else branching here
        switch(op){
            case "+":
                result = a+b;
                break;
            case "-":
                result = a-b;
                break;
            case "*":
                result = a*b;
                break;
            case "/":
                result = a/b;
                break;
        }
        
        return result;
    }

    public boolean isOp(String c){
        return c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/");
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<tokens.length;i++){
            if(isOp(tokens[i])){
                int a = stack.pop();
                int b = stack.pop();

                int result = evaluate(b,a,tokens[i]); // `b` is to be evaluated first, then `a`

                stack.push(result);
            }
            else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        
        return stack.pop();
    }
}