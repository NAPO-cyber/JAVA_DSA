package linkedlist.circular.circular_singly.implementation;

public class CsLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
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
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        } while (curr != head);
        System.out.println(head.data + " (head)");
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

        display();
    }
}
