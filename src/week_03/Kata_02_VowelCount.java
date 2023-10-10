package week_03;

public class Kata_02_VowelCount {
    public static void main(String[] args) {
        String str = "pear tree";
        System.out.println(getCount(str));
    }

    public static int getCount(String str) {
        if (str.equals("")) return 0;
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') counter++;
            if (str.charAt(i) == 'e') counter++;
            if (str.charAt(i) == 'i') counter++;
            if (str.charAt(i) == 'o') counter++;
            if (str.charAt(i) == 'u') counter++;
        }
        return counter;
    }
}
