class Solution {
    public boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            int numsquare = 0;

            while (n > 0) {
                int digit = n % 10;
                numsquare += digit * digit;
                n /= 10;
            }

            n = numsquare;
        }

        return n == 1;
    }
}