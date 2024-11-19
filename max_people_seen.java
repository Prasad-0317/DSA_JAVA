package TCS_nqt;

import java.util.Arrays;
import java.util.Stack;

public class max_people_seen {
    static int[] leftMax(int[] arr, int n){
        Stack<Integer> left = new Stack<>();
        int[] leftmaxi = new int[n];
        leftmaxi[0] = 1;
        left.push(0);
        for(int i=1;i<n;i++){
            while(!left.isEmpty() && arr[left.peek()] <= arr[i]){
                left.pop();
            }
            leftmaxi[i] = left.isEmpty() ? i+1 : i-left.peek();
            left.push(i);
        }
        return leftmaxi;
    }
    static int[] rightMax(int[] arr, int n){
        Stack<Integer> right = new Stack<>();
        int[] rightmaxi = new int[n];
        rightmaxi[n-1] = 1;
        right.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(!right.isEmpty() && arr[right.peek()] <= arr[i]){
                right.pop();
            }
            rightmaxi[i] = right.isEmpty() ? n-i : right.peek() - i;
            right.push(i);
        }
        return rightmaxi;
    }
    static int maxSeen(int[] arr1, int[] arr2, int n){
        int maxi = 0;
        for(int i=0;i<n;i++){
//            maxi = Math.max();
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] heights = { 6, 2, 5, 4, 5, 1, 6 };
        int[] left = leftMax(heights , 7);
        int[] right = rightMax(heights,7);
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));

    }
}
