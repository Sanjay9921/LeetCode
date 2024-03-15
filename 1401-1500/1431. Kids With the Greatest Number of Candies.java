// Time Complexity:= O(N)
// Space Complexity:= O(N)

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int currMax = candies[0];
        for(int i=1;i<candies.length;i++){
            currMax = (currMax < candies[i] ? candies[i] : currMax);
        }

        List<Boolean> result = new ArrayList<>(candies.length);
        for(int i=0;i<candies.length;i++){
            int t = candies[i] + extraCandies;
            result.add(t>=currMax);
        }

        return result;
    }
}