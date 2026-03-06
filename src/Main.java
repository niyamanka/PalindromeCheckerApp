public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker");

        String word = "A man a plan a canal Panama";

        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(word);

        if (result) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}