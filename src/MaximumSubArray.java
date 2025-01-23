public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxi = nums[0];

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(sum>maxi)
                maxi = sum;
            if(sum<0)
                sum = 0;
        }
        return maxi;
    }
}
//Brute force approach
/*public static int maxSubarraySum(int[] arr, int n) {
        int maxi = Integer.MIN_VALUE; // maximum sum

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // subarray = arr[i.....j]
                int sum = 0;

                //add all the elements of subarray:
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }

                maxi = Math.max(maxi, sum);
            }
        }

        return maxi;
    } */

