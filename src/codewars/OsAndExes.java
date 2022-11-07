package codewars;

public class OsAndExes {
    public static void main(String[] args) {
        System.out.println(getXO("ooxx"));
    }
    public static boolean getXO (String str) {
        int countO = 0;
        int countX = 0;
        for(int i = 0; i < str.length(); i++){
            if (String.valueOf(str.charAt(i)).equalsIgnoreCase("o")){
                countO++;
            }
            if (String.valueOf(str.charAt(i)).equalsIgnoreCase("x")){
                countX++;
            }
            if (!(str.contains("x") || (str.contains("X")) || (str.contains("o")) || (str.contains("O")))){
                return true;
            }
        }
        return countO == countX;
    }
}
