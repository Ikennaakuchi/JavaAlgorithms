package codewars;

import java.util.ArrayList;
import java.util.List;

public class VowelCount {
    public static void main(String[] args) {
        System.out.println(getCount("abragadabra"));
    }
    public static int getCount(String str) {
//        int count = 0;
//        for (int i = 0; i<str.length(); i++){
//            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
//                    || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
//                count++;
//            }
//        }
//        return count;
//    }
//OR
    int count = 0;
    ArrayList<Character> vowels = new ArrayList<>();
    vowels.add('A'); vowels.add('e');
    vowels.add('E'); vowels.add('a');
    vowels.add('I'); vowels.add('i');
    vowels.add('O'); vowels.add('o');
    vowels.add('U'); vowels.add('u');

    for(int i = 0; i<str.length(); i++){
        for (int j=0; j<vowels.size(); j++){
            if (str.charAt(i) == vowels.get(j)){
                count++;
            }
        }
    }
    return  count;
    }
}
