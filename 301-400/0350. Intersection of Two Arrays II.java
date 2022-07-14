class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        List<Integer> list = new ArrayList<Integer>();
        
        int n1 = 0;
        int n2 = 0;
        
        while(n1<nums1.length && n2<nums2.length){
            if(nums1[n1] < nums2[n2]){
                n1++;
            }
            else if(nums1[n1] > nums2[n2]){
                n2++;
            }
            else{
                list.add(nums1[n1]);
                n1++;
                n2++;
            }
        }
        
        int[] arr = new int[list.size()];
        
        for(int i=0;i<list.size();i++){
            arr[i] = list.get(i);
        }
        
        return arr;
    }
}