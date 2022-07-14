class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        int r2 = n2-1;
        int r1 = n1-1;
        
        int[] nums = new int[n1+n2];
        int k = nums.length-1;
        
        while(r2>=0 && r1>=0){
            
            if(nums2[r2] > nums1[r1]){
                nums[k--] = nums2[r2--];
            }
            else{
                nums[k--] = nums1[r1--];
            }
        }
        
        while(r2>=0){
            nums[k--] = nums2[r2--];
        }
        
        while(r1>=0){
            nums[k--] = nums1[r1--];
        }

        return median(nums);
    }
    
    public double median(int[] arr){
        int n = arr.length;
        
        int mid1,mid2;
        
        if(n%2!=0){
            mid1 = n/2;
            
            return arr[mid1];
        }
        else{
            mid1 = n/2-1;
            mid2 = n/2;
            
            return (double)(arr[mid1]+arr[mid2])/2;
        }
        
    }
}