class Solution {
    public String toHex(int num) {
        if(num==0)
            return "0";
        
        char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        
        StringBuffer sb = new StringBuffer();
        int index=-1;
        
        while(num!=0){
            index = num&15;
            sb.append(map[index]);
            num = num >>> 4; //unsigned right shift
        }
        
        return sb.reverse().toString();
    }
}