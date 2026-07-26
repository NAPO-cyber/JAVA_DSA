package array.traversal;

import java.util.ArrayList;

public class ArrayListTrav {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        // forward traversal
        for (int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // reverse traversal
        for (int j=list.size()-1; j>=0; j--) {
            System.out.print(list.get(j) + " ");
        }
    }
}
