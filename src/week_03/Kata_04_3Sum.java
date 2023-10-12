package week_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata_04_3Sum {
    public static void main(String[] args) {

    }
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) throw new IllegalArgumentException("NOT_POSSIBLE");
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;// Skip duplicates
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // Increment left and avoid duplicates
                    left++;
                    while (left < right && nums[left] == nums[left - 1]) left++;

                    // Increment right and avoid duplicates
                    right--;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}
/**
 * Sort the array.
 * Loop over the array using a variable i. For each i, if nums[i] is greater than 0, then break,
   because the remaining numbers are all positive and cannot sum up to 0.
 * If nums[i] is the same as the number before, skip to the next iteration to avoid duplicates.
 * For each i, use two pointers (left and right) initialized at i+1 and nums.length-1 respectively.
 * For each set of i, left, and right:
 * a. If the sum of nums[i], nums[left], and nums[right] is zero, add them to the result list.
 * b. Increment left and decrement right.
 * c. Skip duplicate numbers for both left and right to avoid duplicate triplets.
 * If the sum is less than zero, increment left. If it's greater than zero, decrement right.
 */