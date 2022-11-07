package codewars;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(findCeiling(arr, 14));
    }
    static int findCeiling(int[] arr, int target) {
//        if (target > arr[arr.length-1]){
//            return -1;
//        }
//        int start = 0;
//        int end = arr.length-1;
//        while(start <= end){
//            int mid = start + (end - start)/2;
//            if (arr[mid] < target){
//                start = mid + 1;}
//            else if(arr[mid] > target){
//                    end = mid-1;
//            }else{
//                return mid;
//            }
//        }
//        return arr[start];
        int start = 0;
        int end = arr.length - 1;
        if (target > arr[end]){
            return -1;
        }

        while (start < end){
            int mid = start + (end - start)/2 ;
            if (target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid -1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
