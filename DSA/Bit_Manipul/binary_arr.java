package DSA.Bit_Manipul;

public class binary_arr {
    public static void main(String[] args) {
        int[] arr = {2,5,7,9};
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(Integer.toBinaryString(arr[i]));
        }
        System.out.println(arr[3]);
    }
}
