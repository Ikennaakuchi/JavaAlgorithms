package codewars;

public class SumPositives {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, 2, 4, 5, 8, 2, 6, 3}));
    }
    public static int sum(int[] arr){
            int sum =0;
            for (int i =0; i< arr.length; i++){
            if (arr[i] > 0){
                sum += arr[i];
            }
            }
                return sum;
        }
    }

