class Solution {
    public int lengthOfLastWord(String s) {
        if(s==null)
            return 0;
        
        int count=0;
        int i=s.length()-1;
        while(s.charAt(i)==' ')
            i--;
        
        while(i>=0){
            count++;
            i--;
            
            if(i>=0 && s.charAt(i)==' ')
                break;
        }
        
        return count;
    }
}