package week_02;

public class Kata_04_PlayingWithDigits {
    public static void main(String[] args) {
        System.out.println(digPow(89, 1));    // 1
        System.out.println(digPow(92, 1));    // -1
        System.out.println(digPow(695, 2));   // 2
        System.out.println(digPow(46288, 3)); // 51
    }
    public static long digPow(int n, int p) {
        char[] digits = Integer.toString(n).toCharArray();
        int length = digits.length;
        long sum = 0;

        // Calculate the sum as given in the problem statement
        for (int i = 0; i < length; i++) {
            sum += Math.pow(Character.getNumericValue(digits[i]), p + i);
        }

        // Check if there exists a k such that sum = n * k
        if (sum % n == 0) {
            return (int) (sum / n);
        } else {
            return -1;
        }
    }
}

/*
digPow(89, 1) should return 1 since 8¹ + 9² = 89 = 89 * 1
digPow(92, 1) should return -1 since there is no k such as 9¹ + 2² equals 92 * k
digPow(695, 2) should return 2 since 6² + 9³ + 5⁴= 1390 = 695 * 2
digPow(46288, 3) should return 51 since 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 51
 */