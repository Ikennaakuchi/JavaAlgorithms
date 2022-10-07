package codewars;

public class GnaToRna {
    public static void main(String[] args) {
        System.out.println(Conv("GCAT"));
    }
    public static String Conv(String dna){
        String ans = dna.replace('T', 'U');
        return ans;
    }
}
