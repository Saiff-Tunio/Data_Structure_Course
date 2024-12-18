public class stacks {
    int top =-1;
    int[] num = new int[5];

    public void push(int data) {
        if (top == 4) {
            System.out.println("Stack overflow");
            return;
        }
        num[++top] = data;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return num[top--];
    }

    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top element is: " + num[top]);
    }

    public void isEmpty() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
    }

    public void size() {
        System.out.println("Size of the stack is: " + (top + 1));
    }

    public static void main(String[] args) {
        stacks s = new stacks();
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        System.out.println("Popped element: " + s.pop());
        s.peek();
        s.isEmpty();
        s.size();

    }
}