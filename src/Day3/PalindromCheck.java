package Day3;

public class PalindromCheck {

    public static void main(String[] args) {
        String s = "radar";   // corrected word
        int len = s.length();
        int left = 0;
        int right = len - 1;

        boolean isPalindrome = true;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                System.out.println(s+ " Not Palindrome");
                isPalindrome = false;
                break;
            }
            left++;   
            right--;  
        }

        if (isPalindrome) {
            System.out.println(s+ " Is Palindrome");
        }
    }
}
