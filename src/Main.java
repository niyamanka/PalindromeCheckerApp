import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker");

        String word = "madam";

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Insert characters into stack and queue
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            stack.push(ch);     // LIFO
            queue.add(ch);      // FIFO
        }

        boolean isPalindrome = true;

        // Compare queue (FIFO) and stack (LIFO)
        while (!stack.isEmpty()) {
            if (stack.pop() != queue.remove()) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}