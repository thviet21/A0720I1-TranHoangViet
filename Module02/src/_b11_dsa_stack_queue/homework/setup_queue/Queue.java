package _b11_dsa_stack_queue.homework.setup_queue;

public class Queue<E>{
    Node front;
    Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enQueue(E element){
        Node temp = new Node(element);
        if (this.front == null){
            this.rear = this.front = temp;
            this.front.link = this.rear;
            return;
        }
        else {
            this.rear.link = temp;
            this.rear = temp;
            this.rear.link = this.front;
        }
    }
    public Node deQueue() {
        if (front == null) {
            return null;
        } else if (front == rear) {
            Node temp = front;
            front = null;
            rear = null;
            return temp;
        } else {
            Node temp = front;
            front = front.link;
            rear.link = front;
            return temp;
        }
    }
    public void displayQueue() {
        Node temp = front;
        if (front == null){
            System.out.println("Queue null");
        } else {
            while (temp.link != front) {
                System.out.println(temp.data);
                temp = temp.link;
            }
            System.out.println(rear.data);
        }
    }
}
