package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HighestAndSmallest {
    public static void main(String[] args) {
        String res = highAndLow("286135");
        System.out.println(res);
    }

    public static String highAndLow(String numbers) {
        String[] numArr = numbers.split("j");
        ArrayList<Integer> result = new ArrayList<>();
        for (String i: numArr){
            result.add(Integer.parseInt(i));
        }
        Collections.sort(result);
            return  result.get(result.size() - 1) + " " + result.get(0);
        }

//    public static String highAndLow2(String numbers) {
//        // Code here or
//        String[] num = numbers.split(" ");
//        ArrayList<Integer> list = new ArrayList<>();
//        for(String s : num){
//            list.add(Integer.parseInt(s));
//        }
//        Collections.sort(list);
//
//        return list.get(list.size() - 1) + " " + list.get(0);
//    }

//    public static String highAndLow2(String numbers) {
//        String[] array = numbers.split(" ");
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        for (int i=0; i< array.length; i++){
//            int value = Integer.parseInt(array[i]);
//            if (value < min) min = value;
//            if (value > max) max = value;
//        }
//        return String.format("%d %d", max, min);
//    }
}

