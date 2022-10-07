package codewars;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DecagonAlgo1 {
    //    return true for strings with unique characters and false for
//    strings with ununique characters
    public static void main(String[] args) {
        System.out.println(Unigue("abcbdfst"));
    }

    public static boolean Unigue(String str) {
        Set<Character> st = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
//        if (str.indexOf(ch[i]) != str.lastIndexOf(ch[i]))
            st.add(str.charAt(i));
        }
        if (str.length() != st.size()) {
            System.out.println(st);
            return false;
        }
        return true;
    }
}
