package linkedlist.doubly.crud.insertion;

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

    // display
    public static void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " <-> ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    // insert at beginning
    public static void beginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } // else
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // insert at ending
    public static void end(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr;
    }

    // insert at position
    public static void position(int pos, int data) {
        // insert at beginning
        if (pos == 0) {
            beginning(data);
            return;
        } // else
        Node newNode = new Node(data);
        Node curr = head;

        for (int i=0; i<pos-1 && curr!=null; i++) {
            curr = curr.next;
        }
        // invalid position
        if (curr == null) {
            System.out.println("invalid position");
            return;
        }
        // insert at end
        if (curr.next == null) {
            curr.next = newNode;
            newNode.prev = curr;
            return;
        }
        newNode.next = curr.next;
        newNode.prev = curr;
        curr.next.prev = newNode;
        curr.next = newNode;
    }

    public static void main(String[] args) {
        beginning(10);
        beginning(20);
        beginning(30);
        System.out.println("after insert at beginning.");
        display();

        end(20);
        end(30);
        System.out.println("after insert at end");
        display();

        position(3, 10);
        System.out.println("after insert at position");
        display();
    }
}
