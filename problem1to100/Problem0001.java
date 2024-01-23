package problem1to100;

import java.util.Arrays;

/**
 * Two Sum
 * 
 * <p>
 * Given an array of integers {@code nums} and an integer {@code target},
 * return indices of the two numbers such that they add up to {@code target}.
 * </p>
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * </p>
 * @see <a href="https://leetcode.com/problems/two-sum/">LeetCode Problem 1</a>
 * @version 1.0
 * @author Amar Ghugare
 */
public class Problem0001 {
    /**
     * Returns indices of the two numbers such that they add up to target.
     * @param nums an array of integers
     * @param target an integer target to achive
     * @return an array of two indices of the numbers that add up to target
     */
    public int[] twoSum(int[] nums, int target) {
        // Loop through the array and compare each pair of elements
        for(int i = 0; i < nums.length-1; i++) {
            for(int j = i+1; j < nums.length; j++) {
                // If the sum of the pair equals the target, return the indices
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        // If no pair is found, return an empty array
        return new int[]{};
    }

    public static void main(String[] args) {
        Problem0001 p0001 = new Problem0001();
        int[] answer;

        // Example 1
        answer = p0001.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(answer));

        // Example 2
        answer = p0001.twoSum(new int[]{3, 2, 4}, 6);
        System.out.println(Arrays.toString(answer));

        // Example 3
        answer = p0001.twoSum(new int[]{3, 3}, 6);
        System.out.println(Arrays.toString(answer));
    }
}