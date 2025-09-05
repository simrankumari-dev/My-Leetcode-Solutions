import java.util.*;

class Solution {
    public int distinctPrimeFactors(int[] nums) {
        Set<Integer> primes = new HashSet<>();

        for (int num : nums) {
            int n = num;

            // Factorize num
            for (int p = 2; p * p <= n; p++) {
                while (n % p == 0) {
                    primes.add(p);
                    n /= p;
                }
            }

            // If n is still > 1, it is prime
            if (n > 1) {
                primes.add(n);
            }
        }

        return primes.size();
    }
}
