package DSA.Sliding_window;

public class subarray_product {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int i = 0;

        int cnt =0;

        while(i<nums.length){
            if(nums[i]<k){
                cnt++;
            }
            if(i!=nums.length-1){
                int j= i+1;
                int pro =nums[i]*nums[j];
                while(pro < k && j < nums.length){
                    cnt++;
                    if(j<nums.length-1) {
                        pro = pro*nums[++j];
                    }
                    else break;
                }
            }
            i++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr= {10,5,2,6};
        int ans = numSubarrayProductLessThanK(arr,100);
        System.out.println(ans);
    }
}
