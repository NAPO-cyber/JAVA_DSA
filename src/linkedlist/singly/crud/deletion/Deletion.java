package linkedlist.singly.crud.deletion;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Deletion {
    static Node head = null;

    // dlt from beginning
    static void beginning() {
        if (head == null) {
            System.out.println("list is empty...");
            return;
        } // else
        head = head.next;
    }

    // dlt from end
    static void end() {

        // if empty
        if (head == null) {
            System.out.println("list is empty...");
            return;
        }

        // if one node is there
        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        // reach last second node
        while (temp.next.next != null) {
            temp = temp.next;
        }
        // remove last node
        temp.next = null;
    }

    // dlt from position
    static void position(int pos) {
        if (head == null) {
            System.out.println("list is empty...");
            return;
        }

        if (pos == 0) {
            head = head.next;
            return;
        }

        Node temp = head;
        // reach node before the position
        for (int i=0; i<pos-1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("invalid position!");
            return;
        }

        temp.next = temp.next.next;
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
        head = new Node(10);
        head.next = new Node(90);
        head.next.next = new Node(50);
        head.next.next.next = new Node(70);
        head.next.next.next.next = new Node(80);

        traverse();
        System.out.println("list before any deletion");
        System.out.println();

        beginning();
        traverse();
        System.out.println("after dlt from beginning");
        System.out.println();

        end();
        traverse();
        System.out.println("after dlt from end");
        System.out.println();

        position(2);
        traverse();
        System.out.println("deletion at position.");
    }
}
