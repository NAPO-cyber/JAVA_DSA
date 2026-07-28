package stack.crud;

public class StackArray {
    static int[] stack = new int[10];
    static int top = -1;

    static void push(int data) {
        if (isFull()) {
            System.out.println("stack overflow");
            return;
        } // else
        stack[++top] = data;
    }

    static void pop() {
        if (isEmpty()) {
            System.out.println("stack underflow");
            return;
        }
        System.out.println("popped " + stack[top]);
        top--;
    }

    static void peek() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return;
        }
        System.out.println("top element: " + stack[top]);
    }

    static boolean isEmpty() {
        return top == -1;
    }

    static boolean isFull() {
        return top == stack.length-1;
    }

    static int size() {
        return top+1;
    }

    static void display() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return;
        }
        System.out.println("stack [top to bottom]");
        for (int i=top; i>=0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("pushing elements");
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        push(60);
        push(70);
        display();
        System.out.println();

        System.out.println("popping elements");
        pop();
        pop();
        pop();
        display();
        System.out.println();

        System.out.println("peeking the top element");
        peek();
        System.out.println();

        System.out.println("size: " + size());
        System.out.println("is empty: " + isEmpty());
        System.out.println("is full: " + isFull());
    }
}
