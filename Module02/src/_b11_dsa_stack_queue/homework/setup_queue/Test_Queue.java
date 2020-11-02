package _b11_dsa_stack_queue.homework.setup_queue;

public class Test_Queue {
    public static void main(String[] args) {
        Queue queue = new Queue();
//        System.out.println(queue.deQueue()); //null
        queue.displayQueue(); //null
//        System.out.println(queue.deQueue().data); //node1.data = 1
//        queue.enQueue(1);
//        queue.displayQueue(); // 1
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.deQueue();
        queue.deQueue();
        queue.displayQueue(); // 3 4 5
    }
}
