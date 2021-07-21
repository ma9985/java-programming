package day63_collections_endJava;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> bookStack = new Stack<>();
        bookStack.add("Harry Potter");
        bookStack.add("Bukhari");
        bookStack.add("Java intro");
        bookStack.add("cucumber");
        System.out.println(bookStack);

        System.out.println(bookStack.peek());
         //bookStack.pop();// removes and returns the otp of the stack item
        System.out.println(bookStack.pop());

        System.out.println("Final version" + bookStack);
    }
}
