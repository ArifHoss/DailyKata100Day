package week_01;

public class Kata_03_FindDivisor {
    public static void main(String[] args) {
        System.out.println(numberOfDivisors(1));
        System.out.println(numberOfDivisors(2));
        System.out.println(numberOfDivisors(4));
    }

    public static long numberOfDivisors(int n) {
        long counter = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                counter++;
        }
        return counter;
    }
}
