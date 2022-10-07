package codewars;

public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] arr = {2,34,25,7898,234,231234};
        System.out.println(countEven2(arr));

    }
    public static int countEven(int[] arr){
        int count = 0;
        for (int elem: arr){
           int res = (int)(Math.log10(elem)) + 1;
           if (res % 2 == 0){
               count++;
           }
        }
        return count;
    }
//    ALTERNATIVELY
    public static int countEven2(int[] arr){
    int count = 0;
    for (int e: arr){
        int res = (e + "").length();
        if (res % 2 == 0){
            count++;
        }
    }
    return count;
    }
}
