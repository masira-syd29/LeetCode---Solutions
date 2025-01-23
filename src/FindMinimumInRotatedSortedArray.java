public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int low=0, high=nums.length-1;
        int ans = Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low+high)/2;

            //search space is already sorted
            //then arr[low] will always be
            //the minimum in that search space
            if(nums[low]<=nums[high]){
                ans = Math.min(ans, nums[low]);
                break;
            }
            if(nums[low] <= nums[mid]){
                ans = Math.min(ans, nums[low]);
                low = mid+1;
            } else {
                ans = Math.min(ans, nums[mid]);
                high = mid-1;
            }
        }
        return ans;

    }
}
