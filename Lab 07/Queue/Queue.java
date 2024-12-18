public class Queue {

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front;
    Node rear;

    Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next =newNode;
            rear = newNode;
        }
    }

    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            rear = null;
            return -1;
        }
        int dequeueData = front.data;
        front = front.next;

        return dequeueData;
    }

    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data; // Return data at the front without removing it
    }
    public void display(){
        Node temp = front;
        while (temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("end");  // for new line after queue traversal.
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        System.out.println("Dequeue: " + q.dequeue()); // Dequeue 10
        System.out.println("Peek: " + q.peek());    // Now peek at 20 (without removing)
        q.display(); // Display queue after dequeue operation.
    }
}
