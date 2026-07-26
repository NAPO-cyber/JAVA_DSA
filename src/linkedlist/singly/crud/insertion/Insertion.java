package linkedlist.singly.crud.insertion;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Insertion {
    // first node of the LL
    static Node head = null;

    public static void beginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public static void ending(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        // reach last node
        while (last.next != null) {
            last = last.next;
        }
        // link last node to new node
        last.next = newNode;
    }

    public static void position(int pos, int data) {
        if (pos == 0) {
            beginning(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i=0; i<pos-1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("invalid position");
            return;
        }

        // connect new node with the next one
        newNode.next = temp.next;
        // connect prev node with the new one
        temp.next = newNode;
    }

    public static void traverse(){
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        // insert at beginning
        beginning(30);
        beginning(20);
        beginning(10);
        System.out.println("after insertion at the beginning");
        traverse();

        System.out.println();

        // insert at end
        ending(40);
        ending(50);
        System.out.println("after insertion at the end");
        traverse();

        System.out.println();

        // insert at a position
        position(2, 25);
        System.out.println("after insert at position");
        traverse();
    }
}
