import java.util.Arrays;

public class LongestConsecutiveSequence {
    //Brute force
//    public static boolean linearSearch(int[] nums, int num){
//        int n = nums.length;
//        for(int i=0; i<n; i++){
//            if(nums[i] == num) return true;
//        }
//        return false;
//    }
//    public int longestConsecutive(int[] nums) {
//        int n = nums.length;
//        int longest = 1;
//        for(int i=0; i<n; i++){
//            int x = nums[i];
//            int cnt = 1;
//            while(linearSearch(nums, x+1) == true){
//                x += 1;
//                cnt += 1;
//            }
//            longest = Math.max(longest, cnt);
//        }
//        return longest;
//    }

    //better
    public static int longestConsecutive(int[] nums){
        int n = nums.length;
        if(n == 0) return 0;
        Arrays.sort(nums);
        int lastsmallest = Integer.MIN_VALUE;
        int cnt = 0;
        int longest = 1;
        for(int i=0; i<n; i++){
            if(nums[i]-1 == lastsmallest){
                cnt += 1;
                lastsmallest = nums[i];
            } else if(nums[i] != lastsmallest){
                cnt = 1;
                lastsmallest = nums[i];
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }

    //optimal
    // public static int longestConsecutive(int[] nums){
    //     int n = nums.length;
    //     if(n == 0) return 0;
    //     int longest = 1;
    //     Set<Integer> set = new HashSet<>();

    //     for(int i=0; i<n; i++){
    //         set.add(nums[i]);
    //     }
    //     for(int it: set){
    //         if(!set.contains(it-1)){
    //             int cnt = 1;
    //             int x = it;
    //             while(set.contains(x+1)){
    //                 x = x+1;
    //                 cnt = cnt +1;
    //             }
    //             longest = Math.max(longest, cnt);
    //         }
    //     }
    //     return longest;
    // }

}
