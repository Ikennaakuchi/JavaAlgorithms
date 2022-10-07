package codewars;

public class Sum{
    public static void main(String[] args) {
        System.out.println(GetSum(4,1));
    }
    public static int GetSum(int a, int b){
        int sum = 0;
        for (int i = a; i<= b; i++){
            sum+=i;
        }
        if (a == b){
            return a;
        }
            //Good luck!
            return sum;
        }
    }

