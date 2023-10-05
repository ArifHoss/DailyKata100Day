package week_02;

public class Kata_extra_FakeBinary {


    // solution 01
    public static String fakeBin(String numberString) {
        // if digit < 5 is 0
        // if digit >= 5 is 1
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberString.length(); i++) {
            char c = numberString.charAt(i);
            if (c < '5') sb.append('0');
            if (c >= '5') sb.append('1');
        }
        return sb.toString();
    }

    // solution 02
    public static String fakeBinary(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
}
