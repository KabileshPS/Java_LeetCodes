class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int k = primes.length;
        long[] dp = new long[n];
        int[] idx = new int[k];
        
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
         long next = Integer.MAX_VALUE;
                for (int j = 0; j < k; j++) {
                next = Math.min(next, (long)primes[j] * dp[idx[j]]);
            }
                dp[i] = next;
            for (int j = 0; j < k; j++) {
                if (primes[j] * dp[idx[j]] == next) {
                    idx[j]++;
                   }
                }
        }
        return (int)dp[n - 1];
    }
}