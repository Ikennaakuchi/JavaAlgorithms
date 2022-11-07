package codewars;

public class week3WBS {
    public static void main(String[] args) {
    int res = numberOfJewelsInStones("aA", "aAAbbbb");
        System.out.println(res);
    }
    public static int numberOfJewelsInStones(String jewels, String stones){
        int count = 0;
        for (int i = 0; i<stones.length(); i++){
            if (jewels.contains(String.valueOf(stones.charAt(i)))){
                count++;
            }
        }
        return count;
    }
}
