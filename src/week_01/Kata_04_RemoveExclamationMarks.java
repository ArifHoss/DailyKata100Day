package week_01;

public class Kata_04_RemoveExclamationMarks {
    public static void main(String[] args) {
        System.out.println(removeExclamationsMark("Hello World!"));
    }
    public static String removeExclamationsMark(String s) {
        return s.replace("!", "");
    }
}
