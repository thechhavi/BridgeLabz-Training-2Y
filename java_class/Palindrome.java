package java_class;

class PalindromeChecker {
    String text;

    public boolean isPalindrome() {
        String cleaned = text.replaceAll("\\s+", "").toLowerCase(); // remove spaces and make lowercase
        int left = 0, right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
        return true; 
    }

    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + text + "\" is NOT a Palindrome.");
        }
    }

    public static void main(String[] args) {
     
        PalindromeChecker p1 = new PalindromeChecker();
        p1.text = "madam";
        p1.displayResult();

        PalindromeChecker p2 = new PalindromeChecker();
        p2.text = "Hello";
        p2.displayResult();

        PalindromeChecker p3 = new PalindromeChecker();
        p3.text = "nurses run";
        p3.displayResult();
    }
}
