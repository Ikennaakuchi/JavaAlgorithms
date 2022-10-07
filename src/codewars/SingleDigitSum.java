package codewars;

public class SingleDigitSum {

//Given n, take tsum of the digits of n. If that value has more than
// one digit, continue reducing a single-digit number is produced

//    158 = 1 + 5 + 8 = 14 = 1 + 4 = 5

    public static void main(String[] args) {
        System.out.println(digitSum(376));
    }

    public static int digitSum(int n){
        int sum = 0;
        while (n > 0){
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        if (sum > 9) {
            digitSum(sum);
            return sum;
        }
        return sum;
    }
}
