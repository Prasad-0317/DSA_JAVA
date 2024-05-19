package DSA.Recursions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class combination_sum2 {
    static void findCombinations(int ind, int[] arr, int target, Set< List < Integer >> ans, List< Integer > ds) {
        if (ind == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList< >(ds));
            }
            return;
        }

        if (arr[ind] <= target) {
            ds.add(arr[ind]);
            findCombinations(ind, arr, target - arr[ind], ans, ds);
            ds.remove(ds.size() - 1);
        }
        findCombinations(ind + 1, arr, target, ans, ds);
    }

    public static void  main(String[] args) {
        int arr[] = {2,3,6,7};
        int target = 6;
        Set < List < Integer >> ans = new HashSet<>();
        findCombinations(0,arr, target,ans,new ArrayList<>());
        System.out.println(ans);
//        return ans;
    }
}
