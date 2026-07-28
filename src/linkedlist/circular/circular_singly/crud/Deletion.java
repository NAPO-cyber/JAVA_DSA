package linkedlist.circular.circular_singly.crud;

public class Deletion {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
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

    // deletion form beginning
    public static void beginning() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        if (head.next == head) {
            head = null;
            return;
        }

        Node curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }
        head = head.next;
        curr.next = head;
    }

    // deletion from end
    public static void end() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        // only one node
        if (head.next == head) {
            head = null;
            return;
        }
        Node temp = head;

        while (temp.next.next != head) {
            temp = temp.next;
        }
        temp.next = head;
    }

    // deletion from position
    public static void position(int pos) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        // Delete first node
        if (pos == 0) {
            beginning();
            return;
        }

        Node temp = head;
        for (int i=0; i< pos-1 && temp.next!=head; i++) {
            temp = temp.next;
        }

        if (temp.next == head) {
            System.out.println("Invalid Position");
            return;
        }

        if (temp.next.next == head) {
            temp.next = head;
            return;
        }
        temp.next = temp.next.next;
    }


    public static void main(String[] args) {
        head = new Node(10);
        Node two = new Node(20);
        Node three = new Node(30);
        Node four = new Node(40);
        Node five = new Node(50);
        Node six = new Node(60);

        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = head;

        traverse();
        System.out.println();

        System.out.println("dlt from beginning");
        beginning();
        traverse();
        System.out.println();

        System.out.println("dlt from end");
        end();
        traverse();
        System.out.println();

        System.out.println("dlt from position");
        position(2);
        traverse();
        System.out.println();
    }
}
