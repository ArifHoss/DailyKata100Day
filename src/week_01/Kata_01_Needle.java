package week_01;

import java.util.Arrays;

public class Kata_01_Needle {
    public static void main(String[] args) {
        Object[] heystack = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
        String needle = findNeedle(heystack);
        System.out.println(needle);

    }

    public static String findNeedle(Object[] heystack) {
        for (int i = 0; i < heystack.length; i++) {
            if ("needle".equals(heystack[i])) {
                return "found the " + heystack[i] + " at position " + i;
            }
        }
        return "there is no needle";
    }
}
