package codewars;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Whitebod {
    public static void main(String[] args) {
        int[] arr = {-1,5,1,2,3,4,5,6,7};
        System.out.println(lowestMissing(arr));
    }
    public static int lowestMissing(int[] num) {
        Arrays.sort(num);
        int init = 1;
            for (int i = 1; i < num.length; i++){
                if (num[i] == init) {
                    init++;
                }
            }
            return init;
        }
    }


