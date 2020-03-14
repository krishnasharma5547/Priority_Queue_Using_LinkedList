class Methods_TO_Implement_pQueue implements ADT{
    private Node front;
    private Node rear;

    public Methods_TO_Implement_pQueue() {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty(){
        return front == null;
    }
    //method to insert new node.........
    public void insert(int data, int priority) {
        Node n = new Node(data, priority);
        if (isEmpty()|| n.getPriority() < front.getPriority()) {
            n.setNext(front);
            front = n;
        } else {
            Node tem = front;
            while (tem.getNext() != null && tem.getNext().getPriority() <= n.getPriority()) {
                tem = tem.getNext();
            }
            n.setNext(tem.getNext());
            tem.setNext(n);
        }
    }

    //method to display elements............
    public void display() {
        if(isEmpty()){
            System.out.println("underflow");
        }
        else{
            Node tem = front;
            while(tem != null){
                System.out.println(tem.getData() + " " +tem.getPriority());
                tem = tem.getNext();
            }
        }
    }
}
