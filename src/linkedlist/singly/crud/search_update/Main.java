package linkedlist.singly.crud.search_update;

public class Main {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    static void searchList(int target) {
        Node curr = head;
        int pos = 0;

        while (curr != null) {
            if (curr.data == target) {
                System.out.println(target + " at: " + pos);
                return;
            } // else
            curr = curr.next;
            pos++;
        }
        System.out.println(target + " not found in the list...");
    }

    static void updateList(int newVal, int oldVal) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == oldVal) {
                curr.data = newVal;
                System.out.println("value updated successfully.");
                return;
            }
            curr = curr.next;
        }
        System.out.println("value not found to update.");
    }

    static void traverse() {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        head = new Node(200);
        head.next = new Node(170);
        head.next.next = new Node(10);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(90);
        System.out.println("just a traversal.");
        traverse();
        System.out.println();

        searchList(20);
        System.out.println();

        updateList(250, 170);
        System.out.println("after updation:");
        traverse();
    }
}
