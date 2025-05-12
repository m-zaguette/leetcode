import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode1_TwoSumAgain {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[] { 2, 7, 11, 15 }, 9))); // [0, 1]
        System.out.println(Arrays.toString(twoSum(new int[] { 3, 2, 4 }, 6))); // [1, 2]
        System.out.println(Arrays.toString(twoSum(new int[] { 3, 3 }, 6))); // [0, 1]
    }

    // 2ms and 45.5 MB
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapComplementByIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (mapComplementByIndex.containsKey(nums[i])) {
                return new int[] {mapComplementByIndex.get(nums[i]), i};
            } else {
                mapComplementByIndex.put(target - nums[i], i);
            }
        }
        return new int[2];
    }

    // 0ms and 45 MB
    // public static int[] twoSumAllPossibilities(int[] nums, int target) {
    //     // This code test all possibilities between two numbers
    //     for (int i = 1; i < nums.length; i++) {
    //         for (int j = i; j < nums.length; j++) {
    //             if (nums[j] + nums[j - i] == target) {
    //                 return new int[] {j, j - i};
    //             }
    //         }
    //     }
    //     return new int[2];
    // }

}
