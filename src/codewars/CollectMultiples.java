package codewars;

import java.util.Arrays;

public class CollectMultiples {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(multiples(new int[]{2, 3, 5, 6, 7, 10, 20}, 2)));
    }
    public static int[] multiples(int[] numbers, int divisor){
        int count = 0;
        for (int i = 0; i<numbers.length; i++){
            if (numbers[i] % divisor == 0){
                count++;
            }
        }
        int[] result = new int[count];
        int j = 0;
        for (int i = 0; i<numbers.length; i++){
            if (numbers[i] % divisor == 0){
                result[j] = numbers[i];
                j++;
            }
        }
        return result;
    }
}
