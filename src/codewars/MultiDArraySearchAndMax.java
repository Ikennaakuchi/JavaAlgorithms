package codewars;

import java.util.Arrays;

public class MultiDArraySearchAndMax {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 2, 12, 9},
                {18, 12}
        };
        int target = 9;
        int[] ans = findVal(arr, target);

        int res = findMax(arr);
        System.out.println(Arrays.toString(ans));
        System.out.println(res);
    }
    public static int[] findVal(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static int findMax(int[][] arr){
        int max = arr[0][0];
        for (int i = 0; i< arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
