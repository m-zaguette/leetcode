import java.util.Arrays;

public class LeetCode3502_MinimumCostToReachEveryPosition {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(minCosts(new int[] {5, 3, 4, 1, 3, 2})));
        System.out.println(Arrays.toString(minCosts(new int[] { 1, 2, 4, 6, 7 })));
    }

    public static int[] minCosts(int[] cost) {
        final var costs = new int[cost.length];

        var lower = Integer.MAX_VALUE;
        for (int i = 0; i < cost.length; i++) {
            if (lower > cost[i]) {
                lower = cost[i];
            }
            costs[i] = lower;
        }
        return costs;
    }
}
