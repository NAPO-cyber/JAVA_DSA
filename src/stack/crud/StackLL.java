package stack.crud;

public class StackLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node top = null;

    static void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    static void pop() {
        if (isEmpty()) {
            System.out.println("stack underflow");
            return;
        }
        System.out.println("popped: " + top.data);
        top = top.next;
    }

    static void peek() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return;
        }
        System.out.println("top element: " + top.data);
    }

    static boolean isEmpty() {
        return top == null;
    }

    static int size() {
        int count = 0;
        Node curr = top;

        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    static void display() {
        if (top == null) {
            System.out.println("stack is empty");
            return;
        }
        System.out.println("stack [top to bottom]");
        Node curr = top;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        System.out.println("push:");
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        display();
        System.out.println();

        System.out.println("pop:");
        pop();
        pop();
        display();
        System.out.println();

        System.out.println("peek top element");
        peek();
        System.out.println();

        System.out.println("size: " + size());
        System.out.println("is empty: " + isEmpty());
    }
}
