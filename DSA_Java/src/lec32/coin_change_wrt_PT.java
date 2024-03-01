package lec32;

import java.util.Arrays;

public class coin_change_wrt_PT {
    public static void main(String[] args) {
        int[] coins = {1, 2, 2, 3, 1, 2, 3, 1, 1, 1};
        Arrays.sort(coins);
        coin(0, 5, coins , "");
    }

    public static void coin(int startIdx, int target, int[] coins, String path) {
        if (target == 0) {
            System.out.println(path);
            return;
        }

        for (int i = startIdx; i < coins.length; i++) {
            if (i > startIdx && coins[i] == coins[i - 1]) {
                continue; // skip duplicates
            }

            if (target - coins[i] >= 0) {
                coin(i + 1, target - coins[i], coins, path + coins[i] + " ");
            }
        }
    }
}
