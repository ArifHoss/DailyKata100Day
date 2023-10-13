package week_03;

public class Kata_05_ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
//        System.out.println(isPalindrome(s));
//        System.out.println(isPalindrome1(s));
//        System.out.println(isPalindrome2(s));
        System.out.println(isPalindrome3(s));
    }

    /**
     * Pros:
     * Simplicity: This solution is more straightforward and easier to understand. First, it cleans up the string, then reverses it, and finally checks if the original and reversed strings are the same.
     * Readability: It's more evident at first glance what this solution is doing compared to the first solution.
     * Cons:
     * Memory Overhead: This solution creates new string objects, adding O(n) space complexity.
     * Performance: This solution processes the entire string, even if it could be determined to be non-palindromic early on
     */
    public static boolean isPalindrome(String s) {
        String newString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(newString);
        String reverseString = sb.reverse().toString();
        System.out.println(newString);
        System.out.println(reverseString);
        return newString.equals(reverseString);
    }

    public static boolean isPalindrome1(String s) {
        String str = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        String newString = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            newString = ch + newString;
        }

        return str.equals(newString);
    }

    public static boolean isPalindrome2(String s) {
        char[] charArray = s.toLowerCase().replaceAll("[^a-z0-9]", "").toCharArray();
        StringBuilder strings = new StringBuilder();
        for (char c : charArray) {
            strings.append(c);
        }
        StringBuilder sb = new StringBuilder();
        int lastChar = charArray.length - 1;
        for (int i = lastChar; i >= 0; i--) {
            sb.append(charArray[i]);
        }

        System.out.println(strings);
        System.out.println(sb);
        return strings.toString().equals(sb.toString());
    }

    /**
     * Pros:
     * Memory Efficient: This solution uses a two-pointer technique to traverse the string from both ends. It doesn't create any new data structures that depend on the size of the input string, thus using O(1) extra space.
     * Performance: This solution may be faster for long strings that aren't palindromes near the start/end since it can exit early without processing the entire string.
     * Cons:
     * Complexity: The logic for this solution involves more condition checks, making it slightly harder to follow.
     */
    public static boolean isPalindrome3(String input) {
        if (input.isEmpty()) {
            return true;
        }
        int leftPointer = 0;
        int rightPointer = input.length() - 1;

        while (leftPointer <= rightPointer) {
            char leftChar = input.charAt(leftPointer);
            char rightChar = input.charAt(rightPointer);

            if (!Character.isLetterOrDigit(leftChar)) {
                leftPointer++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                rightPointer--;
            } else {
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                    return false;
                }
                leftPointer++;
                rightPointer--;
            }
        }
        return true;
    }
}
