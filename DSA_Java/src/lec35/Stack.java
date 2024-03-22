package lec35;

public class Stack {
    private int arr[];
    private int tos; 
    public Stack() {
        this(5); 
    }
    public Stack(int cap) {
        arr = new int[cap];
        tos = -1; //-1 se intze krte h
    }
    public int size() {
        return tos + 1;
    }
    public boolean isFull() {
        return size() == arr.length;
    }
    public boolean isEmpty() {
        return size() == 0;
    }
    public void add(int ali) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot add more elements.");
            return;
        }
        tos++;
        arr[tos] = ali;
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to pop.");
            return -1; 
        }
        int ans = arr[tos];
        tos--;
        return ans;
    }
    public static void main(String[] args) {
        Stack stack = new Stack(3); // Create a stack with capacity 3
        stack.add(10);
        stack.add(20);
        stack.add(30);

        System.out.println("Popped element: " + stack.pop()); // print 30
        System.out.println("Popped element: " + stack.pop()); //  print 20
        System.out.println("Popped element: " + stack.pop()); //  print 10
        System.out.println("Popped element: " + stack.pop()); //  print "Stack is empty. Nothing to pop."
    }
}
