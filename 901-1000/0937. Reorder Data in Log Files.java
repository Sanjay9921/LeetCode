class Solution {
    public String[] reorderLogFiles(String[] logs) {
        List<String> digitLogs = new ArrayList<String>();
        List<String> letterLogs = new ArrayList<String>();
        
        for(String s: logs){
            String[] str = s.split(" "); // [0]- dig1, [1]-8, [2]-5, [3]-1
            char c = str[1].charAt(0); // to check if it is a digit or a letter
            
            if(Character.isDigit(c)){
                digitLogs.add(s);
            }
            else{
                letterLogs.add(s);
            }
        }
        
        Collections.sort(letterLogs,new Comparator<String>(){
           
            @Override
            public int compare(String first, String second){
                
                //first = let1 art can
                //second = let2 own kit dig
                
                String firstVals = first.substring(first.indexOf(" ")+1); //art can
                String secondVals = second.substring(second.indexOf(" ")+1); //own kit dig
                
                if(firstVals.equals(secondVals)){ //"art can" == "own kit dig" ?
                    //String[] str1 = first.split(" ") = let1, art, can
                    //str1[0] = "let1"
                    //str2[0] = "let2"
                    
                    //Check if let1 == let2
                    
                    return first.split(" ")[0].compareTo(second.split(" ")[0]); 
                }
                
                
                
                return firstVals.compareTo(secondVals);
                
            }
            
        });
        
        letterLogs.addAll(digitLogs);
        
        int n = letterLogs.size();
        
        return letterLogs.toArray(new String[n]);
    }
}