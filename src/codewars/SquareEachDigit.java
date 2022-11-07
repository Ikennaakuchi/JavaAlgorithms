package codewars;

public class SquareEachDigit {
    public static void main(String[] args) {
        System.out.println(squareDigits(2456));
    }
    public static int squareDigits(int n) {
        String str = "" + n;
        String[] resStr = str.split("");
        String res = "";
        for (String s : resStr) {
            double val = Math.pow(Integer.parseInt(s), 2);
            res += (int)val;
        }
            return Integer.parseInt(res);
        }
    }
