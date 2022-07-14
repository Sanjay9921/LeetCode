class Solution {
    public char findTheDifference(String s, String t) {
        /*int[] map = new int[26];
        
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            map[c-'a']++;
        }
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map[c-'a']--;
        }
        
        for(int i=0;i<26;i++){
            if(map[i]==1)
                return (char)(i+'a');
        }
        
        return 'a';*/
        
        //Faster Approach below
        int sum1=0;
        int sum2=0;
        
        for(char i:s.toCharArray()){
            sum1+=i;
        }
        
        for(char i:t.toCharArray()){
            sum2+=i;
        }
        
        return (char)(sum2-sum1);
    }
}