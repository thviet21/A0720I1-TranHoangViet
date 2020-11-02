package _b11_dsa_stack_queue.homework.reverse_string_use_stack;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Trần Hoàng Việt";
        System.out.println("String trước khi đảo: " + str);
        Stack stack = new Stack();
        for (int index = 0; index < str.length(); index++) {
                stack.add(str.charAt(index));
        }
        String str1 ="";
        while (!stack.isEmpty()){
            str1 += stack.pop();
        }
        System.out.println("String sau khi đảo: " + str1);
    }
}
