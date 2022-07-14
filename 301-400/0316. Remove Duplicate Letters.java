class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        
        int[] lastSeen = new int[26];
        
        for(int i=0;i<s.length();i++){
            lastSeen[s.charAt(i)-'a'] = i;
        }
        
        boolean[] visited = new boolean[26];
        
        for(int i=0;i<s.length();i++){
            int currChar = s.charAt(i)-'a';
            
            if(visited[currChar])
                continue;
            
            
            while(!stack.isEmpty() && stack.peek() > currChar && i<lastSeen[stack.peek()]){
                visited[stack.pop()] = false;
            }
            
            stack.push(currChar);
            visited[currChar] = true;
        }
        
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append((char)(stack.pop()+'a'));
        }
        
        return sb.reverse().toString();
    }
}