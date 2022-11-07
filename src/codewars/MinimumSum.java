package codewars;

import java.util.Arrays;

public class MinimumSum {
    public static void main(String[] args) {

    }
    public static int minSum(int[] passed){
        Arrays.sort(passed);
        int j = passed.length - 1;
        int sum = 0;
        for (int i = 0; i < j+1; i++){
            sum += (passed[i] * passed[j]);
            j--;
        }
        return sum;
    }
}
