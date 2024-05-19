package DSA;

import java.util.Arrays;

public class Cyclic_sort {
    public static void main(String[] args) {
        int [] arr={3,5,1,7,2,10,4,8,6,9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int i = 0;
        while(i<arr.length){
            int correct = arr[i] -1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }

    }
    static void swap(int[] arr , int first , int sec) {
        int temp = arr[first];
        arr[first]=arr[sec];
        arr[sec]=temp;
    }
}