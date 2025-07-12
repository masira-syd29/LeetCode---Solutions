import java.util.List;

public class majorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        //Bruteforce
        // int n = nums.length;
        // List<Integer> ls = new ArrayList<>();      TC -> O(n2)
        // for(int i=0; i<n; i++){
        //     if(ls.size() == 0 || ls.get(0) != nums[i]){
        //         int cnt = 0;
        //         for(int j=0; j<n; j++){
        //             if(nums[j] == nums[i])
        //                 cnt++;
        //         }
        //         if(cnt > n/3)
        //             ls.add(nums[i]);
        //     }
        //     if(ls.size() == 2) break;
        // }
        // return ls;

        // int n = nums.length;
        // List<Integer> ls = new ArrayList<>();
        // HashMap<Integer, Integer> mpp = new HashMap<>();
        // int mini = (int) (n/3)+1;
        // for(int i=0; i<n; i++){
        //     int value = mpp.getOrDefault(nums[i], 0);
        //     mpp.put(nums[i], value+1);

        //     if(mpp.get(nums[i]) == mini)
        //         ls.add(nums[i]);
        //     if(ls.size() == 2) break;
        // }
        // return ls;
        int n = nums.length;
        int cnt1 = 0, cnt2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(cnt1 == 0 && nums[i] != el2){
                cnt1 = 1;
                el1 = nums[i];
            } else if (cnt2 == 0 && nums[i] != el1){
                cnt2 = 1;
                el2 = nums[i];
            }
            else if(el1 == nums[i]) cnt1++;
            else if (el2 == nums[i]) cnt2++;
            else {
                cnt1--;
                cnt2--;
            }
        }

        List<Integer> ls = new ArrayList<>();
        cnt1=0;
        cnt2=0;
        for(int i=0; i<n; i++){
            if(el1 == nums[i]) cnt1++;
            if(el2 == nums[i]) cnt2++;
        }
        int mini = (int)(n/3)+1;
        if(cnt1 >= mini) ls.add(el1);
        if(cnt2 >= mini) ls.add(el2);

        return ls;

    }
}
