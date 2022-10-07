package codewars;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-20, -15, -14, -10, -3, 0, 2,5,9,12,24,56};
        System.out.println(find(arr, 24));

    }
    public static int find(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while (end > start){
            int mid = start + (end - start)/2;
            if (arr[mid] < target){
                start = mid + 1;
            }else if(arr[mid] > target){
                end = mid -1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
