package codewars;

public class MaximumRow {
    public static void main(String[] args) {
        int[][] arr = {
                {3,5,8},
                {32,34,23},
                {23,400,1}
        };
        int res = maXAcc(arr);
        System.out.println(res);
    }
    public static int maXAcc(int[][] arr){
        int max = 0;
        for (int i=0; i<arr.length; i++){
            int sum = 0;
            for (int j =0; j<arr[i].length; j++){
                sum += arr[i][j];
            }
            if (sum > max){
                max = sum;
            }
        }
        return max;
    }
}
