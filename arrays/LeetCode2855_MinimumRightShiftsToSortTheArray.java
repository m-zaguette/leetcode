import java.util.Arrays;
import java.util.List;

public class LeetCode2855_MinimumRightShiftsToSortTheArray {
    public static void main(String[] args) {
        System.out.println(minimumRightShifts(Arrays.asList(3, 4, 5, 1, 2))); // Expected 2
        System.out.println(minimumRightShifts(Arrays.asList(1, 3, 5))); // Expected 0
        System.out.println(minimumRightShifts(Arrays.asList(2, 1, 4))); // Expected -1
        System.out.println(minimumRightShifts(Arrays.asList(31, 72, 79, 25))); // Expected 1
        System.out.println(minimumRightShifts(Arrays.asList(72, 13, 21, 35, 52))); // Expected 4
        System.out.println(minimumRightShifts(Arrays.asList(29, 30, 88, 28, 62))); // Expected -1
    }

    public static int minimumRightShifts(List<Integer> nums) {
        int lastIndexFirstArray = getLastSortedIndex(nums, 0, nums.size());

        if (lastIndexFirstArray + 1 == nums.size()) {
            return 0;
        }

        int lastIndexSecondArray = getLastSortedIndex(nums, lastIndexFirstArray + 1, nums.size());

        if (lastIndexSecondArray + 1 != nums.size() || nums.get(lastIndexSecondArray) > nums.get(0)) {
            return -1;
        }

        return lastIndexSecondArray - lastIndexFirstArray;
    }

    private static int getLastSortedIndex(List<Integer> array, int start, int end) {
        int lastSortedIndex = start;
        for (int i = start + 1; i < end; i++) {
            if (array.get(i) > array.get(i - 1)) {
                lastSortedIndex = i;
            } else {
                break;
            }
        }
        return lastSortedIndex;
    }

}
