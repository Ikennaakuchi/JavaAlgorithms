package codewars;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,1,6,3,-1,4,5};
//        for (int j = arr.length-1; j>0; j--){
//            for(int i = 0; i < arr.length-1; i++){
//                if (arr[i] > arr[i+1]){
//                    swap(arr, i, i+1);
        for (int j= arr.length-1; j>0; j--){
            int largest =0;
            for (int i=1; i<=j; i++){
                if (arr[i] > arr[largest]){
                    largest =i;
                }
            }
            swap(arr, largest, j);
        }

        System.out.println(arr);
        for (int i = 0; i < arr.length-1; i++){
            System.out.println(arr[i]);
        }
    }
    public static void swap(int[] arr, int i, int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
