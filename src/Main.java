import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    // Reverse String Method
    public static boolean reverseMethod(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return word.equals(reversed);
    }

    // Stack Method
    public static boolean stackMethod(String word) {
        Stack<Character> stack = new Stack<>();

        for (char c : word.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return word.equals(reversed);
    }

    // Deque Method
    public static boolean dequeMethod(String word) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : word.toCharArray()) {
            deque.add(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String word = "AmanaplanacanalPanama";

        // Reverse method timing
        long start = System.nanoTime();
        reverseMethod(word);
        long end = System.nanoTime();
        System.out.println("Reverse Method Time: " + (end - start) + " ns");

        // Stack method timing
        start = System.nanoTime();
        stackMethod(word);
        end = System.nanoTime();
        System.out.println("Stack Method Time: " + (end - start) + " ns");

        // Deque method timing
        start = System.nanoTime();
        dequeMethod(word);
        end = System.nanoTime();
        System.out.println("Deque Method Time: " + (end - start) + " ns");
    }
}