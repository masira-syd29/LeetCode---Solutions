import java.util.ArrayList;

public class RearrangeArrayElementsBySign {
    public int[] rearrangeArray(int[] nums) {
        // int n = nums.length;
        // ArrayList<Integer> pos = new ArrayList<>();
        // ArrayList<Integer> neg = new ArrayList<>();
        // for(int i=0; i<n; i++){
        //     if(nums[i] > 0) pos.add(nums[i]);
        //     else neg.add(nums[i]);
        // }
        // for(int i=0; i<n/2; i++){
        //     nums[2*i] = pos.get(i);
        //     nums[2*i+1] = neg.get(i);
        // }
        // return nums;

        //Optimal
        int n = nums.length;
        int[] ans = new int[n];
        int posIndex =0, negIndex = 1;
        for(int i=0; i<n; i++){
            if(nums[i] < 0) {
                ans[negIndex] = nums[i];
                negIndex +=2;
            } else {
                ans[posIndex] = nums[i];
                posIndex +=2;
            }
        }
        return ans;

    }
    public static void rearrange(int[] arr) {
        // Write you code here
        int n = arr.length;
        // code here
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(arr[i] >= 0) pos.add(arr[i]);
            else neg.add(arr[i]);
        }

        int po=0, ne=0, idx=0;
        while(po < pos.size() &&  ne <neg.size()){
            arr[idx++] = pos.get(po++);
            arr[idx++] = neg.get(ne++);
        }
        while(po < pos.size()){
            arr[idx++] = pos.get(po++);
        }
        while(ne< neg.size()){
            arr[idx++] = neg.get(ne++);
        }

//                ArrayList<Integer> pos = new ArrayList<>();
//                ArrayList<Integer> neg = new ArrayList<>();
//                for(int i=0; i<n; i++){
//                    if(arr.get(i) >= 0) pos.add(arr.get(i));
//                    else neg.add(arr.get(i));
//                }
//                arr.clear();
//                int po=0, ne=0;
//                while(po < pos.size() &&  ne <neg.size()){
//                    arr.add(pos.get(po++));
//                    arr.add(neg.get(ne++));
//                }
//                while(po < pos.size()){
//                    arr.add(pos.get(po++));
//                }
//                while(ne< neg.size()){
//                    arr.add(neg.get(ne++));
//                }

    }
}
