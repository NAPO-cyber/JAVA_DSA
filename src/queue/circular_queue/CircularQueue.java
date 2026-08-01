package queue.circular_queue;

public class CircularQueue {

    static int[] queue = new int[5];
    static int front = -1;
    static int rear = -1;

    static void enqueue(int data) {
        if (isFull()) {
            System.out.println("queue overflow");
            return;
        }
        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % queue.length;
        queue[rear] = data;
    }

    static void deque() {
        if (isEmpty()) {
            System.out.println("queue underflow");
            return;
        }
        System.out.println("removed: " + queue[front]);

        // ;last element removed
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % queue.length;
        }
    }

    static void peek() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return;
        }
        System.out.println("front element: " + queue[front]);
    }

    static boolean isEmpty() {
        return front == -1;
    }

    static boolean isFull() {
        return (rear + 1) % queue.length == front;
    }

    static int size() {
        if (isEmpty()) {
            return 0;
        }

        if (rear >= front) {
            return rear - front + 1;
        }

        return queue.length - front + rear + 1;
    }

    static void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("queue: ");
        int i = front;

        while (true) {
            System.out.print(queue[i] + " ");

            if (i == rear)
                break;

            i = (i+1) % queue.length;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(39);
        enqueue(54);
        display();
        System.out.println();

        peek();
        System.out.println();

        deque();
        display();
        System.out.println();

        enqueue(100);
        enqueue(700);
        display();
        System.out.println();
    }
}
