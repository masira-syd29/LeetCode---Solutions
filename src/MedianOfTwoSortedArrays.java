public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2){
        if(nums1.length > nums2.length){
            return findMedianSortedArrays(nums2, nums1);
        }
        int m = nums1.length;
        int n = nums2.length;
        int low = 0;
        int high = m;

        while(low<=high){
            int i = (low+high)/2;
            int j = (m+n+1)/2-i;

            int maxLeftNums1 = (i==0) ? Integer.MIN_VALUE : nums1[i-1];
            int minRightNums1 = (i==m) ? Integer.MAX_VALUE : nums1[i];

            int maxLeftNums2 = (j==0) ? Integer.MIN_VALUE : nums2[j-1];
            int minRightNums2 = (j==n) ? Integer.MAX_VALUE : nums2[j];

            if(maxLeftNums1 <= minRightNums2 && maxLeftNums2 <= minRightNums1){
                if((m+n)%2 == 0){
                    return ((Math.max(maxLeftNums1,maxLeftNums2)+Math.min(minRightNums1,minRightNums2))/2.0);
                } else {
                    return Math.max(maxLeftNums1,maxLeftNums2);
                }
            }
            else if(maxLeftNums1 > minRightNums2) {
                high = i-1;
            }
            else {
                low = i+1;
            }



        }
        throw new IllegalArgumentException("Input arrays are not sorted.");

    }
}
