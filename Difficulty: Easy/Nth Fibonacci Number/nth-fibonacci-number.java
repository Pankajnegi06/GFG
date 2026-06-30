class Solution {

    public int fibonacci(int n, int first, int second) {
        if (n == 0)
            return first;

        return fibonacci(n - 1, second, first + second);
    }

    public int nthFibonacci(int n) {
        return fibonacci(n, 0, 1);
    }
}