import java.util.ArrayList;
import java.util.Collections;

public class LeadersInAnArray {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        // Brute force
        // int n = arr.length;
        // ArrayList<Integer> ans = new ArrayList<>();
        // for(int i=0; i<n; i++){
        //     boolean leader = true;
        //     for(int j=i+1; j<n; j++){
        //         if(arr[j] > arr[i]){
        //             leader = false;
        //             break;
        //         }
        //     }
        //     if(leader == true) ans.add(arr[i]);
        // }
        // return ans;
        // Last element of an array is always a leader,
        // push into ans array.
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int maxi = arr[n-1];
        ans.add(arr[n-1]);
        for(int i=n-2; i>=0; i--){
            if(arr[i] >= maxi){
                ans.add(arr[i]);
                maxi = arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
