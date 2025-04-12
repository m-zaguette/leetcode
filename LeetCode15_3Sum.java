import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode15_3Sum {

    public static void main(String[] args) {
        System.out.println(threeSum(new int[] { -1, 0, 1, 2, -1, -4 }));
        System.out.println(threeSum(new int[] {0,1,1}));
        System.out.println(threeSum(new int[] {0,0,0}));
        System.out.println(threeSum(new int[] { -2, 0, 1, 1, 2 }));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> possibilities = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right) {
                if (nums[left] + nums[right] == - nums[i]) {
                    possibilities.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left < right && nums[left] == nums[left + 1]){
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (nums[left] + nums[right] < - nums[i]) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return possibilities;
    }
}
