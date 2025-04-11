import java.util.Arrays;

public class LeetCode1_TwoSum {

    public static void main(String[] args) {
        System.out.println("Indexes: " + Arrays.toString(twoSum(new int[] { 2, 7, 11, 15 }, 9)));
        System.out.println("Indexes: " + Arrays.toString(twoSum(new int[] { 3, 2, 4 }, 6)));
        System.out.println("Indexes: " + Arrays.toString(twoSum(new int[] { 3, 3 }, 6)));
        System.out.println("Indexes: " + Arrays.toString(twoSum(new int[] { 2, 5, 5, 11 }, 10)));
        System.out.println("Indexes: " + Arrays.toString(twoSum(new int[] { 0, 4, 3, 0 }, 0)));
        System.out.println("Indexes: " + Arrays.toString(twoSum(new int[] { -3, 4, 3, 90 }, 0)));
        System.out.println("Indexes: " + Arrays.toString(twoSum(new int[] { 3, 2, 95, 4, -3 }, 92)));
    }

    public static int[] twoSum(int[] numbers, int target) {

        int[] sortedNumbers = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(sortedNumbers);

        int leftIndex = 0;
        int rightIndex = sortedNumbers.length - 1;

        while (leftIndex < rightIndex) {
            if (sortedNumbers[leftIndex] + sortedNumbers[rightIndex] == target) {
                return findOriginalIndices(numbers, sortedNumbers[leftIndex], sortedNumbers[rightIndex]);
            } else if (sortedNumbers[leftIndex] + sortedNumbers[rightIndex] > target) {
                rightIndex--;
            } else {
                leftIndex++;
            }
        }

        return new int[2];
    }

    private static int[] findOriginalIndices(int[] numbers, int leftNumber, int rightNumber) {
        int[] numbersIndex = new int[] {-1, -1};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == leftNumber && numbersIndex[0] == -1) {
                numbersIndex[0] = i;
                continue;
            }
            if (numbers[i] == rightNumber && numbersIndex[1] == -1) {
                numbersIndex[1] = i;
                continue;
            }
            if (numbersIndex[0] != -1 && numbersIndex[1] != -1) {
                break;
            }
        }
        return numbersIndex;
    }
}