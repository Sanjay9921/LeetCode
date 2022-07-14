class Solution {
    public String simplifyPath(String path) {
        
        Stack<String> stack = new Stack<String>();
        String[] pathArr = path.split("/"); // '/home//foo/' -> home, foo, 
        
        for(int i=0;i<pathArr.length;i++){
            if(!stack.isEmpty() && pathArr[i].equals("..")){
                stack.pop(); //.. represents up one evel
            }
            else{
                if(!pathArr[i].equals("") && !pathArr[i].equals(".") && !pathArr[i].equals("..")){
                    stack.push(pathArr[i]);
                }
            }
        }
        
        if(stack.isEmpty())
            return "/";
        
        StringBuilder str = new StringBuilder();
        while(!stack.isEmpty()){
            str.insert(0,stack.pop()).insert(0,"/");
        }
        
        
        return str.toString();
        
        
    }
}