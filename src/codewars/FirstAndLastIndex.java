package codewars;

import java.util.Arrays;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 4, 3, 2, 7, 8};
        System.out.println(Arrays.toString(findFirstAndLast(nums, 2)));
    }
    static int[] findFirstAndLast(int[] nums, int target){
        int[] ans = {-1, -1};
        ans[0] = findFirstIndex(nums, target);
        ans[1] = findLastIndex(nums, target);
        return ans;
    }
     static int findFirstIndex(int[] nums, int target){
        int ans = -1;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target){
                ans = i;
                break;
            }
        }
        return ans;
     }
    static  int findLastIndex(int[] nums, int target){
        int ans = -1;
        for (int i = nums.length - 1; i >= 0; i--){
            if (nums[i] == target){
                ans = i;
                break;
            }
        }
        return ans;
    }










}
//    public static int[] searchRange(int[] nums, int target) {
//        int[] ans = {-1,-1};
//        int first = search(nums, target, true);
//        int last = search(nums, target, false);
//        ans[0] = first;
//        ans[1] = last;
//        return ans;
//    }
//    public static int search(int[] nums, int target, boolean firstIndex){
//        int start = 0;
//        int end = nums.length - 1;
//        int ans = -1;
//        while (start <= end){
//            int mid = start + (end - start)/2;
//            if (target < nums[mid]){
//                end = mid - 1;
//            }else if (target > nums[mid]){
//                start = mid + 1;
//            }else{
//                ans = mid;
//                if (firstIndex){
//                    end = mid - 1;
//                }else{
//                    start = mid + 1;
//                }
//            }
//        }
//        return ans;
//    }
//}

