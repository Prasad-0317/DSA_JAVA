package DSA.Bit_Manipul;

public class first_ele_34 {
    static int binary(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int mid=0;
        while(low<high){
            mid = low + (high-low)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid] < target){
                low = mid+1;
            }
            else high = mid -1;
        }

        return mid;
    }
    static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        int mid = binary(nums,target);
        if(nums.length==0 || (nums[mid]!=target)){
            ans[0]=-1;
            ans[1]=-1;
            return ans;
        }

        int i = mid;
        int j = mid;
        while(i>=0 && nums[i]==nums[mid]){
            i--;
        }
        while(j<nums.length && nums[j]==nums[mid]){
            j++;
        }
        ans[0] = i+1;
        ans[1] = j-1;
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,4};
        int target = 4;
        int[] ansfin = searchRange(arr, target);
        for (int j : ansfin) {
            System.out.print(j + " ");
        }
    }
}
