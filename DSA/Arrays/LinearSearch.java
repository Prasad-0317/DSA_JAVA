package DSA.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch {
    //    static boolean search(int[] arr , int target ,int index){
//        if(index== arr.length) return false;
//        return arr[index]==target || search(arr,target,index+1);
//    }
    static int searchIndex(int[] arr, int target, int index) {
        if (index == arr.length) return -1;
        if (arr[index] == target) {
            return index;
        } else {
            return searchIndex(arr, target, index + 1);
        }
    }

//    static ArrayList<Integer> list = new ArrayList<>();
//    static void searchAllIndex(int[] arr, int target, int index) {
//        if (index == arr.length) return;
//        if (arr[index] == target) {
//            list.add(index);
//        }
//        searchAllIndex(arr, target, index + 1);
//    }

    static ArrayList<Integer> findAll(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAll(arr,target,index+1,list);
    }

    static ArrayList<Integer> findAll2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> prevCall = findAll2(arr,target,index+1);
        list.addAll(prevCall);
        return list;
    }

    public static void main (String[]args){
        int[] arr = {1, 2,3,4,4,8};
//        System.out.println(searchIndex(arr1, 2, 0));
//        searchAllIndex(arr,2,0);
//        System.out.println(list);
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> ans = findAll(arr,2,0,list);
//        System.out.println(ans);
//        System.out.println(list);
        System.out.println(findAll2(arr,4,0));
    }
}
