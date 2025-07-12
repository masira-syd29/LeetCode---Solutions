import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        //brute force
        // Set<List<Integer>> st = new HashSet<>();
        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         for(int k=j+1; k<n; k++){
        //             if(arr[i]+arr[j]+arr[k] == 0){ //TCO(N^3)->
        //                 List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
        //                 temp.sort(null);
        //                 st.add(temp);
        //             }
        //         }
        //     }
        // }
        // List<List<Integer>> ans = new ArrayList<>(st);
        // return ans;

        //Better
        // Set<List<Integer>> st = new HashSet<>();
        // for(int i=0; i<n; i++){
        //     Set<Integer> hashSet = new HashSet<>();
        //     for(int j=i+1; j<n; j++){
        //         int third = -(arr[i]+arr[j]);

        //         if(hashSet.contains(third)){
        //             List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
        //             temp.sort(null);
        //             st.add(temp);
        //         }
        //         hashSet.add(arr[j]);
        //     }

        // }
        // List<List<Integer>> ans = new ArrayList<>(st);
        // return ans;

        //optimal
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<n; i++){
            if(i != 0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                } else if(sum > 0){
                    k--;
                } else {
                    List<Integer> temp  = Arrays.asList(nums[i], nums[j], nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]) j++;
                    while(j<k && nums[k] == nums[k+1]) k--;

                }
            }

        }
        return ans;
    }
}
