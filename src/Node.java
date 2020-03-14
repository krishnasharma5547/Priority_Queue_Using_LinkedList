public class Node {
    private int data;
    private Node next;
    private int priority;

    //Constructor...........
    public Node(int data, int priority) {
        this.data = data;
        this.next = null;
        this.priority = priority;
    }

    //getter and setter..........

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
