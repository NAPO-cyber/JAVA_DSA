package queue.deque;

public class DequeArray {
    static int[] deque = new int[8];
    static int front = -1;
    static int rear = -1;

    static void insertFront(int data) {
        if (isFull()) {
            System.out.println("deque overflow");
            return;
        }

        if (front == -1) {
            front = rear = 0;
        } else if (front == 0) {
            front = deque.length - 1;
        } else {
            front--;
        }
        deque[front] = data;
    }

    static void insertRear(int data) {
        if (isFull()) {
            System.out.println("deque overflow");
            return;
        }
        if (front == -1) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % deque.length;
        }
        deque[rear] = data;
    }

    static void dltFront() {
        if (isEmpty()) {
            System.out.println("Deque Underflow");
            return;
        }
        System.out.println("removed: " + deque[front]);

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % deque.length;
        }
    }

    static void dltRear() {
        if (isEmpty()) {
            System.out.println("Deque Underflow");
            return;
        }
        System.out.println("removed: " + deque[rear]);

        if (front == rear) {
            front = rear = -1;
        } else if (rear == 0) {
            rear = deque.length - 1;
        } else {
            rear--;
        }
    }

    static void getFront() {
        if (isEmpty()) {
            System.out.println("deque is empty");
            return;
        }
        System.out.println("front: " + deque[front]);
    }

    static void getRear() {
        if (isEmpty()) {
            System.out.println("deque is empty");
            return;
        }
        System.out.println("rear: " + deque[rear]);
    }

    static boolean isEmpty() {
        return front == -1;
    }

    static boolean isFull() {
        return (rear + 1) % deque.length == front;
    }

    static void display() {
        if (isEmpty()) {
            System.out.println("Deque is Empty");
            return;
        }

        int i = front;
        while (true) {
            System.out.print(deque[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % deque.length;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        insertFront(10);
        insertFront(20);
        insertFront(30);
        insertFront(40);
        display();
        System.out.println();

        insertRear(100);
        insertRear(200);
        display();
        System.out.println();

        getFront();
        getRear();
        System.out.println();

        dltFront();
        dltRear();
        display();
        System.out.println();
    }
}
