package linkedlist.circular.circular_singly.crud;

public class Insertion {

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

    public static void traverse() {
        if (head == null) {
            System.out.println("list is empty");
        }

        Node curr = head;
        do {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        } while (curr != head);
        System.out.println(head.data + " (head)");
    }

    public static void beginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }
        newNode.next = head;
        curr.next = newNode;
        head = newNode;
    }

    public static void end(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        }

        Node curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.next = head;
    }

    public static void position(int pos, int data) {
        // insert at beginning
        if (pos == 0) {
            beginning(data);
            return;
        } // else
        Node newNode = new Node(data);
        Node curr = head;
        for (int i=0; i<pos-1 && curr.next!=head; i++) {
            curr = curr.next;
        }

        // invalid position
        if (curr == null) {
            System.out.println("invalid position");
            return;
        }

        newNode.next = curr.next;
        curr.next = newNode;
    }

    public static void main(String[] args) {
        head = new Node(10);
        Node two = new Node(20);
        Node three = new Node(30);
        Node four = new Node(40);

        head.next = two;
        two.next = three;
        three.next = four;
        four.next = head;
        traverse();
        System.out.println();

        System.out.println("insert at beginning");
        beginning(100);
        traverse();
        System.out.println();

        System.out.println("insert at end");
        end(50);
        traverse();
        System.out.println();

        System.out.println("insert at position");
        position(4, 35);
        traverse();
        System.out.println();
    }
}
