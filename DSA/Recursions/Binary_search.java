package DSA.Recursions;

public class Binary_search {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,56,67,78};
        int target = 77;
        int ans = BS(arr,target , 0, arr.length-1);
        System.out.println(ans);
    }
    static int BS(int arr[] , int target , int start , int end){
        int mid = (start+end)/2;
        if(start > end) return -1;
        if(arr[mid] == target) {
            return mid;
        }
        else if (arr[mid] < target){
            return BS(arr,target,mid+1, end);
        }
        else{
            return BS(arr,target,start, mid-1);
        }
    }
}
