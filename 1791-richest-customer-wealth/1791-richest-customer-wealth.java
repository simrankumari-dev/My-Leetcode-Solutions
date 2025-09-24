class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0; // Initialize max wealth to 0

        // Iterate through each customer's accounts
        for (int[] customerAccounts : accounts) {
            int currentWealth = 0; // Initialize current customer's wealth to 0

            // Sum up the money in all of the current customer's accounts
            for (int accountBalance : customerAccounts) {
                currentWealth += accountBalance;
            }

            // Update maxWealth if the current customer's wealth is greater
            if (currentWealth > maxWealth) {
                maxWealth = currentWealth;
            }
        }

        return maxWealth;
    }
}