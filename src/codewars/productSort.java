package codewars;

import java.util.Arrays;

public class productSort {
    public static void main(String[] args) {
        int[] res = sortByValueAndIndex(new int[] {23, 2, 3, 4, 5});
        System.out.println(Arrays.toString(res));
    }

    public static int[] sortByValueAndIndex(int[] array) {
        int[] resArr = new int[array.length];
        for (int j = 0; j < array.length; j++){
            resArr[j] = array[j] * (j + 1);
        }
        Arrays.sort(resArr);
        return resArr;
    }
}
