package array.crud;
import java.util.Arrays;

public class StaticArr {
    public static void main(String[] args) {
        // create
        int[] arr = new int[5];

        // insert
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println(Arrays.toString(arr));

        // read single element
        System.out.println(arr[3]);
        System.out.println();

        // read all elements
        for (int i: arr) {
            System.out.println(i);
        }
        System.out.println();

        // update
        arr[2] = 100;
        System.out.println(Arrays.toString(arr));

        // delete
        // arr is fixed so no dlt operation... BUT just set it 0.
        arr[2] = 0;
        System.out.println(Arrays.toString(arr));
    }
}
