class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] lastSeen = new int[26];
        for(int i=0;i<s.length();i++){
            lastSeen[s.charAt(i)-'a'] = i;
        }
        
        int res=0;
        int r=0;
        int l=0;
        
        List<Integer> result = new ArrayList<Integer>();
        
        for(int i=0;i<s.length();i++){
            r = Math.max(r, lastSeen[s.charAt(i)-'a']);
            if(i==r){
                res = r-l+1;
                result.add(res);
                l = r+1;
            }
        }
        
        return result;
    }
}