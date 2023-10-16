package weeks;

public class Solutions {
    public static void main(String[] args) {
        System.out.println(sumOfMultiplesBelowLimit(2, 9));
        System.out.println(sumOfMultiplesBelowLimit(3, 13));
        System.out.println(sumOfMultiplesBelowLimit(4, 123));
        System.out.println(sumOfMultiplesBelowLimit(4, -7));

    }

    // sun 15 oct 2023

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
