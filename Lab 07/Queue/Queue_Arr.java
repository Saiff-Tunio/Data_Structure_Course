import java.util.Arrays;

public class Queue_Arr {
    private int[] queueArray;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public Queue_Arr(int capacity) {
        this.capacity = capacity;
        this.queueArray = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(int data) {
        if (size == capacity) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % capacity;
        queueArray[rear] = data;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        int dequeueData = queueArray[front];
        front = (front + 1) % capacity;
        size--;
        if (size == 0) {
            front = 0;
            rear = -1;
        }
        return dequeueData;
    }

    public int peek() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return queueArray[front];
    }
    public void display(){
        for (int i = front; i <= rear; i++) {
            System.out.print(queueArray[i] + " -> ");
        }
        System.out.println("end");  // for new line after queue traversal.
    }

    public static void main(String[] args) {
        Queue_Arr q = new Queue_Arr(3);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("Dequeue: "+q.dequeue());
        System.out.println("Peak: "+q.peek());
        q.display();
    }
}