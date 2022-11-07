package codewars;

public class IntegerToBinary {
    public static void main(String[] args) {
        System.out.println(nbDig(10, 1));
    }

    public static int nbDig(int n, int d) {
        int count = 0;
        String str = "";
        for (int i = 0; i <= n; i++){
//            str += (i * i);
            str += Math.pow(i, 2);
        }
        for (int j = 0; j < str.length(); j++){
            if (String.valueOf(str.charAt(j)).equals(String.valueOf(d))){
                count++;
            }
        }
        return count;
    }
}
