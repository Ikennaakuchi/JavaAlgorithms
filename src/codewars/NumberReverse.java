package codewars;

import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String res = "";
        while (number > 0){
            int rem = number % 10;
            res += rem;
            number /= 10;
        }
        System.out.println(res);
    }
}
