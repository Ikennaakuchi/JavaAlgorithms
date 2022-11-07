package codewars;

import java.util.Scanner;

public class CheckArmstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
       System.out.println(isArmstrong(num));
//        for (int i = 100; i < 1000; i++) {
//            if (isArmstrong(i)) {
//                System.out.println(i);
//            }
//        }
    }
    public static boolean isArmstrong(int num){
        int originalVal = num;
        int sum = 0;
        while(num > 0){
            int rem = num % 10;
            double cube = Math.pow(rem, 3);
            sum += cube;
            num /= 10;
        }
        if (sum == originalVal){
            return true;
        }
        return false;
    }
}
