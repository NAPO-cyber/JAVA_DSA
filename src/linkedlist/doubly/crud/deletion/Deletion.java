package linkedlist.doubly.crud.deletion;

public class Deletion {

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    static Node head = null;

    public static void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " <-> ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    // dlt from beginning
    public static void beginning() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        } // else

        head = head.next;
        head.prev = null;
    }

    // dlt from end
    public static void end() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        } // else

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.prev.next = null;
    }

    // dlt from a position
    public static void position(int pos) {
        // empty list
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        // dlt first node
        if (pos == 0) {
            beginning();
            return;
        } // else
        Node curr = head;
        for (int i=0; i<pos && curr!=null; i++) {
            curr = curr.next;
        }

        // invalid position
        if (curr == null) {
            System.out.println("invalid position");
            return;
        }

        // dlting last node
        if (curr.next == null) {
            curr.prev.next = null;
            return;
        }

        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;
    }


    public static void main(String[] args) {
        head = new Node(10);
        Node two = new Node(20);
        Node three = new Node(30);
        Node four = new Node(40);
        Node five = new Node(50);

        head.next = two;
        two.prev = head;
        two.next = three;
        three.prev = two;
        three.next = four;
        four.prev = three;
        four.next = five;
        five.prev = four;
        five.next = null;

        System.out.println("normal traversal:");
        display();
        System.out.println();

        System.out.println("deleting from the beginning");
        beginning();
        display();
        System.out.println();

        System.out.println("deleting from the end");
        end();
        display();
        System.out.println();

        System.out.println("deleting from a position");
        position(1);
        display();
    }
}
