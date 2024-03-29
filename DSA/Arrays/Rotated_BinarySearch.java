package DSA.Arrays;

public class Rotated_BinarySearch {
    static int search(int[] arr, int start,int end, int target){
        if(start>end) return -1;
        int mid = start + (end-start)/2;
        if(arr[mid] == target) return mid;

        if(arr[start] <= arr[mid]){
            if(arr[start] <= target && arr[mid] >= target){
                return search(arr,start,mid-1,target);
            }
            else{
                return search(arr,mid+1,end,target);
            }
        }
        if(target > arr[mid] && target<=arr[end]){
            return search(arr,mid+1,end,target);
        }
        else{
            return search(arr,start,mid-1,target);
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(search(arr,0,arr.length-1,3));
    }
}
