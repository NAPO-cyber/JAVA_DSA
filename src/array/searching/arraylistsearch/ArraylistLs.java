package array.searching.arraylistsearch;

import java.util.ArrayList;

public class ArraylistLs {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        int target = 40;
        int index = -1;

        for (int i=0; i<list.size(); i++) {
            if (list.get(i) == target) {
                index = i;
                break;
            }
        }
        System.out.println("target at: " + index);
    }
}
