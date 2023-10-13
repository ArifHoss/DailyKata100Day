package week_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata_01_LineNumbering {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        System.out.println(numbering(list));
        System.out.println(numbering1(list));
    }
    public static List<String> numbering(List<String> lines) {
        List<String> addNumber = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            addNumber.add(i+1 + ": " + lines.get(i));
        }
        return addNumber;
    }

    public static List<String> numbering1(List<String> lines) {
        List<String> addNumber = new ArrayList<>();
        int i = 0;
        for (String line : lines) {
            addNumber.add(++i + ": " + line);
        }
        return addNumber;
    }
}
