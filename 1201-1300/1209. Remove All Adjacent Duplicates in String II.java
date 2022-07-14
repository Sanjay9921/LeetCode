class Solution {
    
    static class Pair {
        int cnt;
        char ch;
        
        Pair(char ch, int cnt) {
            this.ch = ch;
            this.cnt = cnt;
        }
    }
    
    public String removeDuplicates(String s, int k) {
        Deque<Pair> stack = new ArrayDeque<>();
        
        for(char ch : s.toCharArray()) {
            if(stack.isEmpty() || stack.peekLast().ch != ch) {
                stack.addLast(new Pair(ch, 1));
            }
            else {
                stack.peekLast().cnt++;
                if(stack.peekLast().cnt == k)
                    stack.removeLast();
            }
        }
        
        StringBuilder R = new StringBuilder();
        for(Pair d : stack) {
            while(d.cnt-- > 0) 
                R.append(d.ch);
        }
        
        return R.toString();
    }
}