class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        Set<Integer> set = new HashSet<Integer>();
        
        int n1=0;
        int n2=0;
        
        while(n1<nums1.length && n2<nums2.length){
            if(nums1[n1] < nums2[n2]){
                n1++;
            }
            else if(nums1[n1] > nums2[n2]){
                n2++;
            }
            else{
                set.add(nums1[n1]);
                n1++;
                n2++;
            }
        }
        
        int[] arr = new int[set.size()];
        int k=0;
        for(int i: set){
            arr[k++] = i;
        }
        
        return arr;
    }
}