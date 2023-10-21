package weeks;

public class PlayWithStrings {
    public static void main(String[] args) {
        String word1 = "ba"; //     a d c
        //                           0 1 2
        String word2 = "cabdefg";//  c a b d e f g
        //                           0 1 2 3 4 5 6

        boolean isTrue = isSubsequence(word1, word2);
        System.out.println(isTrue);
    }

    private static boolean isSubsequence(String word1, String word2) {
        int i = 0, j = 0;
        while (i < word1.length() && j < word2.length()) {
            if (word1.charAt(i) == word2.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == word1.length();
    }

}
