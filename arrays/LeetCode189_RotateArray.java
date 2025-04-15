import java.util.Arrays;

public class LeetCode189_RotateArray {

    public static void main(String[] args) {
        int[] array1 = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        rotate(array1, 3);
        System.out.println(Arrays.toString(array1));
        int[] array2 = new int[] { -1, -100, 3, 99 };
        rotate(array2, 2);
        System.out.println(Arrays.toString(array2));
        int[] array3 = new int[] { 1, 2 };
        rotate(array3, 3);
        System.out.println(Arrays.toString(array3));
        int[] array4 = new int[] { 1, 2, 3 };
        rotate(array4, 4);
        System.out.println(Arrays.toString(array4));
        int[] array5 = new int[] { 1, 2, 3 };
        rotate(array5, 2);
        System.out.println(Arrays.toString(array5));
        int[] array6 = new int[] { 1, 2 };
        rotate(array6, 5);
        System.out.println(Arrays.toString(array6));
    }

    // Original code I implemented
    // public static void rotate(int[] nums, int k) {
    //     if (k == 0 || nums.length == 1) return;
    //     if (k > nums.length) k %= nums.length;

    //     int[] numsCopy = Arrays.copyOf(nums, nums.length);
    //     for (int i = 0; i < nums.length; i++) {
    //         int index = (i + (nums.length - k)) % nums.length;
    //         nums[i] = numsCopy[index];
    //     }
    // }

    // Code implemented with the help of AI
    public static void rotate(int[] nums, int k) {
        int length = nums.length;
        if (k == 0 || length == 1) return;
        k %= length;

        reverseArray(nums, 0, length - 1);
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, length - 1);
    }

    private static void reverseArray(int[] array, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }

}
