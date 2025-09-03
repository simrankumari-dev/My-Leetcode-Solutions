import java.util.*;

class Solution {
    public int minimumAddedCoins(int[] coins, int target) {
        Arrays.sort(coins);
        long reachable = 0;
        int added = 0;
        int i = 0;

        while (reachable < target) {
            if (i < coins.length && coins[i] <= reachable + 1) {
                // extend coverage using existing coin
                reachable += coins[i];
                i++;
            } else {
                // add coin = reachable + 1
                added++;
                reachable += (reachable + 1);
            }
        }

        return added;
    }
}
