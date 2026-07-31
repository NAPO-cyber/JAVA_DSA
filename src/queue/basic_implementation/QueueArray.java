package queue.basic_implementation;

public class QueueArray {
    static int[] queue = new int[5];
    static int front = 0;
    static int rear = -1;

    static void enqueue(int data) {
        if (isFull()) {
            System.out.println("queue overflow");
            return;
        }
        queue[++rear] = data;
    }

    static void dequeue() {
        if (isEmpty()) {
            System.out.println("queue underflow");
            return;
        }
        System.out.println("removed: " + queue[front]);
        front++;
    }

    static void peek() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return;
        }
        System.out.println("front element: " + queue[front]);
    }

    static boolean isFull() {
        return rear == queue.length-1;
    }

    static boolean isEmpty() {
        return front > rear;
    }

    static int size() {
        if (isEmpty()) {
            return 0;
        }
        return rear - front + 1;
    }

    static void display() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return;
        }
        System.out.print("queue: ");
        for (int i=front; i<=rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        enqueue(10);
        enqueue(50);
        enqueue(70);
        enqueue(80);
        display();

        System.out.println();

        peek();

        System.out.println();

        dequeue();
        display();

        System.out.println();

        System.out.println(size());
    }

}
