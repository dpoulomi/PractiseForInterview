package whatnot;

public class MinimalNoofCoins {
    public static void main(String[] args) {
        int val = 15;
        int[] coins = {1, 3, 9, 10};
        MinimalNoofCoins minimalNoofCoins = new MinimalNoofCoins();
        minimalNoofCoins.getMinimumNumberOfCoins(val, coins);
    }

    private void getMinimumNumberOfCoins(int val, int[] coins) {
        int m = val;
        int n = coins.length;
        int[] arr = new int[m + 1];
        int max = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 1; i <= m; i++) {
            count = max;
            for (int j = 1; j < n; j++) {
                if (i - coins[j] >= 0 && count > arr[i - coins[j]]) {

                    count = arr[i - coins[j]];
                }
            }
            if (count < max)
                arr[i] = count + 1;
            else
                arr[i] = max;

        }
        System.out.println(arr[m]);
    }
}
