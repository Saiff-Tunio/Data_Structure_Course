
public class doublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    private Node head;
    private Node tail;
    public doublyLL(){
        this.head = null;
        this.tail= null;
    }

    public void insertAtStart(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(tail == null)
            head = tail= newNode;

        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void addAtPosition(int data, int position){
        if(position == 0){
            insertAtStart(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        for(int i=0; i<position-1 && current!=null; i++){
            current = current.next;
        }
        if(current == null){
            System.out.println("Position out of range");
            return;
        }
        newNode.next = current.next;
        newNode.prev = current;
        if(current.next!= null)
            current.next.prev = newNode;
        current.next = newNode;
        if(newNode.next == null)
            tail = newNode;
    }

    public void DisplayFromStart() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void DisplayFromEnd() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = tail;
        while (current != null) {
            System.out.print(current.data);
            current = current.prev;
            if (current != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }



    public void deleteFromEnd(){
        if(tail == null){
            System.out.println("List is empty");
            return;
        }
        if(tail.prev == null){
            head = null;
            tail = null;
            return;
        }

        tail = tail.prev;
        tail.next=null;
    }
    public void deleteFromStart(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head = null;
            tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }
    public void deleteByValue(int data){
        if(head == null)
            return;
        if(head.data == data){
            head = head.next;
            if(head!= null)
                head.prev = null;
            return;
        }
        Node current = head;
        while(current.next!= null && current.next.data!= data){
            current = current.next;
        }
        if(current.next == null)
            return;
        current.next = current.next.next;
        if(current.next!= null)
            current.next.prev = current;
    }
    public void reverse() {
        Node current = head;
        Node temp = null;

        // Swap next and prev pointers for all nodes
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        // Update the head and tail after reversing
        if (temp != null) {
            head = temp.prev; // Set the new head
            tail = temp;      // Set the new tail
        }
    }


    public void search(int value){
        Node current = head;
        while(current!=null){
            if(current.data == value){
                System.out.println(value + " found");
                return;
            }
            current = current.next;
        }
        System.out.println(value + " not found");
    }
    public void countNodes(){
        Node current = head;
        int count = 0;
        while(current!=null){
            count++;
            current = current.next;
        }
        System.out.println("Number of nodes: " + count);
    }

    public static void main(String[] args){
        doublyLL dll = new doublyLL();
        dll.insertAtStart(20);
        dll.insertAtEnd(30);
        dll.insertAtEnd(40);
        dll.insertAtEnd(50);
        dll.insertAtEnd(60);
        dll.insertAtEnd(70);
        dll.insertAtStart(10);
        dll.DisplayFromStart();
        dll.search(10);
        dll.countNodes();
       //
        //
        dll.addAtPosition(20,2);
        dll.DisplayFromEnd();
        dll.deleteFromStart();
        dll.deleteFromEnd();
        dll.DisplayFromStart();
        dll.deleteByValue(20);
        dll.reverse();
        dll.DisplayFromStart();
    }

}
