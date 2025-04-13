public class LeetCode11_ContainerWithMostWater {

    public static void main(String[] args) {
        System.out.println(maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
        System.out.println(maxArea(new int[] { 1, 1 }));
    }

    public static int maxArea(int[] height) {
        int leftIndex = 0;
        int rightIndex = height.length - 1;
        int maxArea = 0;

        while (leftIndex < rightIndex) {
            int currentHeight = Math.min(height[leftIndex], height[rightIndex]);
            int currentArea = currentHeight * (rightIndex - leftIndex);
            maxArea = Math.max(maxArea, currentArea);

            if (height[leftIndex] < height[rightIndex]) {
                leftIndex++;
            } else {
                rightIndex--;
            }
        }
        return maxArea;
    }
}
