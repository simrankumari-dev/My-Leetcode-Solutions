class Solution {
    public int fib(int n) {
        if (n == 0) return 0; // Base case 1
        if (n == 1) return 1; // Base case 2
        
        int a = 0, b = 1; // F(0) = 0, F(1) = 1
        for (int i = 2; i <= n; i++) {
            int temp = a + b; // Current Fibonacci number
            a = b; // Move forward
            b = temp;
        }
        return b;
    }
}
