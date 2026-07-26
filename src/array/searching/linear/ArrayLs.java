package array.searching.linear;

// Checks each element one by one.

public class ArrayLs {
    public static void main(String[] args) {

        int[] sortedArr = {10,20,30,40,50,60,70};
//        int[] unsortedArr = {40,70,30,60,20,10,50};
        int target = 40;
        int index = -1;

        for (int i=0; i<sortedArr.length; i++) {
            if (sortedArr[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println("target at: " + index);
    }
}
