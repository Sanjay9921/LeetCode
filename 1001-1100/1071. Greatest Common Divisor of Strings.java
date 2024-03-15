// Time Complexity:= O(M+N) // GCD Function: log(M x N) Binary Euclidiean Algo + O(M+N) two concatenations of length
// Space Complexity:= O(M + N) // two concatenations of length

class Solution {
    
    public int gcd(int m, int n){
        if(n==0){
            return m;
        }
        else{
            return gcd(n,m%n);   
        }
    }
    
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        
        int size = gcd(str1.length(), str2.length());
        return str1.substring(0, size);
    }
}