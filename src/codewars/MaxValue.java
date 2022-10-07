package codewars;

import java.util.Arrays;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {5,17,3,2,4};
        System.out.println(maxVal(arr));
    }
    public static int maxVal(int[] arr){
        int max = arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
