package week_03;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Kata_03_TwoSumInputArrayIsSorted {
    public static void main(String[] args) {
        int[] numbers = {2,3,4};
        System.out.println(Arrays.toString(twoSum(numbers, 5)));
        System.out.println(Arrays.toString(twoSum1(numbers, 5)));
    }

    public static int[] twoSum(int[] numbers, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i+1};
            }
            map.put(numbers[i], i+1);
        }
        throw new IllegalArgumentException("THERE_ARE_NO_TWO_SUM_SOLUTION");
    }

    public static int[] twoSum1(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (numbers[left] + numbers[right] != target) {
            if (numbers[left] + numbers[right] < target) left++;
            else right--;
        }
        return new int[]{left + 1, right + 1};
    }
}
