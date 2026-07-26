package array.searching.arraylistsearch;

import java.util.ArrayList;

public class ArraylistBs {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);

        int target = 40;

        int left = 0;
        int right = list.size()-1;
        int index = -1;

        while (left<=right) {
            int mid = (left+right)/2;

            if (list.get(mid) == target) {
                index = mid;
                break;
            } else if (target < list.get(mid)) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        System.out.println("target at: " + index);
    }
}
