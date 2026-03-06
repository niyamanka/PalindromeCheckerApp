public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker");

        String word = "A man a plan a canal Panama";

        // String preprocessing
        String cleaned = word.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;

        int start = 0;
        int end = cleaned.length() - 1;

        // Compare characters
        while (start < end) {
            if (cleaned.charAt(start) != cleaned.charAt(end)) {
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