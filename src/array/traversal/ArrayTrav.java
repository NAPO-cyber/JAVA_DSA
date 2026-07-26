package array.traversal;

public class ArrayTrav {
    public static void main(String[] args) {

        int[] arr = {10,15,20,25,30,35,40,45,50};

        // forward traversal
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        // reverse traversal
        for (int j=arr.length-1; j>=0; j--) {
            System.out.print(arr[j] + " ");
        }
    }
}
