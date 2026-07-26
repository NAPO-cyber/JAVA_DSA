package array.searching.arraysearch;

// Keeps dividing the array in half. (divide & conquer)...
// works on sorted arrays only.

public class ArrayBs {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,60,70};
        int target = 50;

        int left = 0;
        int right = arr.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = (left+right)/2;

            if (arr[mid] == target) {
                index = mid;
                break;
            } else if (target < arr[mid]) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        System.out.println("target at: " + index);
    }
}
