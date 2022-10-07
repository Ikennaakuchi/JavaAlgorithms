package codewars;

import java.util.Arrays;

public class DoubleEverySecondInteger {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(doubleEveryOther(new int[]{2, 3, 4, 8})));
    }

    public static int[] doubleEveryOther(int[] a){
    for (int i = 0; i < a.length; i++){
        if (i != 0 && i % 2 != 0){
            a[i] *= 2;
        }
    }
      return a;
    }
}
