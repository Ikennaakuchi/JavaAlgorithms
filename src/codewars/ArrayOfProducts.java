package codewars;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfProducts {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(List.of(5,1,2,3,4));
        System.out.println(arrayOfProducts(array));
        System.out.println(arrayOfProducts2(array));
    }
    public static List<Integer> arrayOfProducts(List<Integer> array) {
        List<Integer> ans = new ArrayList<>();
        int j = 0;
        while (ans.size() != array.size()) {
            int k = 0;
            int product = 1;
            while (k < array.size()) {
                if (k == j) {
                    k++;
                    continue;
                }
                product *= array.get(k);
                k++;
            }
            j++;
            ans.add(product);
        }
        return ans;
    }

    public static List<Integer> arrayOfProducts2(List<Integer> array){
        List<Integer> answer = new ArrayList<>();
        int product = 1;
        for (Integer e: array){
            product *= e;
        }

        for(Integer e: array){
            answer.add(product/e);
        }
        return answer;
    }
}
