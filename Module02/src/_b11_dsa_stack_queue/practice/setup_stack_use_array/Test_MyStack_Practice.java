package _b11_dsa_stack_queue.practice.setup_stack_use_array;

public class Test_MyStack_Practice {
    public static void main(String[] as) throws Exception {
        My_Stack_Practice stack = new My_Stack_Practice(5);

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("1. Size of stack after push operations: " + stack.size());
        System.out.printf("2. Pop elements from stack : ");

        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }

        System.out.println("\n3. Size of stack after pop operations : " + stack.size());
    }
}
