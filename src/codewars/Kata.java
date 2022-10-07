package codewars;

public class Kata {
    public static void main(String[] args) {
        System.out.println(reverseWords("bring money"));
    }

    public static String reverseWords(final String original) {
        String[] st = original.split(" ");
        if (st.length == 0){
            return original;
        }
        int i = 0;
        for (String e : st) {
            StringBuilder res = new StringBuilder(e);
            st[i] = String.valueOf(res.reverse());
            i++;
        }
        return String.join(" ", st);
    }
}

//public class Kata
//{
//    public static String reverseWords(final String original)
//    {
//        String[] st = original.split(" ");
//        if (st.length == 0){
//            return original;
//        }
//        int i = 0;
//        for (String e: st){
//            StringBuilder res = new StringBuilder(e);
//            st[i] = String.valueOf(res.reverse());
//            i++;
//        }
//        return String.join(" ", st);
//    }
//}