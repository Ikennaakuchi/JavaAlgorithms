package codewars;

import java.util.Arrays;

public class FindDeletedNumber {
    public static void main(String[] args) {
        System.out.println(findDeletedNumber(new int[] {1,2,3,4,5,6,7,8,9}, new int[] {3,2,4,6,7,8,1,9}));
    }

    public static int findDeletedNumber(int[] arr, int[] mixedArr) {
        String st = Arrays.toString(arr);
        int[] res = new int[1];
        for (int i = 0; i < mixedArr.length; i++){
            if (!st.contains(String.valueOf(mixedArr[i]))){
                res[0] = mixedArr[i];
            }
        }
        return res[0];
    }
}
