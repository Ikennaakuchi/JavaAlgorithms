package codewars;

public class FloorOfANumber {
    public static void main(String[] args) {
            int[] arr = {2,3,5,9,14,16,18};
            System.out.println(findCeiling(arr, 9));

        }
        static int findCeiling(int[] arr, int target){
        if (target == arr[0]){
            return -1;
        }
            int start = 0;
            int end = arr.length-1;
            while(start <= end){
                int mid = start + (end - start)/2;
                if (arr[mid] < target){
                    start = mid + 1;}
                else if(arr[mid] > target){
                    end = mid-1;
                }else{
                    return mid;
                }
            }
            return end;
        }
}

