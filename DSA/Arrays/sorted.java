package DSA.Arrays;

public class sorted {
    static boolean sorted(int[] arr, int index){
        if(index == arr.length-1) return true;
        return arr[index] < arr[index+1] && sorted(arr,index+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,37,5,7};
        System.out.println(sorted(arr,0));
    }
}
