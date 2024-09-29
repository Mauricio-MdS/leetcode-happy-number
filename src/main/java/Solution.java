class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = squareOfDigits(slow);
            fast = squareOfDigits(squareOfDigits(fast));
        } while (slow != fast);

        return slow == 1;
    }

    private int squareOfDigits(int n) {
        int sumOfSquares = 0;
        while (n != 0) {
            int digit = n % 10;
            sumOfSquares += digit * digit;
            n /= 10;
        }
        return sumOfSquares;
    }
}