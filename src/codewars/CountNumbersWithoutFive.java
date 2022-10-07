package codewars;

public class CountNumbersWithoutFive {
    public static void main(String[] args) {
        System.out.println(dontGiveMeFive(152,168));
    }
    public static int dontGiveMeFive(int start, int end) {
        int count = 0;
        String st = "";
        for(int i = start; i <= end; i++){
        if(!String.valueOf(i).contains("5")){
            count++;
        }
      }
        return count;
    }
}
