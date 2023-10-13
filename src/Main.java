import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(countVowel("aaeebc"));
        List<String> list = Arrays.asList("Hello", "World");
        System.out.println(lineNumbering(list));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3}, 3)));
    }

    public static int[] twoSum(int[] numberlist, int target) {
        Map<Integer, Integer> maps = new HashMap<>();

        for (int i = 0; i < numberlist.length; i++) {
            int complement = target - numberlist[i];
            if (maps.containsKey(complement)) {
                Integer firstIndex = maps.get(complement);
                return new int[]{firstIndex, i + 1};
            }
            maps.put(numberlist[i], i + 1);
        }
        throw new IllegalArgumentException("NOT_FOUND");
    }

    public static List<String> lineNumbering(List<String> strings) {
        List<String> addNumber = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            addNumber.add(i + 1 + ": " + strings.get(i));
        }
        return addNumber;
    }

    public static int countVowel(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') result++;
            if (str.charAt(i) == 'e') result++;
            if (str.charAt(i) == 'i') result++;
            if (str.charAt(i) == 'o') result++;
            if (str.charAt(i) == 'u') result++;
        }
        return result;
    }
}