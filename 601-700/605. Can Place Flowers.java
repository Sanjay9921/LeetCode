// Time Complexity:= O(N)
// Space Complexity:= O(1)

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if(n<=0){
            return true;
        }

        int count = 0;
        int m = flowerbed.length;

        for(int i=0;i<m;i++){
            if(flowerbed[i]==0){
                int prev = (i==0 || flowerbed[i-1]==0) ? 0 : 1;
                int next = (i==m-1 || flowerbed[i+1]==0) ? 0 : 1;
                if(prev==0 && next==0){
                    i++;
                    count++;
                    if(count>=n){
                        return true;
                    }
                }
            }
        }

        return count>=n;
    }
}