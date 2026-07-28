package linkedlist.circular.circular_doubly.implementation;

public class CdLL {

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
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        Node curr = head;
        do {
            System.out.print(curr.data + " <-> ");
            curr = curr.next;
        } while (curr != head);
        System.out.println(curr.data + " (head)");
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
        four.next = head;
        head.prev = four;

        display();
    }
}
