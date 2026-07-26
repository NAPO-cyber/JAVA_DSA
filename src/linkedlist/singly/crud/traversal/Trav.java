package linkedlist.singly.crud.traversal;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Trav {

    public static void traverseList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) {
                System.out.print("-> ");
            }
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(60);
        head.next.next = new Node(30);
        head.next.next.next = new Node(20);

        traverseList(head);
    }
}
