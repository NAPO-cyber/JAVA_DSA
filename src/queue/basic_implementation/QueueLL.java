package queue.basic_implementation;

public class QueueLL {
    static class Node {
        int data;
        Node next;

        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node front = null;
    static Node rear = null;

    static void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
            return;
        } // else

        // add to rear if nodes exists
        rear.next = newNode;
        rear = newNode;
    }

    static void dequeue() {
        if (isEmpty()) {
            System.out.println("queue underflow");
            return;
        }
        System.out.println("removed: " + front.data);

        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    static void peek() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return;
        }
        System.out.println("front element: " + front.data);
    }

    static boolean isEmpty() {
        return front == null;
    }

    static int size() {
        int count = 0;
        Node curr = front;

        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    static void display() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return;
        }
        System.out.print("queue: ");

        Node curr = front;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        enqueue(10);
        enqueue(190);
        enqueue(150);
        enqueue(10);
        enqueue(170);
        enqueue(140);
        enqueue(610);
        display();
        System.out.println();

        peek();
        System.out.println();

        dequeue();
        display();
        System.out.println();

        System.out.println("size of queue: " + size());
    }
}
