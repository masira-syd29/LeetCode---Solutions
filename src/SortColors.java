public class SortColors {
    public static void sortColors(int[] nums){
        //Brute force
        //Arrays.sort(nums);
        // Better
        // int n = nums.length;
        // int count0 = 0, count1=0, count2=0;
        // for(int i=0; i<n; i++ ){
        //     if(nums[i] == 0)
        //         count0++;
        //     else if (nums[i] == 1)
        //         count1++;
        //     else
        //         count2++;

        // }
        // for(int i=0; i<count0; i++) nums[i] = 0;
        // for(int i=count0; i<count0+count1; i++) nums[i] = 1;
        // for(int i=count0+count1; i<n; i++) nums[i] = 2;

        //optimal
        int n = nums.length;
        int low=0, mid=0, high=n-1;
        while(mid<=high){
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}
