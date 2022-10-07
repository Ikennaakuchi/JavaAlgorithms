package codewars;

import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverseAr(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverseAr(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(end > start){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
