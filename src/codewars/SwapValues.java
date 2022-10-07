package codewars;

import java.util.Arrays;

public class SwapValues {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,23};
        SwapVal(arr, 2, 4);
        System.out.println(Arrays.toString(arr));
    }
    public static void SwapVal(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
