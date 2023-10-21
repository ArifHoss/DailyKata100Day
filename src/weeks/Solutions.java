package weeks;

import java.util.Arrays;

public class Solutions {
    public static void main(String[] args) {
        // Kata 24
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int maxArea = calculateMaximumArea(height);
        System.out.println("MaxArea = " + maxArea);
       /*
        //Kata 23
        System.out.println(isSubsequence1("bb", "ahbgdbc"));
        System.out.println(isSubsequence1("bb", "ahgdc"));
        System.out.println(isSubsequence("bb", "ahbgdbc"));
        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
        //kata 22
        System.out.println(getDay(1));
        //kata 21
        System.out.println(validateUser("asssssssssssss1_"));
        //kata 20
        int[] numbers = {10, 14, 2, 23, 19};
        int sum = sumOfLargestPair(numbers);
        System.out.println("SUM OF LARGEST PAIR: "+ sum);
        //kata 19
        int number = binToDec("1010");
        int number01 = binToDec1("1010");
        System.out.println("binToDec = "+number);
        System.out.println("binToDec1 = "+number01);
        
        //kata 18
        System.out.println(sumExHighestAndLowest(new int[]{5,2,4,6,9,12,11,8}));
        System.out.println(sumExHighestAndLowest(new int[] { 6, 2, 1, 8, 10}));
        //kata 17
        System.out.println(sumOfMultiplesBelowLimit(2, 9));
        System.out.println(sumOfMultiplesBelowLimit(3, 13));
        System.out.println(sumOfMultiplesBelowLimit(4, 123));
        //System.out.println(sumOfMultiplesBelowLimit(4, -7));
*/
    }
    // sat 21 oct 2023 Kata 24

    /**
     * Container with most water
     */
    public static int calculateMaximumArea(int[] height) {
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        int maximumArea = 0;

        while (leftPointer < rightPointer) {
            int between = rightPointer - leftPointer;

            int minHeight = Math.min(height[leftPointer], height[rightPointer]);
            maximumArea = Math.max(maximumArea, between * minHeight);

            if (height[leftPointer] < height[rightPointer]) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        return maximumArea;
    }

    // fri 20 oct 2023 Kata23

    /**
     * Is Subsequence
     * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
     * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
     * Example 1:
     * Input: s = "abc", t = "ahbgdc"
     * Output: true
     * Example 2:
     * Input: s = "axc", t = "ahbgdc"
     * Output: false
     */
    // Solution 01
    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true; // an empty string is a subsequence of any string
        }
        int indexS = 0, indexT = 0;
        while (indexT < t.length()) {
            if (t.charAt(indexT) == s.charAt(indexS)) {
                indexS++;
                if (indexS == s.length()) {
                    return true; // all characters of s have been found in t
                }
            }
            indexT++;
        }
        return false; // s is not a subsequence of t
    }

    // Solution 02
    public static boolean isSubsequence1(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    // fri 20 oct 2023 Kata22
    /**
     *
     */

    /**
     * Return the day
     * 1 returns "Sunday"
     * 2 returns "Monday"
     * 3 returns "Tuesday"
     * 4 returns "Wednesday"
     * 5 returns "Thursday"
     * 6 returns "Friday"
     * 7 returns "Saturday"
     */
    public static String getDay(int number) {
        return switch (number) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> throw new IllegalStateException("Wrong, please enter a number between 1 and 7");
        };
    }
    // thu 19 oct 2023 Kata21

    /**
     * Simple validation of a username with regex
     */
    public static boolean validateUser(String username) {
        //if (username.length() <= 4 || username.length() >= 16) return false;
        return username.matches("^[a-z0-9_]{4,16}$");
    }

    //wed 18 oct 2023 Kata20

    /**
     * Largest pair sun in array
     */
    //Solution 01
    public static int sumOfLargestPair(int[] numbers) {
        if (numbers == null || numbers.length == 0) return 0;
        Arrays.sort(numbers);

        return numbers[numbers.length - 1] + numbers[numbers.length - 2];
    }

    //Solution 02
    public static int sumOfLargestPair1(int[] numbers) {
        return Arrays.stream(numbers).map(x -> -x).sorted().map(x -> -x).limit(2).sum();
    }
    //tue 17 oct 2023 Kata19

    /**
     * Bin to Decimal
     */
    // Solution 01
    public static int binToDec(String binaryString) {
        int decimal = 0;
        int power = 0;
        // Iterate through the binary starting from right to left
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            char digit = binaryString.charAt(i);
            if (digit == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }

    // Solution 02
    public static int binToDec1(String binaryString) {
        return Integer.parseInt(binaryString, 2);
    }

    //mon 16 oct 2023 Kata18

    /**
     * Sum without highest and lowest number
     */
    public static int sumExHighestAndLowest(int[] numbers) {
        if (numbers.length == 0) return 0;
        Arrays.sort(numbers);
        int sum = 0;
        for (int i = 1; i < numbers.length - 1; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    // sun 15 oct 2023 Kata17

    /**
     * Todo "Sum of Multiples"
     * Find the sum of all multiples of baseNumber below upperLimit
     * Keep in mind baseNumber and upperLimit are positive numbers, mi is excluded from multiples
     * Examples
     * Kata.sumMul(2, 9)   ==> 2 + 4 + 6 + 8 = 20
     * Kata.sumMul(3, 13)  ==> 3 + 6 + 9 + 12 = 30
     * Kata.sumMul(4, 123) ==> 4 + 8 + 12 + ... = 1860
     * Kata.sumMul(4, -7)  // throws IllegalArgumentException
     */
    public static long sumOfMultiplesBelowLimit(int baseNumber, int upperLimit) {

        if (baseNumber < 1 || upperLimit < 1)
            throw new IllegalArgumentException("BOTH_'baseNumber'_AND_'upperLimit'_SHOULD_BE_ZERO_OR_NONE_NEGATIVE");

        int sum = 0;

        for (int i = 0; i < upperLimit; i++) {
            long multiple = baseNumber * i;
            if (multiple < upperLimit) {
                sum += multiple;
            }
        }
        return sum;
    }

    // second approach
    public static long sumMul(int n, int m) {
        if (n <= 0 || m <= 0) {
            throw new IllegalArgumentException("n = " + n + " m = " + m);
        }
        long sum = 0;
        for (long i = n; i < m; i++) {
            if (i % n == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
