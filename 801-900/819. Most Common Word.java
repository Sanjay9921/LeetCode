class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        
        //Get all the banned words in a set
        Set<String> bannedWords = new HashSet<String>();
        
        for(String word: banned){
            bannedWords.add(word);
        }
        
        //HashMap for the permitted words
        Map<String,Integer> map = new HashMap<String,Integer>();
        String[] strParagraphSplit = paragraph.toLowerCase().split("\\W+");
        
        String result = "";
        int maxCount = 0;
        
        for(String word: strParagraphSplit){
            if(bannedWords.contains(word))
                continue;
            
            if(map.get(word)==null){
                map.put(word,1);
            }else{
                map.put(word, map.get(word)+1);
            }
            
            if(maxCount < map.get(word)){
                maxCount = map.get(word);
                result = word;
            }
        }
        
        return result;
        
    }
}