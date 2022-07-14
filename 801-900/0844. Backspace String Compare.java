class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        s = helper(s);
        t = helper(t);
        
        return s.equals(t);
        
    }
    
    private String helper(String str){
        
        Deque<Character> s = new LinkedList<>();
        
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            
            if(s.isEmpty()){
                if(c!='#'){
                    s.push(c);
                }
            }
            else{
                if(c!='#'){
                    s.push(c);
                }
                else{
                    s.pop();
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        
        return sb.toString();
    }
}