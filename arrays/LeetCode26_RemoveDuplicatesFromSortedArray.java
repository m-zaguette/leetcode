public class LeetCode26_RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] { 1, 1, 2 }));
        System.out.println(removeDuplicates(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }));
        System.out.println(removeDuplicates(new int[] { 1 }));
    }

    public static int removeDuplicates(int[] numbers) {
        if (numbers.length == 1) return 1;
        int uniqueIndex = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != numbers[i-1]) {
                numbers[uniqueIndex] = numbers[i];
                uniqueIndex++;
            }
        }
        return uniqueIndex;
    }
}
