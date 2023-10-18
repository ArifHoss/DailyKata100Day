package weeks;

import java.util.Arrays;

public class Solutions {
    public static void main(String[] args) {
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

    }
    //wed 18 oct 2023 Kata20

    /**
     * Largest pair sun in array
     */
    //Solution 01
    public static int sumOfLargestPair(int[] numbers) {
        if (numbers == null || numbers.length == 0) return 0;
        Arrays.sort(numbers);

        return numbers[numbers.length -1] + numbers[numbers.length - 2];
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
        for (int i = 1; i < numbers.length -1; i++) {
            sum+=numbers[i];
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

        if (baseNumber < 1 || upperLimit < 1) throw new IllegalArgumentException("BOTH_'baseNumber'_AND_'upperLimit'_SHOULD_BE_ZERO_OR_NONE_NEGATIVE");

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
        if(n <= 0 || m <= 0){
            throw new IllegalArgumentException("n = " + n + " m = " + m);
        }
        long sum = 0;
        for(long i = n; i < m; i++){
            if(i%n == 0){
                sum += i;
            }
        }
        return sum;
    }
}
