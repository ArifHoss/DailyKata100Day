package week_01;

public class Kata_01_MultiplicationTable {

    // source: https://www.codewars.com/kata/534d2f5b5371ecf8d2000a08/train/java
    public static int[][] multiplication(int n) {
        // initialize a 2D array of size NxN
        int[][] table = new int[n][n];

        // Nested loop to populate the multiplication table
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }

        // return the populated multiplication table
        return table;
    }
}
