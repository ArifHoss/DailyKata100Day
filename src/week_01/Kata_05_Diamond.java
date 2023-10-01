package week_01;

public class Kata_05_Diamond {
    public static void main(String[] args) {
        System.out.println(print(3));
        System.out.println(print(5));
    }
    public static String print(int n) {
        if (n <= 0 || n % 2 == 0) {
            return null;
        }

        StringBuilder diamond = new StringBuilder();
        int midpoint = n / 2;

        // Upper part of diamond including the middle line
        for (int i = 0; i <= midpoint; i++) {
            for (int j = 0; j < midpoint - i; j++) {
                diamond.append(' ');
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                diamond.append('*');
            }
            diamond.append('\n');
        }

        // Lower part of diamond excluding the middle line
        for (int i = midpoint - 1; i >= 0; i--) {
            for (int j = 0; j < midpoint - i; j++) {
                diamond.append(' ');
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                diamond.append('*');
            }
            diamond.append('\n');
        }

        return diamond.toString();
    }
}
