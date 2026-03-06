public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker");

        String word = "madam";

        // Convert string to character array
        char[] chars = word.toCharArray();

        boolean isPalindrome = true;

        // Two-pointer technique
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}