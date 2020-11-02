package _b11_dsa_stack_queue.homework.reverse_array_use_stack;

import java.util.Stack;

public class ReverseArrayUseStack {
    public static void main(String[] args) {
        int[] intArr = new int[5];
        for (int index = 0; index < intArr.length; index++) {
            intArr[index] = (int) (Math.random() *10);
        }
        System.out.println("Mảng trước khi đảo");
        for (int index = 0; index < intArr.length; index++) {
            System.out.print(intArr[index] + "\t");
        }
        Stack stack = new Stack();

        for (int index = 0; index < intArr.length; index++) {
            stack.push(intArr[index]);
        }

        for (int index = 0; index < intArr.length; index++) {
            intArr[index] = (int) stack.pop();
        }
        System.out.println("\nMảng sau khi đảo");
        for (int index = 0; index < intArr.length; index++) {
            System.out.print(intArr[index] + "\t");
        }
    }
}
