package array.crud;
import java.util.ArrayList;
import java.util.Collection.*;

public class ArrayListCrud {
    public static void main(String[] args) {
        // crate
        ArrayList<Integer> list = new ArrayList<>();

        // insert
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);

        // read
        System.out.println(list.get(1));

        // update
        list.set(1, 100);
        System.out.println(list);

        // delete
        list.remove(1);
        System.out.println(list);
    }
}
