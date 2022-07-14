class Solution {
    public String convert(String s, int numRows) {
        
        if(numRows==1)
            return s;
        
        char[] charArr = new char[s.length()];
        int k=0;
        
        //0th row
        int count=0;
        while(count<s.length()){
            charArr[k++] = s.charAt(count);
            count += (numRows-1)*2;
        }
        
        int bin=0;//alternates between 0 and 1
        
        //for the rows in between 0 and numRows-1
        for(int i=1;i<numRows-1;i++){
            bin=0;//start with 0 
            count = i;
            
            while(count<s.length()){
                charArr[k++] = s.charAt(count);
                count += (bin==0 ? (numRows-i-1)*2 : i*2 );
                bin = 1-bin;//0 becomes 1, 1 becomes 0
            }
        }
            
        //(numRows-1)th row
        count=numRows-1;
        while(count<s.length()){
            charArr[k++] = s.charAt(count);
            count += (numRows-1)*2;
        }
        
        return String.valueOf(charArr);
    }
}