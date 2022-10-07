package codewars;

public class LinearSearch {
    public static void main(String[] args) {
    int[] arr = {2,5,3,67,24,14};
    int res = searchValue(30,arr);
        System.out.println(res);
    }
    public static int searchValue(int target, int[] arr){
        for (int i=0; i<arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
